package com.example.quizapp.ui.activity.fragment

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quizapp.Constants
import com.example.quizapp.R
import com.example.quizapp.data.QuestionGenerator
import com.example.quizapp.data.local.AppSharedPreferences
import com.example.quizapp.databinding.FragmentTestScreenBinding
import com.example.quizapp.ui.activity.adapter.TestAdapter
import com.example.quizapp.ui.activity.adapter.TestItemListener
import java.math.RoundingMode
import java.text.DecimalFormat


private const val ONE_MINUTE_IN_MILLIS = 60000
private const val TEN_MINUTES = 10
private const val TEN_SECONDS = 10
private const val DECIMAL_FORMAT_PATTERN = "#.##"

class TestScreenFragment : Fragment(), TestItemListener {

    private lateinit var binding: FragmentTestScreenBinding
    private lateinit var appSharedPreferences: AppSharedPreferences
    private lateinit var timer: CountDownTimer
    private val args: TestScreenFragmentArgs by navArgs()
    private var adapter = TestAdapter(this)
    private var timeInMills = 0L
    private var isColorized = false
    private var assessment: String = Constants.EMPTY_STRING
    private var moduleName: String = Constants.EMPTY_STRING

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestScreenBinding.inflate(inflater, container, false)
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = adapter
        setCountdownTimer()
        openChosenTest()
        onButtonSubmitClicked()
        onButtonCheckClicked()
        onButtonExitClicked()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        appSharedPreferences = AppSharedPreferences.getInstance(requireContext())
        onButtonShareClicked()
    }

    override fun onStart() {
        super.onStart()
        timer.start()
    }

    override fun onStop() {
        super.onStop()
        timer.cancel()
    }

    private fun setCountdownTimer() {
        timer = object : CountDownTimer(((args.time.toLong() * ONE_MINUTE_IN_MILLIS)), 1000) {
            override fun onTick(remaining: Long) {
                timeInMills = remaining
                val minute = (timeInMills / 1000) / 60
                val seconds = (timeInMills / 1000) % 60
                if (timeInMills < ONE_MINUTE_IN_MILLIS) {
                    binding.txtTime.setTextColor(
                        ContextCompat.getColor(
                            requireContext(),
                            R.color.red
                        )
                    )
                }
                when {
                    minute < TEN_MINUTES && seconds < TEN_SECONDS -> {
                        binding.txtTime.text = "0" + "$minute:" + "0" + "$seconds"
                    }
                    minute < TEN_MINUTES -> {
                        binding.txtTime.text = "0" + "$minute:$seconds"
                    }
                    seconds < TEN_SECONDS -> {
                        binding.txtTime.text = "$minute:" + "0" + "$seconds"
                    }
                    else -> {
                        binding.txtTime.text = "$minute:$seconds"
                    }
                }
            }

            override fun onFinish() {
                openResultLayout()
            }
        }
    }

    private fun openChosenTest() {
        when (args.testId) {
            1 -> {
                adapter.setItems(
                    QuestionGenerator().getFirstModuleQuestions().shuffled()
                        .takeLast(args.numberOfQuestions)
                )
                moduleName = getString(R.string.module_1_name)
            }
            2 -> {
                adapter.setItems(
                    QuestionGenerator().getSecondModuleQuestions().shuffled()
                        .takeLast(args.numberOfQuestions)
                )
                moduleName = getString(R.string.module_2_name)
            }
            3 -> {
                adapter.setItems(
                    QuestionGenerator().getThirdModuleQuestions().shuffled()
                        .takeLast(args.numberOfQuestions)
                )
                moduleName = getString(R.string.module_3_name)
            }
            4 -> {
                adapter.setItems(
                    QuestionGenerator().getFourthModuleQuestions().shuffled()
                        .takeLast(args.numberOfQuestions)
                )
                moduleName = getString(R.string.module_5_name)
            }
            5 -> {
                adapter.setItems(
                    QuestionGenerator().getFifthModuleQuestions().shuffled()
                        .takeLast(args.numberOfQuestions)
                )
                moduleName = getString(R.string.module_5_name)
            }
            6 -> {
                adapter.setItems(
                    QuestionGenerator().getSixthModuleQuestions().shuffled()
                        .takeLast(args.numberOfQuestions)
                )
                moduleName = getString(R.string.module_6_name)
            }
            else -> {
                adapter.setItems(
                    QuestionGenerator().getFirstModuleQuestions().shuffled()
                        .takeLast(args.numberOfQuestions)
                )
            }
        }
    }

    override fun isReadyToColorizedAnswers() = isColorized

    private fun askUserToSubmitTest() =
        AlertDialog.Builder(requireContext())
            .setMessage(getString(R.string.are_you_submit))
            .setCancelable(false)
            .setPositiveButton(getString(R.string.yes)) { dialog, _ ->
                openResultLayout()
                dialog.dismiss()
            }
            .setNegativeButton(getString(R.string.no), null)
            .create()
            .show()

    private fun openResultLayout() {
        isColorized = true
        binding.txtTime.visibility = View.GONE
        binding.testViewsParent.visibility = View.GONE
        binding.scoreViews.visibility = View.VISIBLE
        finishTest()
    }

    private fun onButtonSubmitClicked() =
        binding.btnSubmitTest.setOnClickListener {
            finishTest()
            askUserToSubmitTest()
            adapter.isButtonTakeClicked(true)
        }

    private fun finishTest() {
        val points = adapter.getItems().flatMap { it.answers }
            .filter { it.isSelected && it.isCorrect }.size
        saveProgress(getCalculatedAssessment(points, args.numberOfQuestions))
        assessment = calculatedAssessmentWithPrefix(points, args.numberOfQuestions)
        binding.scoreBoardLayout.txtAssessment.text = assessment
        binding.scoreBoardLayout.txtFinalScore.text =
            getString(R.string.score, points.toString(), args.numberOfQuestions.toString())
        binding.scoreBoardLayout.txtPreviousResult.text =
            getString(R.string.the_best_result, getResultOfChosenModule())
    }

    private fun getResultOfChosenModule(): String {
        return when (args.testId) {
            1 -> appSharedPreferences.getLastAssessmentModule1().toString()
            2 -> appSharedPreferences.getLastAssessmentModule2().toString()
            3 -> appSharedPreferences.getLastAssessmentModule3().toString()
            4 -> appSharedPreferences.getLastAssessmentModule4().toString()
            5 -> appSharedPreferences.getLastAssessmentModule5().toString()
            6 -> appSharedPreferences.getLastAssessmentModule6().toString()
            else -> appSharedPreferences.getLastAssessmentModule1().toString()
        }
    }

    private fun saveProgress(assessment: Float) {
        when (args.testId) {
            1 -> {
                if (isThereProgress(
                        appSharedPreferences.getLastAssessmentModule1(),
                        assessment
                    )
                ) appSharedPreferences.saveAssessmentModule1(assessment)
            }
            2 -> {
                if (isThereProgress(
                        appSharedPreferences.getLastAssessmentModule2(),
                        assessment
                    )
                ) appSharedPreferences.saveAssessmentModule2(assessment)
            }
            3 -> {
                if (isThereProgress(
                        appSharedPreferences.getLastAssessmentModule3(),
                        assessment
                    )
                ) appSharedPreferences.saveAssessmentModule3(assessment)
            }
            4 -> {
                if (isThereProgress(
                        appSharedPreferences.getLastAssessmentModule4(),
                        assessment
                    )
                ) appSharedPreferences.saveAssessmentModule4(assessment)
            }
            5 -> {
                if (isThereProgress(
                        appSharedPreferences.getLastAssessmentModule5(),
                        assessment
                    )
                ) appSharedPreferences.saveAssessmentModule5(assessment)
            }
            6 -> {
                if (isThereProgress(
                        appSharedPreferences.getLastAssessmentModule6(),
                        assessment
                    )
                ) appSharedPreferences.saveAssessmentModule6(assessment)
            }
        }
    }

    private fun isThereProgress(bestAssessment: Float, currentAssessment: Float) =
        currentAssessment > bestAssessment

    private fun getCalculatedAssessment(correctAnswers: Int, allQuestions: Int): Float {
        val calculatedAssessment = 2 + (4 * correctAnswers) / (allQuestions).toFloat()
        val decimalFormat = DecimalFormat(DECIMAL_FORMAT_PATTERN)
        decimalFormat.roundingMode = RoundingMode.FLOOR
        return decimalFormat.format(calculatedAssessment).toFloat()
    }

    private fun calculatedAssessmentWithPrefix(correctAnswers: Int, allQuestions: Int) =
        addedPrefixToCalculatedAssessment(
            getCalculatedAssessment(
                correctAnswers,
                allQuestions
            )
        ) + getCalculatedAssessment(correctAnswers, allQuestions).toString()

    private fun addedPrefixToCalculatedAssessment(assessment: Float): String {
        when {
            assessment >= 3.0 && assessment < 3.5 -> {
                showFailureImage()
                return getString(R.string.average)
            }
            assessment >= 3.5 && assessment < 4.5 -> {
                showSuccessImage()
                return getString(R.string.well)
            }
            assessment >= 4.5 && assessment < 5.5 -> {
                showSuccessImage()
                return getString(R.string.well_done)
            }
            assessment >= 5.5 -> {
                showSuccessImage()
                return getString(R.string.exellent)
            }
            else -> {
                showFailureImage()
                return getString(R.string.low)
            }
        }
    }

    private fun showSuccessImage() {
        binding.scoreBoardLayout.imgSuccess.visibility = View.VISIBLE
        binding.scoreBoardLayout.imgFail.visibility = View.GONE
    }

    private fun showFailureImage() {
        binding.scoreBoardLayout.imgSuccess.visibility = View.GONE
        binding.scoreBoardLayout.imgFail.visibility = View.VISIBLE
    }

    private fun onButtonCheckClicked() =
        binding.scoreBoardLayout.btnCheck.setOnClickListener {
            binding.testViewsParent.visibility = View.VISIBLE
            binding.scoreViews.visibility = View.GONE
            binding.imgTimer.visibility = View.GONE
            binding.btnSubmitTest.visibility = View.GONE
            adapter.notifyDataSetChanged()
        }

    private fun onButtonExitClicked() =
        binding.scoreBoardLayout.btnExit.setOnClickListener {
            findNavController().navigate(
                TestScreenFragmentDirections.actionTestScreenFragmentToModuleScreenFragment()
            )
        }

    private fun onButtonShareClicked() =
        binding.scoreBoardLayout.imgShare.setOnClickListener {
            shareAssessment()
        }

    private fun shareAssessment() {
        val sendIntent = Intent()
        sendIntent.action = Intent.ACTION_SEND
        sendIntent.putExtra(
            Intent.EXTRA_TEXT,
            "$moduleName оценка: $assessment"
        )
        sendIntent.type = "text/plain"
        val shareIntent = Intent.createChooser(sendIntent, null)
        startActivity(shareIntent)
    }
}
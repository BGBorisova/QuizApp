package com.example.quizapp.ui.activity.fragment

import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quizapp.data.Question
import com.example.quizapp.data.QuestionGenerator
import com.example.quizapp.databinding.FragmentTestScreenBinding
import com.example.quizapp.ui.activity.adapter.TestAdapter
import com.example.quizapp.ui.activity.adapter.TestItemListener


class TestScreenFragment : Fragment(), TestItemListener {

    private lateinit var binding: FragmentTestScreenBinding
    private val args: TestScreenFragmentArgs by navArgs()
    private var adapter = TestAdapter(this)
    private lateinit var timer: CountDownTimer
    private var timeInMills = 0L

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestScreenBinding.inflate(inflater, container, false)
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = adapter
        openChosenTest()
        setCountdownTimer()
        onButtonCheckClicked()
        return binding.root
    }

    private fun onButtonCheckClicked() {
        binding.btnTake.setOnClickListener {
            //alertDialog
            //if click yes show result
            //if you want to check answers ->hide result screen and show them
            adapter.isButtonTakeClicked(true)
            adapter.notifyDataSetChanged()
        }
    }

    private fun setCountdownTimer() {
        timer = object : CountDownTimer(((args.time.toLong() * 60000)), 1000) {
            override fun onTick(remaining: Long) {
                timeInMills = remaining
                val minute = (timeInMills / 1000) / 60
                val seconds = (timeInMills / 1000) % 60
                if (timeInMills < 60000) {
                    binding.txtTime.setTextColor(resources.getColor(android.R.color.holo_red_dark))
                }
                when {
                    minute < 10 && seconds < 10 -> {
                        binding.txtTime.text = "0" + "$minute:" + "0" + "$seconds"
                    }
                    minute < 10 && seconds > 9 -> {
                        binding.txtTime.text = "0" + "$minute:$seconds"
                    }
                    minute > 9 && seconds < 10 -> {
                        binding.txtTime.text = "$minute:" + "0" + "$seconds"
                    }
                    else -> {
                        binding.txtTime.text = "$minute:$seconds"
                    }
                }
            }

            override fun onFinish() {
                //save score
                //go to score screen with result
                Toast.makeText(requireContext(), "Cancel", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun openChosenTest() {
        when (args.testId) {
            1 -> {
                adapter.setItems(
                    QuestionGenerator().getFirstModuleQuestions()
                        .shuffled()
                        .takeLast(args.numberOfQuestions)
                )
            }
            2 -> {
                adapter.setItems(
                    QuestionGenerator().getSecondModuleQuestions()
                        .shuffled()
                        .takeLast(args.numberOfQuestions)
                )
            }
            3 -> {
                adapter.setItems(
                    QuestionGenerator().getThirdModuleQuestions().shuffled()
                        .takeLast(args.numberOfQuestions)
                )
            }
            4 -> {
                adapter.setItems(
                    QuestionGenerator().getFourthModuleQuestions().shuffled()
                        .takeLast(args.numberOfQuestions)
                )
            }
            5 -> {
                adapter.setItems(
                    QuestionGenerator().getFifthModuleQuestions().shuffled()
                        .takeLast(args.numberOfQuestions)
                )
            }
            6 -> {
                adapter.setItems(
                    QuestionGenerator().getSixthModuleQuestions().shuffled()
                        .takeLast(args.numberOfQuestions)
                )
            }
            else -> {
                adapter.setItems(
                    QuestionGenerator().getFirstModuleQuestions().shuffled()
                        .takeLast(args.numberOfQuestions)
                )
            }
        }
        Log.d("HHH", "${args.testId}")
    }

    override fun onItemSelected(item: Question) {

    }
}
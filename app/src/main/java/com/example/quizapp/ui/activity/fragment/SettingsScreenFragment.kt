package com.example.quizapp.ui.activity.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.quizapp.R
import com.example.quizapp.databinding.FragmentSettingsScreenBinding
import kotlin.properties.Delegates

private const val DEFAULT_NUMBER_OF_QUESTIONS = 10
private const val FIFTEEN_QUESTIONS = 15
private const val TWENTY_QUESTIONS = 20
private const val MIN_VALUE_OF_PICKER = 10
private const val MAX_VALUE_OF_PICKER = 30

class SettingsScreenFragment : Fragment() {

    private lateinit var binding: FragmentSettingsScreenBinding
    private val args: SettingsScreenFragmentArgs by navArgs()
    private var testId by Delegates.notNull<Int>()
    private var testTime = 20
    private var numberOfQuestions = DEFAULT_NUMBER_OF_QUESTIONS


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentSettingsScreenBinding.inflate(inflater, container, false)
        testId = args.testId
        setQuestionClickListeners()
        setNumberPicker()
        onStartButtonClicked()
        return binding.root
    }

    private fun setNumberOfQuestions(numberOfQuestions: Int) {
        this.numberOfQuestions = numberOfQuestions
    }

    private fun setQuestionClickListeners() {
        binding.txtTake10.setOnClickListener {
            setNumberOfQuestions(DEFAULT_NUMBER_OF_QUESTIONS)
            binding.txtTake10.setBackgroundResource(R.drawable.background_selected_numbers)
            binding.txtTake15.setBackgroundResource(R.drawable.background_unselected_numbers)
            binding.txtTake20.setBackgroundResource(R.drawable.background_unselected_numbers)
        }
        binding.txtTake15.setOnClickListener {
            setNumberOfQuestions(FIFTEEN_QUESTIONS)
            binding.txtTake10.setBackgroundResource(R.drawable.background_unselected_numbers)
            binding.txtTake15.setBackgroundResource(R.drawable.background_selected_numbers)
            binding.txtTake20.setBackgroundResource(R.drawable.background_unselected_numbers)
        }
        binding.txtTake20.setOnClickListener {
            setNumberOfQuestions(TWENTY_QUESTIONS)
            binding.txtTake10.setBackgroundResource(R.drawable.background_unselected_numbers)
            binding.txtTake15.setBackgroundResource(R.drawable.background_unselected_numbers)
            binding.txtTake20.setBackgroundResource(R.drawable.background_selected_numbers)
        }
    }

    private fun setNumberPicker() {
        binding.numberPicker.minValue = MIN_VALUE_OF_PICKER
        binding.numberPicker.maxValue = MAX_VALUE_OF_PICKER
        binding.numberPicker.setOnValueChangedListener { numberPicker, i, i2 ->
            testTime = numberPicker.value
        }
    }

    private fun onStartButtonClicked() =
        binding.btnStart.setOnClickListener {
            startTest()
        }

    private fun startTest() =
        findNavController().navigate(
            SettingsScreenFragmentDirections.actionSettingsScreenFragmentToTestScreenFragment(
                testId,
                numberOfQuestions,
                testTime
            )
        )
}
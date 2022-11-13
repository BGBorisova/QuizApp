package com.example.quizapp.ui.activity.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quizapp.Constants.EIGHT_CLASS
import com.example.quizapp.Constants.NINTH_CLASS
import com.example.quizapp.data.Question
import com.example.quizapp.data.QuestionGenerator
import com.example.quizapp.databinding.FragmentTestScreenBinding
import com.example.quizapp.ui.activity.adapter.TestAdapter
import com.example.quizapp.ui.activity.adapter.TestItemListener

private const val NUMBER_OF_EIGHT_CLASS_MODULES = 10
private const val DEFAULT_NUMBER_OF_QUESTIONS = 10

class TestScreenFragment : Fragment(), TestItemListener {

    private lateinit var binding: FragmentTestScreenBinding
    private val args: TestScreenFragmentArgs by navArgs()
    private var adapter = TestAdapter(this)
    private var numberOfQuestions = DEFAULT_NUMBER_OF_QUESTIONS

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestScreenBinding.inflate(inflater, container, false)
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = adapter
//        testQuestionNumbers()
        startTest()
        onBackPressed()
        return binding.root
    }


    private fun onBackPressed() =
        activity?.onBackPressedDispatcher?.addCallback(viewLifecycleOwner) {
            findNavController().navigate(
                TestScreenFragmentDirections.actionTestScreenFragmentToModuleScreenFragment(
                    if (args.testId <= NUMBER_OF_EIGHT_CLASS_MODULES) EIGHT_CLASS else NINTH_CLASS
                )
            )
        }


    private fun startTest() {
        binding.txtTest.setOnClickListener {
            openChosenTest()
        }
    }

    private fun testQuestionNumbers() {
        binding.txtTake10.setOnClickListener {
            setNumberOfQuestions(2)
            startTest()
        }

        binding.txtTake15.setOnClickListener {
            setNumberOfQuestions(4)
            startTest()
        }

        binding.txtTake20.setOnClickListener {
            setNumberOfQuestions(6)
            startTest()
        }
    }

    private fun setNumberOfQuestions(numberOfQuestions: Int) {
        this.numberOfQuestions = numberOfQuestions
    }

    private fun openChosenTest() {
        when (args.testId) {
            1 -> {
                adapter.setItems(
                    QuestionGenerator().getFirstModuleQuestions()
//                        .shuffled()
//                        .takeLast(numberOfQuestions)
                )
            }
            2 -> {
                adapter.setItems(QuestionGenerator().getSecondModuleQuestions())
            }
            3 -> {
                adapter.setItems(QuestionGenerator().getThirdModuleQuestions())
            }
            else -> {
                binding.txtTest.text = "1"
            }
        }

        Log.d("HHH", "${args.testId}")
    }


    override fun onItemSelected(item: Question) {}
}
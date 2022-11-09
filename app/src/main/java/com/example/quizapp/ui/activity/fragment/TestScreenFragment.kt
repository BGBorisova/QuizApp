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

class TestScreenFragment : Fragment(), TestItemListener {

    private lateinit var binding: FragmentTestScreenBinding
    private val args: TestScreenFragmentArgs by navArgs()
    private var adapter = TestAdapter(this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestScreenBinding.inflate(inflater, container, false)
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = adapter
        setTest()
//        openChosenTest()
        onBackPressed()
        return binding.root
    }

    private fun setTest() {
        binding.txtTest.setOnClickListener {
            openChosenTest()
        }
    }

    private fun getQuestions(): List<Question> {
        val questions = QuestionGenerator().getAllQuestions()
        when (args.testId) {
            1 -> {
                questions.takeIf { questions.any { it.id == 1 } }?.shuffled()?.takeLast(3)
            }
            2 -> {
                questions.takeIf { questions.any { it.id == 2 } }?.shuffled()?.takeLast(3)
            }
//            else -> {
//                questions.takeIf { it }.shuffled().takeLast(3)
//            }
        }
        return questions.toList()
    }

    private fun onBackPressed() =
        activity?.onBackPressedDispatcher?.addCallback(viewLifecycleOwner) {
            findNavController().navigate(
                TestScreenFragmentDirections.actionTestScreenFragmentToModuleScreenFragment(
                    if (args.testId <= NUMBER_OF_EIGHT_CLASS_MODULES) EIGHT_CLASS else NINTH_CLASS
                )
            )
        }

    private fun openChosenTest() {
        when (args.testId) {
            args.testId -> {
                adapter.setItems(getQuestions())
            }
            else -> {
                binding.txtTest.text = "1"
            }
        }
        Log.d("HHH", "${args.testId}")
    }

    override fun onItemSelected(item: Question) {}
}
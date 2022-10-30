package com.example.quizapp.ui.activity.fragment

import android.os.Bundle
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
        adapter.setItems(getQuestions())
        openChosenTest()
        onBackPressed()
        return binding.root
    }

    private fun getQuestions(): List<Question> {
        return listOf(
            Question(id=1,"Колко е 5 + 5",true),
            Question(id=1,"Колко е 5 + 5",true),
            Question(id=1,"Колко е 5 + 5",true),
            Question(id=1,"Колко е 5 + 5",true),
            Question(id=1,"Колко е 5 + 5",true),
            Question(id=1,"Колко е 5 + 5",true),
            Question(id=1,"Колко е 5 + 5",true),
            Question(id=1,"Колко е 5 + 5",true),
            Question(id=1,"Колко е 5 + 5",true),
            Question(id=1,"Колко е 5 + 5",true),
            Question(id=1,"Колко е 5 + 5",true),
            Question(id=1,"Колко е 5 + 5",true),
            Question(id=1,"Колко е 5 + 5",true),
            Question(id=1,"Колко е 5 + 5",true),
        )
    }

    private fun onBackPressed() =
        activity?.onBackPressedDispatcher?.addCallback(viewLifecycleOwner) {
            findNavController().navigate(
                TestScreenFragmentDirections.actionTestScreenFragmentToModuleScreenFragment(
                    if (args.testId <= NUMBER_OF_EIGHT_CLASS_MODULES) EIGHT_CLASS else NINTH_CLASS
                )
            )
        }

    private fun openChosenTest() =
        when (args.testId) {
            args.testId -> {
                binding.txtTest.text = args.testId.toString()
            }
            else -> {
                binding.txtTest.text = "1"
            }
        }

    override fun onItemSelected(item: Question) {}
}
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
import com.example.quizapp.Constants.EIGHT_CLASS
import com.example.quizapp.Constants.NINTH_CLASS
import com.example.quizapp.R
import com.example.quizapp.databinding.FragmentTestScreenBinding

private const val NUMBER_OF_EIGHT_CLASS_MODULES = 10

class TestScreenFragment : Fragment() {

    private lateinit var binding: FragmentTestScreenBinding
    private val args: TestScreenFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestScreenBinding.inflate(inflater, container, false)
        openChosenTest()
        onBackPressed()
        return binding.root
    }

    private fun onBackPressed() =
        activity?.onBackPressedDispatcher?.addCallback(viewLifecycleOwner) {
            findNavController().navigate(
                TestScreenFragmentDirections.actionTestScreenFragmentToModuleScreenFragment(
                    if (args.test <= NUMBER_OF_EIGHT_CLASS_MODULES) EIGHT_CLASS else NINTH_CLASS
                )
            )
        }

    private fun openChosenTest() =
        when (args.test) {
            1 -> {
                binding.txtTest.text = "1"
            }
            2 -> {
                binding.txtTest.text = "2"
            }
            else -> {
                binding.txtTest.text = "3"
            }
        }
}
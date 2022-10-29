package com.example.quizapp.ui.activity.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.quizapp.databinding.FragmentTestScreenBinding


class TestScreenFragment : Fragment() {

    private lateinit var binding: FragmentTestScreenBinding
    private val args: TestScreenFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestScreenBinding.inflate(inflater, container, false)
        openChosenTest()
        return binding.root
    }

    private fun openChosenTest() {
        Log.d("HHH","${args.test}")
        when (args.test) {
            1 -> {
                binding.txtTest.text="1"
            }
            2 -> {
                binding.txtTest.text="2"
            }
            else -> {
                binding.txtTest.text="3"
            }
        }
    }
}
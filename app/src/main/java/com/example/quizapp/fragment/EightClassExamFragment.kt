package com.example.quizapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.quizapp.databinding.FragmentEightClassExamBinding

class EightClassExamFragment : Fragment() {

    private lateinit var binding: FragmentEightClassExamBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEightClassExamBinding.inflate(inflater, container, false)
        return binding.root
    }
}


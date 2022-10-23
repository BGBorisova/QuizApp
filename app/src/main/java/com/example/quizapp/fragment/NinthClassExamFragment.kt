package com.example.quizapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.quizapp.databinding.FragmentNinthClassExamBinding


class NinthClassExamFragment : Fragment() {

    private lateinit var binding: FragmentNinthClassExamBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNinthClassExamBinding.inflate(inflater, container, false)
        return binding.root
    }
}
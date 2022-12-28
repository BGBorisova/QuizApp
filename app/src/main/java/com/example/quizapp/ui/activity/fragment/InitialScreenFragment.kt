package com.example.quizapp.ui.activity.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.quizapp.R
import com.example.quizapp.data.InitialView
import com.example.quizapp.databinding.FragmentInitialScreenBinding
import com.google.android.material.tabs.TabLayoutMediator
import org.relaxifyapp.me.adapters.initial.InitialAdapter

class InitialScreenFragment : Fragment() {

    private lateinit var binding: FragmentInitialScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInitialScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewPager()
        onContinueButtonClicked()
    }

    private fun onContinueButtonClicked() =
        binding.btnContinue.setOnClickListener {
            findNavController().navigate(
                InitialScreenFragmentDirections.actionInitialScreenFragmentToModuleScreenFragment()
            )
        }

    private fun initViewPager() {
        val adapter = InitialAdapter()
        adapter.setItems(getItems())
        binding.initialViewPager.adapter = adapter
        TabLayoutMediator(binding.initialTabLayout, binding.initialViewPager) { _, _ ->
        }.attach()
    }

    private fun getItems() = listOf(
        InitialView(
            R.drawable.ic_initial_1,
            getString(R.string.initial_text_1)
        ),
        InitialView(
            R.drawable.ic_initial_2,
            getString(R.string.initial_text_2)
        ),
        InitialView(
            R.drawable.ic_initial_3,
            getString(R.string.initial_text_3)
        ),
        InitialView(
            R.drawable.ic_initial_4,
            getString(R.string.initial_text_4)
        )
    )
}
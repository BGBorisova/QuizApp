package com.example.quizapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.quizapp.databinding.FragmentMainScreenBinding


class MainScreenFragment : Fragment() {

    private lateinit var binding: FragmentMainScreenBinding
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onEightClassButtonClicked()
        onNinthClassButtonClicked()
    }

    private fun onEightClassButtonClicked() =
        binding.btn8class.setOnClickListener {
            enabledContinueButton(true)
            enabledEightClass(true)
            enabledNinthClass(false)
        }

    private fun onNinthClassButtonClicked() =
        binding.btn9class.setOnClickListener {
            enabledContinueButton(true)
            enabledNinthClass(true)
            enabledEightClass(false)
        }

    private fun enabledEightClass(isEnabled: Boolean) =
        if (isEnabled) {
            binding.btn8class.backgroundTintList =
                ContextCompat.getColorStateList(requireContext(), R.color.dark_orange)
        } else {
            binding.btn8class.backgroundTintList =
                ContextCompat.getColorStateList(requireContext(), R.color.light_orange)
        }

    private fun enabledNinthClass(isEnabled: Boolean) =
        if (isEnabled) binding.btn9class.backgroundTintList =
            ContextCompat.getColorStateList(requireContext(), R.color.dark_orange)
        else binding.btn9class.backgroundTintList =
            ContextCompat.getColorStateList(requireContext(), R.color.light_orange)

    private fun enabledContinueButton(isEnabled: Boolean) {
        binding.btnContinue.isEnabled = isEnabled
        if (binding.btnContinue.isEnabled) binding.btnContinue.backgroundTintList =
            ContextCompat.getColorStateList(requireContext(), R.color.dark_orange)
        else binding.btnContinue.backgroundTintList =
            ContextCompat.getColorStateList(requireContext(), R.color.light_orange)
    }
}
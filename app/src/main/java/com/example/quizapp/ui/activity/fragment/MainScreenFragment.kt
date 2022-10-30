package com.example.quizapp.ui.activity.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.quizapp.Constants
import com.example.quizapp.Constants.EIGHT_CLASS
import com.example.quizapp.Constants.NINTH_CLASS
import com.example.quizapp.R
import com.example.quizapp.databinding.FragmentMainScreenBinding


class MainScreenFragment : Fragment() {

    private lateinit var binding: FragmentMainScreenBinding
    private var isEightClassEnabled = false
    private var isNinthClassEnabled = false

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
        onContinueButtonClicked()
    }

    private fun onEightClassButtonClicked() =
        binding.btn8class.setOnClickListener {
            isEightClassEnabled = true
            isNinthClassEnabled = false
            enabledContinueButton(true)
            enabledEightClass(true)
            enabledNinthClass(false)
        }

    private fun onNinthClassButtonClicked() =
        binding.btn9class.setOnClickListener {
            isEightClassEnabled = false
            isNinthClassEnabled = true
            enabledContinueButton(true)
            enabledNinthClass(true)
            enabledEightClass(false)
        }

    private fun onContinueButtonClicked() =
        binding.btnContinue.setOnClickListener {
            val openChosenClass = if (isEightClassEnabled) {
                EIGHT_CLASS
            } else {
                NINTH_CLASS
            }
            findNavController().navigate(
                MainScreenFragmentDirections.actionMainScreenFragmentToModuleScreenFragment(
                    openChosenClass
                )
            )
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
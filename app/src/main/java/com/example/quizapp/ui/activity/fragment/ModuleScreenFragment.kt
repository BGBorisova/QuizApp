package com.example.quizapp.ui.activity.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quizapp.R
import com.example.quizapp.data.Module
import com.example.quizapp.databinding.FragmentModuleScreenBinding
import com.example.quizapp.ui.activity.adapter.ItemListener
import com.example.quizapp.ui.activity.adapter.ModuleAdapter

class ModuleScreenFragment : Fragment(), ItemListener {

    private lateinit var binding: FragmentModuleScreenBinding
    private val backArgs: ModuleScreenFragmentArgs by navArgs()
    private var adapter = ModuleAdapter(this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentModuleScreenBinding.inflate(inflater, container, false)
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = adapter
        binding.lifecycleOwner = this
        adapter.setItems(getItems())
        return binding.root
    }

    private fun getItems() =
        listOf(
            Module(moduleId = 1, "Основи на информатиката"),
            Module(moduleId = 2, "Среда за визуално програмиране"),
            Module(moduleId = 3, "Програмиране. Основни типове данни"),
            Module(moduleId = 4, "Програмиране на разклонени и циклични алгоритми"),
            Module(moduleId = 5, "Съставни типове данни"),
            Module(moduleId = 6, "Създаване на софтуерен проект"),
        )

    private fun enabledStartButton(isEnabled: Boolean) {
        binding.btnStart.isEnabled = isEnabled
        if (binding.btnStart.isEnabled) binding.btnStart.backgroundTintList =
            ContextCompat.getColorStateList(requireContext(), R.color.dark_purple)
        else binding.btnStart.backgroundTintList =
            ContextCompat.getColorStateList(requireContext(), R.color.light_purple)
    }

    override fun onItemSelected(item: Module) {
        enabledStartButton(true)
        onStartButtonClicked(item)
    }

    private fun onStartButtonClicked(item: Module) {
        binding.btnStart.setOnClickListener {
            findNavController().navigate(
                ModuleScreenFragmentDirections.actionModuleScreenFragmentToSettingsScreenFragment(
                    item.moduleId
                )
            )
        }
    }
}


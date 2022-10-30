package com.example.quizapp.ui.activity.fragment

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.view.children
import androidx.core.view.get
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quizapp.Constants.EIGHT_CLASS
import com.example.quizapp.R
import com.example.quizapp.data.Module
import com.example.quizapp.databinding.FragmentModuleScreenBinding
import com.example.quizapp.ui.activity.adapter.ItemListener
import com.example.quizapp.ui.activity.adapter.ModuleAdapter

class ModuleScreenFragment : Fragment(), ItemListener {

    private lateinit var binding: FragmentModuleScreenBinding
    private val args: ModuleScreenFragmentArgs by navArgs()
    private val backArgs: ModuleScreenFragmentArgs by navArgs()
    private var adapter = ModuleAdapter(this)
    private var isEightClass: Boolean? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentModuleScreenBinding.inflate(inflater, container, false)
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = adapter
        binding.lifecycleOwner = this
        openCorrectScreen()
        adapter.setItems(getItems())
        return binding.root
    }

    private fun openCorrectScreen() {
        isEightClass =
            args.classLevel.equals(EIGHT_CLASS) || (backArgs.backFromTest.equals(EIGHT_CLASS))
        when (isEightClass) {
            true -> binding.txtScreenTitle.text = getString(R.string.eight_class)
            else -> binding.txtScreenTitle.text = getString(R.string.ninth_class)
        }
    }

    private fun getItems() =
        if (isEightClass == true) {
            listOf(
                Module(moduleId = 1, "1 раздел 8"),
                Module(moduleId = 2, "2 раздел 8"),
                Module(moduleId = 3, "3 раздел 8"),
                Module(moduleId = 4, "4 раздел 8"),
                Module(moduleId = 5, "5 раздел 8"),
                Module(moduleId = 6, "6 раздел 8"),
                Module(moduleId = 7, "7 раздел 8"),
                Module(moduleId = 8, "8 раздел 8"),
                Module(moduleId = 9, "9 раздел 8"),
                Module(moduleId = 10, "10 раздел 8"),
            )
        } else {
            listOf(
                Module(moduleId = 11, "11 раздел 9"),
                Module(moduleId = 12, "12 раздел 9"),
                Module(moduleId = 13, "13 раздел 9"),
                Module(moduleId = 14, "14 раздел 9"),
                Module(moduleId = 15, "15 раздел 9"),
                Module(moduleId = 16, "16 раздел 9"),
                Module(moduleId = 17, "17 раздел 9"),
                Module(moduleId = 18, "18 раздел 9"),
                Module(moduleId = 19, "19 раздел 9"),
                Module(moduleId = 20, "20 раздел 9"),
            )
        }

    private fun enabledStartButton(isEnabled: Boolean) {
        binding.btnStart.isEnabled = isEnabled
        if (binding.btnStart.isEnabled) binding.btnStart.backgroundTintList =
            ContextCompat.getColorStateList(requireContext(), R.color.dark_orange)
        else binding.btnStart.backgroundTintList =
            ContextCompat.getColorStateList(requireContext(), R.color.light_orange)
    }

    override fun onItemSelected(item: Module) {
        Log.d("HHH","${item.moduleId}")
        enabledStartButton(true)
    }

    private fun onStartButtonClicked(item: Module) {
        binding.btnStart.setOnClickListener {
            findNavController().navigate(
                ModuleScreenFragmentDirections.actionModuleScreenFragmentToTestScreenFragment(
                    item.moduleId
                )
            )
        }
    }
}


package com.example.quizapp.ui.activity.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quizapp.R
import com.example.quizapp.data.model.Module
import com.example.quizapp.databinding.FragmentModuleScreenBinding
import com.example.quizapp.ui.activity.adapter.ItemListener
import com.example.quizapp.ui.activity.adapter.ModuleAdapter

class ModuleScreenFragment : Fragment(), ItemListener {

    private lateinit var binding: FragmentModuleScreenBinding
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
            Module(moduleId = 1, getString(R.string.module_1_name)),
            Module(moduleId = 2, getString(R.string.module_2_name)),
            Module(moduleId = 3, getString(R.string.module_3_name)),
            Module(moduleId = 4, getString(R.string.module_4_name)),
            Module(moduleId = 5, getString(R.string.module_5_name)),
            Module(moduleId = 6, getString(R.string.module_6_name)),
        )

    override fun onItemSelected(item: Module) {
        findNavController().navigate(
            ModuleScreenFragmentDirections.actionModuleScreenFragmentToSettingsScreenFragment(
                item.moduleId
            )
        )
    }
}


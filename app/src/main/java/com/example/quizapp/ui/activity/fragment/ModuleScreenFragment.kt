package com.example.quizapp.ui.activity.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quizapp.data.Module
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
            Module(moduleId = 1, "Основи на информатиката."),
            Module(moduleId = 2, "Среда за визуално програмиране."),
            Module(moduleId = 3, "Основни типове данни. Аритметични операции. Вградени функции."),
            Module(moduleId = 4, "Програмни конструкции за реализиране на разклонен алгоротъм."),
            Module(moduleId = 5, "Програмни конструкции за реализиране на циклични алгоротми."),
            Module(moduleId = 6, "Съставни типове данни. Едномерен масив."),
        )

    override fun onItemSelected(item: Module) {
        findNavController().navigate(
            ModuleScreenFragmentDirections.actionModuleScreenFragmentToSettingsScreenFragment(
                item.moduleId
            )
        )
    }
}


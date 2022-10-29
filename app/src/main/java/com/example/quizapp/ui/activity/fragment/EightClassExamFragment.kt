package com.example.quizapp.ui.activity.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quizapp.Constants.EIGHT_CLASS
import com.example.quizapp.Constants.NINTH_CLASS
import com.example.quizapp.data.Module
import com.example.quizapp.databinding.FragmentEightClassExamBinding
import com.example.quizapp.ui.activity.adapter.ItemListener
import com.example.quizapp.ui.activity.adapter.ModuleAdapter

class EightClassExamFragment : Fragment(), ItemListener {

    private lateinit var binding: FragmentEightClassExamBinding
    private val args: EightClassExamFragmentArgs by navArgs()
    private var adapter = ModuleAdapter(this)
    private var isEightClass: Boolean? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEightClassExamBinding.inflate(inflater, container, false)
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = adapter
        binding.lifecycleOwner = this
        openCorrectScreen()
        adapter.setItems(getItems())
        return binding.root
    }

    private fun openCorrectScreen() {
        isEightClass = args.classLevel.equals(EIGHT_CLASS)
        if (isEightClass == true) {
            Toast.makeText(requireContext(), EIGHT_CLASS, Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(requireContext(), NINTH_CLASS, Toast.LENGTH_SHORT).show()
        }
    }

    private fun getItems() =
        if (isEightClass == true) {
            listOf(
                Module(moduleId = 0, "Първи раздел 8"),
                Module(moduleId = 0, "Първи раздел 8"),
                Module(moduleId = 0, "Първи раздел 8"),
                Module(moduleId = 0, "Първи раздел 8"),
                Module(moduleId = 0, "Първи раздел 8"),
                Module(moduleId = 0, "Първи раздел 8"),
                Module(moduleId = 0, "Първи раздел 8"),
            )
        } else {
            listOf(
                Module(moduleId = 0, "Първи раздел 9"),
                Module(moduleId = 0, "Първи раздел 9"),
                Module(moduleId = 0, "Първи раздел 9"),
                Module(moduleId = 0, "Първи раздел 9"),
                Module(moduleId = 0, "Първи раздел 9"),
                Module(moduleId = 0, "Първи раздел 9"),
                Module(moduleId = 0, "Първи раздел 9"),
            )
        }

    override fun onItemSelected(item: Module) {}
}


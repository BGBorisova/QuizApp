package com.example.quizapp.ui.activity.fragment

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.quizapp.R
import com.example.quizapp.data.InitialView
import com.example.quizapp.databinding.FragmentMainScreenBinding
import com.google.android.material.tabs.TabLayoutMediator
import org.relaxifyapp.me.adapters.initial.InitialAdapter
import java.util.*

private const val DELAY_MS: Long = 14500
private const val PERIOD_MS: Long = 14500

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
        initViewPager()
        onContinueButtonClicked()
    }

    //    private fun onEightClassButtonClicked() =
//        binding.btn8class.setOnClickListener {
//            isEightClassEnabled = true
//            isNinthClassEnabled = false
//            enabledContinueButton(true)
//            enabledEightClass(true)
//            enabledNinthClass(false)
//        }
//
//    private fun onNinthClassButtonClicked() =
//        binding.btn9class.setOnClickListener {
//            isEightClassEnabled = false
//            isNinthClassEnabled = true
//            enabledContinueButton(true)
//            enabledNinthClass(true)
//            enabledEightClass(false)
//        }
//
    private fun onContinueButtonClicked() =
        binding.btnContinue.setOnClickListener {
            findNavController().navigate(
                MainScreenFragmentDirections.actionMainScreenFragmentToModuleScreenFragment()
            )
        }
//
//    private fun enabledEightClass(isEnabled: Boolean) =
//        if (isEnabled) {
//            binding.btn8class.backgroundTintList =
//                ContextCompat.getColorStateList(requireContext(), R.color.dark_orange)
//        } else {
//            binding.btn8class.backgroundTintList =
//                ContextCompat.getColorStateList(requireContext(), R.color.light_orange)
//        }
//
//    private fun enabledNinthClass(isEnabled: Boolean) =
//        if (isEnabled) binding.btn9class.backgroundTintList =
//            ContextCompat.getColorStateList(requireContext(), R.color.dark_orange)
//        else binding.btn9class.backgroundTintList =
//            ContextCompat.getColorStateList(requireContext(), R.color.light_orange)
//
//    private fun enabledContinueButton(isEnabled: Boolean) {
//        binding.btnContinue.isEnabled = isEnabled
//        if (binding.btnContinue.isEnabled) binding.btnContinue.backgroundTintList =
//            ContextCompat.getColorStateList(requireContext(), R.color.dark_orange)
//        else binding.btnContinue.backgroundTintList =
//            ContextCompat.getColorStateList(requireContext(), R.color.light_orange)
//    }


    private fun initViewPager() {
        val adapter = InitialAdapter()
        adapter.setItems(getItems())
        binding.initialViewPager.adapter = adapter
        TabLayoutMediator(binding.initialTabLayout, binding.initialViewPager) { _, _ ->
        }.attach()
        automateViewPagerSwiping()
    }

    private fun automateViewPagerSwiping() {
        val runnable = Runnable {
            if (binding.initialViewPager.currentItem == getItems().count() - 1) {
                binding.initialViewPager.currentItem = 0
            } else {
                binding.initialViewPager.setCurrentItem(
                    binding.initialViewPager.currentItem + 1,
                    true
                )
            }
        }
        val timer = Timer()
        timer.schedule(object : TimerTask() {
            override fun run() {
                Handler(Looper.getMainLooper()).post(runnable)
            }
        }, DELAY_MS, PERIOD_MS)
    }

    private fun getItems(): List<InitialView> {
        return listOf(
            InitialView(
                R.drawable.ic_initial_1,
                "Добре дошъл в Test IT."
            ),
            InitialView(
                R.drawable.ic_initial_2,
                "Тествай знанията си \n по Информатика."
            ),
            InitialView(
                R.drawable.ic_initial_3,
                "Предизвикай себе си."
            ),
            InitialView(
                R.drawable.ic_initial_4,
                "Проследи напредъка си."
            )
        )
    }
}
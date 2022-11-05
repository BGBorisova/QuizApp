package org.relaxifyapp.me.adapters.initial

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.data.InitialView
import com.example.quizapp.databinding.InitialScreenItemBinding

private const val FIRST_STEP = 0
private const val SECOND_STEP = 1
private const val THIRD_STEP = 2
private const val IMAGE_PADDING_ON_SECOND_STEP = -40

class InitialAdapter : RecyclerView.Adapter<InitialAdapter.InitialViewHolder>() {

    lateinit var binding: InitialScreenItemBinding
    var descriptions = arrayListOf<InitialView>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InitialViewHolder {
        binding =
            InitialScreenItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return InitialViewHolder(binding.root, binding)
    }

    override fun onBindViewHolder(holder: InitialViewHolder, position: Int) {
        val item = descriptions[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = descriptions.size

    fun setItems(initialViews: List<InitialView>) {
        if (initialViews != null) {
            descriptions.clear()
            descriptions.addAll(initialViews)
            notifyDataSetChanged()
        }
    }

    class InitialViewHolder(
        itemView: View,
        private val binding: InitialScreenItemBinding,
    ) : RecyclerView.ViewHolder(itemView) {

        fun bind(initialView: InitialView) {
            binding.txtInitialHeader.text = initialView.title
            binding.imgInitial.setImageResource(initialView.imageResourceID)
        }
    }
}
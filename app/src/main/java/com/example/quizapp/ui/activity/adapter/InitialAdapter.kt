package org.relaxifyapp.me.adapters.initial

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.data.model.InitialView
import com.example.quizapp.databinding.InitialScreenItemBinding

class InitialAdapter : RecyclerView.Adapter<InitialAdapter.InitialViewHolder>() {

    lateinit var binding: InitialScreenItemBinding
    private var descriptions = arrayListOf<InitialView>()

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
        descriptions.clear()
        descriptions.addAll(initialViews)
        notifyDataSetChanged()
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
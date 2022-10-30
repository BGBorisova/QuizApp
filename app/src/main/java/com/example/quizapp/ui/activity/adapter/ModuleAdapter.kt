package com.example.quizapp.ui.activity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.R
import com.example.quizapp.data.Module
import com.example.quizapp.databinding.ModuleItemBinding


class ModuleAdapter(private val itemListener: ItemListener) :
    RecyclerView.Adapter<ModuleAdapter.ModuleViewHolder>() {

    lateinit var binding: ModuleItemBinding
    private val items = mutableListOf<Module>()
    private var selectedItemPosition = -1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModuleViewHolder {
        binding = ModuleItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ModuleViewHolder(binding.root, binding)
    }

    override fun onBindViewHolder(holder: ModuleViewHolder, position: Int) {
//        val module = items[position]
//        holder.bind(module)
//        holder.itemView.setOnClickListener {
//            selectedItemPosition = position
//            notifyDataSetChanged()
//        }
//        if (selectedItemPosition == position)
//            holder.itemView.setBackgroundColor(Color.parseColor("#DC746C"))
//        else
//            holder.itemView.setBackgroundColor(Color.parseColor("#E49B83"))
        val module = items[position]
        holder.bind(module)
        holder.binding.btnModule.setOnClickListener {
            selectedItemPosition = position
            itemListener.onItemSelected(module)
            notifyDataSetChanged()
        }
        if (selectedItemPosition == position)
            holder.binding.btnModule.backgroundTintList =
                ContextCompat.getColorStateList(holder.itemView.context, R.color.dark_orange)
        else
            holder.binding.btnModule.backgroundTintList =
                ContextCompat.getColorStateList(holder.itemView.context, R.color.light_orange)
    }

    override fun getItemCount() = items.size

    fun setItems(modules: List<Module>) {
        items.clear()
        items.addAll(modules)
        notifyDataSetChanged()
    }

    inner class ModuleViewHolder(
        itemView: View,
        val binding: ModuleItemBinding,
    ) : RecyclerView.ViewHolder(itemView) {

        fun bind(module: Module) {
            binding.btnModule.text = module.title
        }
    }
}

interface ItemListener {
    fun onItemSelected(item: Module)
}


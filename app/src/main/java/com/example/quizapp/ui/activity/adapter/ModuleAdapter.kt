package com.example.quizapp.ui.activity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.data.Module
import com.example.quizapp.databinding.ModuleItemBinding

class ModuleAdapter(private val itemListener: ItemListener) :
    RecyclerView.Adapter<ModuleViewHolder>() {

    lateinit var binding: ModuleItemBinding
    private val items = mutableListOf<Module>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModuleViewHolder {
        binding = ModuleItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ModuleViewHolder(binding.root, binding, itemListener)
    }

    override fun onBindViewHolder(holder: ModuleViewHolder, position: Int) {
        val module = items[position]
        holder.bind(module)
    }

    override fun getItemCount() = items.size

    fun setItems(modules: List<Module>) {
        items.clear()
        items.addAll(modules)
        notifyDataSetChanged()
    }
}

class ModuleViewHolder(
    itemView: View,
    private val binding: ModuleItemBinding,
    private val itemListener: ItemListener,
) : RecyclerView.ViewHolder(itemView) {

    fun bind(module: Module) {
        binding.txtTitle.text = module.title
    }
}

interface ItemListener {
    fun onItemSelected(item: Module)
}

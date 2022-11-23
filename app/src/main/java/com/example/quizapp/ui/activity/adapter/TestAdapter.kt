package com.example.quizapp.ui.activity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.data.Question
import com.example.quizapp.databinding.TestItemBinding

private const val FIRST_ANSWER = 0
private const val SECOND_ANSWER = 1
private const val THIRD_ANSWER = 2
private const val FORTH_ANSWER = 3

class TestAdapter(private val testItemListener: TestItemListener) :
    RecyclerView.Adapter<TestAdapter.TestViewHolder>() {

    lateinit var binding: TestItemBinding
    private val items = mutableListOf<Question>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestViewHolder {
        binding = TestItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TestViewHolder(binding.root, binding)
    }

    override fun onBindViewHolder(holder: TestViewHolder, position: Int) {
        val question = items[position]
        holder.bind(question)
    }

    override fun getItemCount() = items.size

    fun setItems(tests: List<Question>) {
        items.clear()
        items.addAll(tests)
        notifyDataSetChanged()
    }

    inner class TestViewHolder(
        itemView: View,
        val binding: TestItemBinding,
    ) : RecyclerView.ViewHolder(itemView) {

        fun bind(question: Question) {
            binding.txtQuestion.text = (adapterPosition + 1).toString() + ". " + question.question
            binding.txtAnswer1.text = question.answers[FIRST_ANSWER].text
            binding.txtAnswer2.text = question.answers[SECOND_ANSWER].text
            binding.txtAnswer3.text = question.answers[THIRD_ANSWER].text
            binding.txtAnswer4.text = question.answers[FORTH_ANSWER].text
            val isCorrect = question.answers.map { it.id }
        }
    }
}

interface TestItemListener {
    fun onItemSelected(item: Question)
}


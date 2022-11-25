package com.example.quizapp.ui.activity.adapter

import android.util.Log
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
    var score = 0

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

    private var isTakeClicked = false

    fun isButtonTakeClicked(isClicked: Boolean) {
        this.isTakeClicked = isClicked
    }

    inner class TestViewHolder(
        itemView: View,
        private val binding: TestItemBinding,
    ) : RecyclerView.ViewHolder(itemView) {
        fun bind(question: Question) {
            binding.txtQuestion.text = (adapterPosition + 1).toString() + ". " + question.question
            binding.txtAnswer1.text = question.answers[FIRST_ANSWER].text
            binding.txtAnswer2.text = question.answers[SECOND_ANSWER].text
            binding.txtAnswer3.text = question.answers[THIRD_ANSWER].text
            binding.txtAnswer4.text = question.answers[FORTH_ANSWER].text
//            if (isTakeClicked) {
//                //show correct and wrong answears
//            }
            binding.txtAnswer1.setOnClickListener {
                if (question.answers[0].isCorrect) {
                    score += 1
                }
            }
            binding.txtAnswer2.setOnClickListener {
                if (question.answers[1].isCorrect) {
                    score += 1
                }
            }
            binding.txtAnswer3.setOnClickListener {

                if (question.answers[2].isCorrect) {
                    score += 1
                }
            }
            binding.txtAnswer4.setOnClickListener {

                if (question.answers[3].isCorrect) {
                    score += 1
                }
            }
            testItemListener.onFinalScoreFetched(score)
            Log.d("HHH", "$score")
        }
    }
//    if (question.answers[question.answers[0].id].isCorrect) {
//                    binding.txtAnswer1.setBackgroundColor(itemView.resources.getColor(R.color.dark_orange))
//                    binding.txtAnswer2.setBackgroundColor(itemView.resources.getColor(R.color.light_orange))
//                    binding.txtAnswer3.setBackgroundColor(itemView.resources.getColor(R.color.light_orange))
//                    binding.txtAnswer4.setBackgroundColor(itemView.resources.getColor(R.color.light_orange))
//                }
}

interface TestItemListener {
    fun onFinalScoreFetched(score: Int)
}



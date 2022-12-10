package com.example.quizapp.ui.activity.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.R
import com.example.quizapp.data.Question
import com.example.quizapp.databinding.TestItemBinding

private const val FIRST_ANSWER = 0
private const val SECOND_ANSWER = 1
private const val THIRD_ANSWER = 2
private const val FORTH_ANSWER = 3

class TestAdapter(
    private val testItemListener: TestItemListener,
    private var score: Int = 0
) :
    RecyclerView.Adapter<TestAdapter.TestViewHolder>() {

    lateinit var binding: TestItemBinding
    private val items = mutableListOf<Question>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestViewHolder {
        binding = TestItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TestViewHolder(binding.root, binding, score)
    }

    override fun onBindViewHolder(holder: TestViewHolder, position: Int) {
        val question = items[position]
        holder.bind(question)
    }

    override fun getItemCount() = items.size

    fun setItems(questions: List<Question>) {
        items.clear()
        items.addAll(questions)
        notifyDataSetChanged()
    }

    private var isTakeClicked = false

    fun isButtonTakeClicked(isClicked: Boolean) {
        this.isTakeClicked = isClicked
    }

    inner class TestViewHolder(
        itemView: View,
        private val binding: TestItemBinding,
        private var points: Int
    ) : RecyclerView.ViewHolder(itemView) {

        fun bind(question: Question) {
            binding.txtQuestion.text = (adapterPosition + 1).toString() + ". " + question.question
            binding.txtAnswer1.text = question.answers[FIRST_ANSWER].text
            binding.txtAnswer2.text = question.answers[SECOND_ANSWER].text
            binding.txtAnswer3.text = question.answers[THIRD_ANSWER].text
            binding.txtAnswer4.text = question.answers[FORTH_ANSWER].text

            val answers = question.answers
            if (question.answers[0].isSelected) {
                binding.txtAnswer1.background = ContextCompat.getDrawable(
                    binding.root.context,
                    R.drawable.background_selected_answer
                )
            } else {
                binding.txtAnswer1.background = ContextCompat.getDrawable(
                    binding.root.context,
                    R.drawable.background_unselected_answer
                )
            }
            if (question.answers[1].isSelected) {
                binding.txtAnswer2.background = ContextCompat.getDrawable(
                    binding.root.context,
                    R.drawable.background_selected_answer
                )
            } else {
                binding.txtAnswer2.background = ContextCompat.getDrawable(
                    binding.root.context,
                    R.drawable.background_unselected_answer
                )
            }
            if (question.answers[2].isSelected) {
                binding.txtAnswer3.background = ContextCompat.getDrawable(
                    binding.root.context,
                    R.drawable.background_selected_answer
                )
            } else {
                binding.txtAnswer3.background = ContextCompat.getDrawable(
                    binding.root.context,
                    R.drawable.background_unselected_answer
                )
            }
            if (question.answers[3].isSelected) {
                binding.txtAnswer4.background = ContextCompat.getDrawable(
                    binding.root.context,
                    R.drawable.background_selected_answer
                )
            } else {
                binding.txtAnswer4.background = ContextCompat.getDrawable(
                    binding.root.context,
                    R.drawable.background_unselected_answer
                )
            }
            binding.txtAnswer1.setOnClickListener {
                answers[0].isSelected = !answers[0].isSelected

                if (question.answers[0].isCorrect) {
                    points += 1
                }

                notifyDataSetChanged()
            }
            binding.txtAnswer2.setOnClickListener {
                answers[1].isSelected = !answers[1].isSelected
                if (question.answers[1].isCorrect) {
                    points += 1
                }

                notifyDataSetChanged()
            }
            binding.txtAnswer3.setOnClickListener {
                answers[2].isSelected = !answers[2].isSelected
                if (question.answers[2].isCorrect) {
                    points += 1
                }

                notifyDataSetChanged()
            }
            binding.txtAnswer4.setOnClickListener {
                answers[3].isSelected = !answers[3].isSelected
                if (question.answers[3].isCorrect) {
                    points += 1
                }

                notifyDataSetChanged()
            }
            testItemListener.onFinalScoreFetched(score)
            Log.d("HHH", "score $score")
        }

//        private fun setSelectedItemBackground(itemView: View, position: Int, question: Question) {
//            if (question.answers[position].isSelected) {
//                itemView.background = ContextCompat.getDrawable(
//                    itemView.context,
//                    R.drawable.background_selected_answer
//                )
//            } else {
//                itemView.background = ContextCompat.getDrawable(
//                    itemView.context,
//                    R.drawable.background_unselected_answer
//                )
//            }
//        }
    }
}

interface TestItemListener {
    fun onFinalScoreFetched(score: Int)
}



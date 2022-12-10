package com.example.quizapp.ui.activity.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.R
import com.example.quizapp.data.Answer
import com.example.quizapp.data.Question
import com.example.quizapp.databinding.TestItemBinding

private const val FIRST_ANSWER = 0
private const val SECOND_ANSWER = 1
private const val THIRD_ANSWER = 2
private const val FORTH_ANSWER = 3
private const val START_POINTS = 0

class TestAdapter(
    private val testItemListener: TestItemListener,
) :
    RecyclerView.Adapter<TestAdapter.TestViewHolder>() {

    lateinit var binding: TestItemBinding
    private val items = mutableListOf<Question>()
    private var points: Int = START_POINTS

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestViewHolder {
        binding = TestItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TestViewHolder(binding.root, binding)
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
    ) : RecyclerView.ViewHolder(itemView) {

        fun bind(question: Question) {
            binding.txtQuestion.text = (adapterPosition + 1).toString() + ". " + question.question
            binding.txtAnswer1.text = question.answers[FIRST_ANSWER].text
            binding.txtAnswer2.text = question.answers[SECOND_ANSWER].text
            binding.txtAnswer3.text = question.answers[THIRD_ANSWER].text
            binding.txtAnswer4.text = question.answers[FORTH_ANSWER].text

            val answers = question.answers
            toggleAnswers(answers)
            if (testItemListener.isReadyToColorizedAnswers()) {
                setFirstAnswerBackgroundAfterSubmit(answers)
                setSecondAnswerBackgroundAfterSubmit(answers)
                setThirdAnswerBackgroundAfterSubmit(answers)
                setFourthAnswerBackgroundAfterSubmit(answers)
            }

            setAnswersClickListeners(answers)
            testItemListener.onFinalScoreFetched(points)
            Log.d("HHH", "score $points")
        }

        private fun toggleAnswers(answers: List<Answer>) {
            if (answers[0].isSelected) {
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
            if (answers[1].isSelected) {
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
            if (answers[2].isSelected) {
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
            if (answers[3].isSelected) {
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
        }

        private fun setAnswersClickListeners(answers: List<Answer>) {
            binding.txtAnswer1.setOnClickListener {
                answers[0].isSelected = !answers[0].isSelected

                if (answers[0].isCorrect && answers[0].isSelected) {
                    points += 1
                }

                notifyDataSetChanged()
            }
            binding.txtAnswer2.setOnClickListener {
                answers[1].isSelected = !answers[1].isSelected
                if (answers[1].isCorrect && answers[1].isSelected) {
                    points += 1
                }
                notifyDataSetChanged()
            }
            binding.txtAnswer3.setOnClickListener {
                answers[2].isSelected = !answers[2].isSelected
                if (answers[2].isCorrect && answers[2].isSelected) {
                    points += 1
                }

                notifyDataSetChanged()
            }
            binding.txtAnswer4.setOnClickListener {
                answers[3].isSelected = !answers[3].isSelected
                if (answers[3].isCorrect && answers[3].isSelected) {
                    points += 1
                }

                notifyDataSetChanged()
            }
        }

        private fun setFirstAnswerBackgroundAfterSubmit(answers: List<Answer>) {
            if (answers[0].isSelected && answers[0].isCorrect)
                binding.txtAnswer1.background = ContextCompat.getDrawable(
                    binding.root.context,
                    R.drawable.background_correct_selected_answer
                )
            else if (answers[0].isSelected && !answers[0].isCorrect)
                binding.txtAnswer1.background = ContextCompat.getDrawable(
                    binding.root.context,
                    R.drawable.background_wrong_selected_answer
                )
            else if (!answers[0].isSelected && answers[0].isCorrect)
                binding.txtAnswer1.background = ContextCompat.getDrawable(
                    binding.root.context,
                    R.drawable.background_correct_unselected_answer
                )
        }

        private fun setSecondAnswerBackgroundAfterSubmit(answers: List<Answer>) {
            if (answers[1].isSelected && answers[1].isCorrect)
                binding.txtAnswer2.background = ContextCompat.getDrawable(
                    binding.root.context,
                    R.drawable.background_correct_selected_answer
                )
            else if (answers[1].isSelected && !answers[1].isCorrect)
                binding.txtAnswer2.background = ContextCompat.getDrawable(
                    binding.root.context,
                    R.drawable.background_wrong_selected_answer
                )
            else if (!answers[1].isSelected && answers[1].isCorrect)
                binding.txtAnswer2.background = ContextCompat.getDrawable(
                    binding.root.context,
                    R.drawable.background_correct_unselected_answer
                )
        }

        private fun setThirdAnswerBackgroundAfterSubmit(answers: List<Answer>) {
            if (answers[2].isSelected && answers[2].isCorrect)
                binding.txtAnswer3.background = ContextCompat.getDrawable(
                    binding.root.context,
                    R.drawable.background_correct_selected_answer
                )
            else if (answers[2].isSelected && !answers[2].isCorrect)
                binding.txtAnswer3.background = ContextCompat.getDrawable(
                    binding.root.context,
                    R.drawable.background_wrong_selected_answer
                )
            else if (!answers[2].isSelected && answers[2].isCorrect)
                binding.txtAnswer3.background = ContextCompat.getDrawable(
                    binding.root.context,
                    R.drawable.background_correct_unselected_answer
                )
        }

        private fun setFourthAnswerBackgroundAfterSubmit(answers: List<Answer>) {
            if (answers[3].isSelected && answers[3].isCorrect)
                binding.txtAnswer4.background = ContextCompat.getDrawable(
                    binding.root.context,
                    R.drawable.background_correct_selected_answer
                )
            else if (answers[3].isSelected && !answers[3].isCorrect)
                binding.txtAnswer4.background = ContextCompat.getDrawable(
                    binding.root.context,
                    R.drawable.background_wrong_selected_answer
                )
            else if (!answers[3].isSelected && answers[3].isCorrect)
                binding.txtAnswer4.background = ContextCompat.getDrawable(
                    binding.root.context,
                    R.drawable.background_correct_unselected_answer
                )
        }
    }
}

interface TestItemListener {
    fun onFinalScoreFetched(score: Int)
    fun isReadyToColorizedAnswers(): Boolean
}



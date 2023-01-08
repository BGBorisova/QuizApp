package com.example.quizapp.ui.activity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.R
import com.example.quizapp.data.model.Answer
import com.example.quizapp.data.model.Question
import com.example.quizapp.databinding.TestItemBinding

private const val FIRST_ANSWER = 0
private const val SECOND_ANSWER = 1
private const val THIRD_ANSWER = 2
private const val FORTH_ANSWER = 3

class TestAdapter(
    private val testItemListener: TestItemListener,
) :
    RecyclerView.Adapter<TestAdapter.TestViewHolder>() {

    lateinit var binding: TestItemBinding
    private val items = mutableListOf<Question>()
    private var isTakeClicked = false

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

    fun getItems() = items

    fun isButtonTakeClicked(isClicked: Boolean) {
        this.isTakeClicked = isClicked
    }

    inner class TestViewHolder(
        itemView: View,
        private val binding: TestItemBinding,
    ) : RecyclerView.ViewHolder(itemView) {

        fun bind(question: Question) {

            val answers = question.answers
            binding.txtQuestion.text = binding.root.context.resources.getString(
                R.string.question_text,
                (adapterPosition + 1).toString(),
                question.question
            )
            binding.txtAnswer1.text = answers[FIRST_ANSWER].text
            binding.txtAnswer2.text = answers[SECOND_ANSWER].text
            binding.txtAnswer3.text = answers[THIRD_ANSWER].text
            binding.txtAnswer4.text = answers[FORTH_ANSWER].text

            toggleAnswers(answers)

            if (testItemListener.isReadyToColorizedAnswers()) {
                setFirstAnswerBackgroundAfterSubmit(answers)
                setSecondAnswerBackgroundAfterSubmit(answers)
                setThirdAnswerBackgroundAfterSubmit(answers)
                setFourthAnswerBackgroundAfterSubmit(answers)
                onClickDisable()
            }
            setAnswersClickListeners(answers)
        }

        private fun toggleAnswers(answers: List<Answer>) {
            if (answers[FIRST_ANSWER].isSelected) binding.txtAnswer1.background =
                ContextCompat.getDrawable(
                    binding.root.context,
                    R.drawable.background_selected_answer
                )
            else binding.txtAnswer1.background = ContextCompat.getDrawable(
                binding.root.context,
                R.drawable.background_unselected_answer
            )
            if (answers[SECOND_ANSWER].isSelected) binding.txtAnswer2.background =
                ContextCompat.getDrawable(
                    binding.root.context,
                    R.drawable.background_selected_answer
                )
            else binding.txtAnswer2.background = ContextCompat.getDrawable(
                binding.root.context,
                R.drawable.background_unselected_answer
            )
            if (answers[THIRD_ANSWER].isSelected) binding.txtAnswer3.background =
                ContextCompat.getDrawable(
                    binding.root.context,
                    R.drawable.background_selected_answer
                )
            else binding.txtAnswer3.background = ContextCompat.getDrawable(
                binding.root.context,
                R.drawable.background_unselected_answer
            )
            if (answers[FORTH_ANSWER].isSelected) binding.txtAnswer4.background =
                ContextCompat.getDrawable(
                    binding.root.context,
                    R.drawable.background_selected_answer
                )
            else binding.txtAnswer4.background = ContextCompat.getDrawable(
                binding.root.context,
                R.drawable.background_unselected_answer
            )
        }

        private fun setAnswersClickListeners(answers: List<Answer>) {
            binding.txtAnswer1.setOnClickListener {
                answers[FIRST_ANSWER].isSelected = !answers[FIRST_ANSWER].isSelected
                answers[SECOND_ANSWER].isSelected = false
                answers[THIRD_ANSWER].isSelected = false
                answers[FORTH_ANSWER].isSelected = false
                notifyDataSetChanged()
            }
            binding.txtAnswer2.setOnClickListener {
                answers[SECOND_ANSWER].isSelected = !answers[SECOND_ANSWER].isSelected
                answers[FIRST_ANSWER].isSelected = false
                answers[THIRD_ANSWER].isSelected = false
                answers[FORTH_ANSWER].isSelected = false
                notifyDataSetChanged()
            }
            binding.txtAnswer3.setOnClickListener {
                answers[THIRD_ANSWER].isSelected = !answers[THIRD_ANSWER].isSelected
                answers[FIRST_ANSWER].isSelected = false
                answers[SECOND_ANSWER].isSelected = false
                answers[FORTH_ANSWER].isSelected = false
                notifyDataSetChanged()
            }
            binding.txtAnswer4.setOnClickListener {
                answers[FORTH_ANSWER].isSelected = !answers[3].isSelected
                answers[FIRST_ANSWER].isSelected = false
                answers[SECOND_ANSWER].isSelected = false
                answers[THIRD_ANSWER].isSelected = false
                notifyDataSetChanged()
            }
        }

        private fun setFirstAnswerBackgroundAfterSubmit(answers: List<Answer>) {
            when {
                answers[FIRST_ANSWER].isSelected && answers[FIRST_ANSWER].isCorrect -> binding.txtAnswer1.background =
                    ContextCompat.getDrawable(
                        binding.root.context,
                        R.drawable.background_correct_selected_answer
                    )
                answers[FIRST_ANSWER].isSelected && !answers[FIRST_ANSWER].isCorrect -> binding.txtAnswer1.background =
                    ContextCompat.getDrawable(
                        binding.root.context,
                        R.drawable.background_wrong_selected_answer
                    )
                !answers[FIRST_ANSWER].isSelected && answers[FIRST_ANSWER].isCorrect -> binding.txtAnswer1.background =
                    ContextCompat.getDrawable(
                        binding.root.context,
                        R.drawable.background_correct_unselected_answer
                    )
            }
        }

        private fun setSecondAnswerBackgroundAfterSubmit(answers: List<Answer>) {
            when {
                answers[SECOND_ANSWER].isSelected && answers[SECOND_ANSWER].isCorrect -> binding.txtAnswer2.background =
                    ContextCompat.getDrawable(
                        binding.root.context,
                        R.drawable.background_correct_selected_answer
                    )
                answers[SECOND_ANSWER].isSelected && !answers[SECOND_ANSWER].isCorrect -> binding.txtAnswer2.background =
                    ContextCompat.getDrawable(
                        binding.root.context,
                        R.drawable.background_wrong_selected_answer
                    )
                !answers[SECOND_ANSWER].isSelected && answers[SECOND_ANSWER].isCorrect -> binding.txtAnswer2.background =
                    ContextCompat.getDrawable(
                        binding.root.context,
                        R.drawable.background_correct_unselected_answer
                    )
            }
        }

        private fun setThirdAnswerBackgroundAfterSubmit(answers: List<Answer>) {
            when {
                answers[THIRD_ANSWER].isSelected && answers[THIRD_ANSWER].isCorrect -> binding.txtAnswer3.background =
                    ContextCompat.getDrawable(
                        binding.root.context,
                        R.drawable.background_correct_selected_answer
                    )
                answers[THIRD_ANSWER].isSelected && !answers[THIRD_ANSWER].isCorrect -> binding.txtAnswer3.background =
                    ContextCompat.getDrawable(
                        binding.root.context,
                        R.drawable.background_wrong_selected_answer
                    )
                !answers[THIRD_ANSWER].isSelected && answers[THIRD_ANSWER].isCorrect -> binding.txtAnswer3.background =
                    ContextCompat.getDrawable(
                        binding.root.context,
                        R.drawable.background_correct_unselected_answer
                    )
            }
        }

        private fun setFourthAnswerBackgroundAfterSubmit(answers: List<Answer>) {
            when {
                answers[FORTH_ANSWER].isSelected && answers[FORTH_ANSWER].isCorrect -> binding.txtAnswer4.background =
                    ContextCompat.getDrawable(
                        binding.root.context,
                        R.drawable.background_correct_selected_answer
                    )
                answers[FORTH_ANSWER].isSelected && !answers[FORTH_ANSWER].isCorrect -> binding.txtAnswer4.background =
                    ContextCompat.getDrawable(
                        binding.root.context,
                        R.drawable.background_wrong_selected_answer
                    )
                !answers[FORTH_ANSWER].isSelected && answers[FORTH_ANSWER].isCorrect -> binding.txtAnswer4.background =
                    ContextCompat.getDrawable(
                        binding.root.context,
                        R.drawable.background_correct_unselected_answer
                    )
            }
        }

        private fun onClickDisable() {
            binding.disableLayout.visibility = View.VISIBLE
        }
    }
}

interface TestItemListener {
    fun isReadyToColorizedAnswers(): Boolean
}



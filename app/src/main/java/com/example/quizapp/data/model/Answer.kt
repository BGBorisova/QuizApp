package com.example.quizapp.data.model

data class Answer(
    val id: Int,
    val text: String,
    val isCorrect: Boolean,
    var isSelected: Boolean = false
)

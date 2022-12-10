package com.example.quizapp.data

data class Answer(
    val id: Int,
    val text: String,
    val isCorrect: Boolean,
    var isSelected:Boolean=false
)

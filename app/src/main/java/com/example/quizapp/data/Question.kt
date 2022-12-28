package com.example.quizapp.data

data class Question(
    val id: Int,
    val question: String,
    val answers: List<Answer>,
)
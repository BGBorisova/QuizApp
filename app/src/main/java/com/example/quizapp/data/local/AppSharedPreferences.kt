package com.example.quizapp.data.local

import android.content.Context
import android.content.SharedPreferences
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json


class AppSharedPreferences internal constructor(context: Context) {

    init {
        sPref = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE)
    }

    fun getLastAssessmentModule1(): Float {
        val json: String = sPref.getString(PREF_SERIALIZABLE_RESULT1, null) ?: return 0.0f
        return Json.decodeFromString(json)
    }

    fun saveAssessmentModule1(assessment: Float) {
        val json = Json.encodeToString(assessment)
        sPref.edit().putString(PREF_SERIALIZABLE_RESULT1, json).apply()
    }

    fun getLastAssessmentModule2(): Float {
        val json: String = sPref.getString(PREF_SERIALIZABLE_RESULT2, null) ?: return 0.0f
        return Json.decodeFromString(json)
    }

    fun saveAssessmentModule2(assessment: Float) {
        val json = Json.encodeToString(assessment)
        sPref.edit().putString(PREF_SERIALIZABLE_RESULT2, json).apply()
    }

    fun getLastAssessmentModule3(): Float {
        val json: String = sPref.getString(PREF_SERIALIZABLE_RESULT3, null) ?: return 0.0f
        return Json.decodeFromString(json)
    }

    fun saveAssessmentModule3(assessment: Float) {
        val json = Json.encodeToString(assessment)
        sPref.edit().putString(PREF_SERIALIZABLE_RESULT3, json).apply()
    }

    fun getLastAssessmentModule4(): Float {
        val json: String = sPref.getString(PREF_SERIALIZABLE_RESULT4, null) ?: return 0.0f
        return Json.decodeFromString(json)
    }

    fun saveAssessmentModule4(assessment: Float) {
        val json = Json.encodeToString(assessment)
        sPref.edit().putString(PREF_SERIALIZABLE_RESULT4, json).apply()
    }

    fun getLastAssessmentModule5(): Float {
        val json: String = sPref.getString(PREF_SERIALIZABLE_RESULT5, null) ?: return 0.0f
        return Json.decodeFromString(json)
    }

    fun saveAssessmentModule5(assessment: Float) {
        val json = Json.encodeToString(assessment)
        sPref.edit().putString(PREF_SERIALIZABLE_RESULT5, json).apply()
    }

    fun getLastAssessmentModule6(): Float {
        val json: String = sPref.getString(PREF_SERIALIZABLE_RESULT6, null) ?: return 0.0f
        return Json.decodeFromString(json)
    }

    fun saveAssessmentModule6(assessment: Float) {
        val json = Json.encodeToString(assessment)
        sPref.edit().putString(PREF_SERIALIZABLE_RESULT6, json).apply()
    }

    fun clearLocalStorage() {
        sPref.edit().clear().apply()
    }

    companion object {
        private lateinit var sPref: SharedPreferences
        private const val PREF_FILE_NAME = "com.example.quizapp.data.local"
        private const val PREF_SERIALIZABLE_RESULT1 = "com.example.quizapp.data.local.PREF_1"
        private const val PREF_SERIALIZABLE_RESULT2 = "com.example.quizapp.data.local.PREF_2"
        private const val PREF_SERIALIZABLE_RESULT3 = "com.example.quizapp.data.local.PREF_3"
        private const val PREF_SERIALIZABLE_RESULT4 = "com.example.quizapp.data.local.PREF_4"
        private const val PREF_SERIALIZABLE_RESULT5 = "com.example.quizapp.data.local.PREF_5"
        private const val PREF_SERIALIZABLE_RESULT6 = "com.example.quizapp.data.local.PREF_6"
        private var instance: AppSharedPreferences? = null
        fun getInstance(context: Context): AppSharedPreferences {
            if (instance == null) {
                instance = AppSharedPreferences(context)
            }
            return instance as AppSharedPreferences
        }
    }
}
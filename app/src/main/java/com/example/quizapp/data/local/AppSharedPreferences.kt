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

    fun getLastResult(): Int {
        val json: String = sPref.getString(PREF_SERIALIZABLE_RESULT, null) ?: return 0
        return Json.decodeFromString(json)
    }

    fun saveResult(points: Int) {
        val json = Json.encodeToString(points)
        sPref.edit().putString(PREF_SERIALIZABLE_RESULT, json).apply()
    }

    fun clearPreferenceUser() {
        sPref.edit().clear().apply()
    }

    companion object {

        private lateinit var sPref: SharedPreferences
        private const val PREF_FILE_NAME = "com.example.quizapp.data.local"
        private const val PREF_SERIALIZABLE_RESULT = "com.example.quizapp.data.local.PREF_USER"
        private var instance: AppSharedPreferences? = null
        fun getInstance(context: Context): AppSharedPreferences {
            if (instance == null) {
                instance = AppSharedPreferences(context)
            }
            return instance as AppSharedPreferences
        }
    }

}
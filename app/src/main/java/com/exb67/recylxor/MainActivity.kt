package com.exb67.recylxor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var peopleList = listOf(
            Person("Joe", 19, "Canada"),
            Person("Donald", 70, "USA"),
            Person("Joe", 800, "USA"),
            Person("Barrack", 65, "Uganda"),
            Person("Tucker", 69, "Hell"),
            Person("Jordan", 55, "Transylvania"),
            Person("Ben", 10, "My wife is a doctor")
        )
    }
}
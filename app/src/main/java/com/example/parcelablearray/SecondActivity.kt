package com.example.parcelablearray

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val dummies: Array<DummyData> = intent.getParcelableArrayExtra("dummy_arg") as Array<DummyData>
        println(dummies)
    }
}
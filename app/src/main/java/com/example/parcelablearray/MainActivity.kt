package com.example.parcelablearray

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dummy1 = DummyData("one")
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtras(Bundle().apply { putParcelableArray("dummy_arg", arrayOf(dummy1)) })
        startActivity(intent)
    }
}
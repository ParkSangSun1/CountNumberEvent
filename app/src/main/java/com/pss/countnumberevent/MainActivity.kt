package com.pss.countnumberevent

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.pss.library.CountNumberEvent
import com.pss.library.CountNumberEvent.Companion.countNumber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        countNumber(0,500,findViewById<TextView>(R.id.count), 2000)
    }
}
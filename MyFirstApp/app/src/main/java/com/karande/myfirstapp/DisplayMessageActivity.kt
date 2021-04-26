package com.karande.myfirstapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.TextView
private const val EXTRA_MESSAGE = "EXTRA_MESSAGE"
class DisplayMessageActivity : AppCompatActivity() {
    companion object {
        fun createIntent(context: Context, message: String): Intent {
            return Intent(context, DisplayMessageActivity::class.java).apply {
                putExtra(EXTRA_MESSAGE, message)
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val textView = findViewById<TextView>(R.id.textView).apply{
            text = message
        }
    }




}


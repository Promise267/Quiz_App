package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart: Button = findViewById(R.id.btnStart)
        val et_name: EditText = findViewById(R.id.et_name)
        btnStart.setOnClickListener {

            if(et_name.text.isEmpty()){
                Toast.makeText(this,"Please enter your name", Toast.LENGTH_LONG).show()
            }else{
                //intent to move to another activity or window from mainactivity to quizquestion activity
                val intent  = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, et_name.text.toString())
                //startactivity to move on the next page
                startActivity(intent)
                //finsh to not let user go back to the previous application
                finish()
            }
        }

    }
}
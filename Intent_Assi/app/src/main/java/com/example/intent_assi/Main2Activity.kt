package com.example.intent_assi

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

//        var intent = intent
        val Num1 = intent.getStringExtra("Number1")
        val Num2 = intent.getStringExtra("Number2")

        Text1.text = "First Number:  ${Num1.toInt()}"
        Text2.text = "Second Number:  ${Num2.toInt()}"

        Calculate.setOnClickListener {
            var i = Intent()
            val Result = Num1.toInt() + Num2.toInt()
            i.putExtra("Res",Result.toString())
            setResult(Activity.RESULT_OK,i)
            finish()


        }
    }
}
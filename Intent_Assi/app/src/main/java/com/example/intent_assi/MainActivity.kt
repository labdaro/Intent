package com.example.intent_assi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener{
            val num1 = number1.text.toString()
            val num2 = number2.text.toString()
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("Number1",num1)
            intent.putExtra("Number2",num2)
            startActivityForResult(intent,2)
        }

    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode ==2){
            var str:String? = data?.getStringExtra("Res")
            user.text = "The Addition: $str"
        }

    }

}
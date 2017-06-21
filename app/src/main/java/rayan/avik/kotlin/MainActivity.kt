package rayan.avik.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result = findViewById(R.id.textView2) as TextView
        val add = findViewById(R.id.buttonAdd) as Button
        val minus = findViewById(R.id.buttonMinus) as Button
        val mul = findViewById(R.id.buttonMultipal) as Button
        val div = findViewById(R.id.buttonDiv) as Button

        add.setOnClickListener(View.OnClickListener {
            view -> result.text = (getnum1() + getnum2()).toString()
        })

        minus.setOnClickListener(View.OnClickListener {
            view -> result.text = (getnum1() - getnum2()).toString()
        })

        mul.setOnClickListener(View.OnClickListener {
            view -> result.text = (getnum1() * getnum2()).toString()
        })

        div.setOnClickListener(View.OnClickListener {
            view -> result.text = (getnum1() / getnum2()).toString()
        })
    }
    fun getnum1(): Int{
        val input_num1 = findViewById(R.id.editText1) as EditText
        return  Integer.parseInt(input_num1.text.toString())
    }
    fun getnum2(): Int{
        val input_num2 = findViewById(R.id.editText2) as EditText
        return  Integer.parseInt(input_num2.text.toString())
    }
}

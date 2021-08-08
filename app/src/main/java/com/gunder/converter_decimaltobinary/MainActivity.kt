package com.gunder.converter_decimaltobinary

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    // Giving name to the variables for
    // two EditTexts and two Buttons
    // input is where the user will
    // input the decimal number
    // output is where the user will get
    // the output in the form of binary number
    // submit is the button created to submit
    // the decimal number entered by the user
    // clear is the button to clear the answer
    var input: EditText? = null
    var output: EditText? = null
    var submit: Button? = null
    var reset: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Calling the EditText by id which we gave in xml file
        input = findViewById<View>(R.id.editText) as EditText
        output = findViewById<View>(R.id.output) as EditText
        submit = findViewById<View>(R.id.submit) as Button

        // It is set so that when the user clicks
        // on submit button, the data
        // gets send in the function created below
        // which will convert it and then
        // show the answer to the user in the output
        submit!!.setOnClickListener { // Creating a string method argument
            val string = input!!.text.toString()

            // Here, we are parsing a string method
            // argument into an integer object
            val i = string.toInt()

            // Converts and stores it in the form of string
            val binary = Integer.toBinaryString(i)

            // It will show the output in the
            // second edit text that we created
            output!!.setText(binary)
        }

        // Here, we will define a function which
        // will clear the whole text and reset it
        reset = findViewById<View>(R.id.reset) as Button
        reset!!.setOnClickListener {
            input!!.setText("")
            output!!.setText("")
        }
    }
}
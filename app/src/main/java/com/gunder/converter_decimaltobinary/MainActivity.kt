package com.gunder.converter_decimaltobinary

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
//    inisialisasi atribut
    private var input: EditText? = null
    private var output: EditText? = null
    private var submit: Button? = null
    private var reset: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //    inisialisasi atribut
        input = findViewById(R.id.editText)
        output = findViewById(R.id.output)
        submit = findViewById(R.id.submit)
//        jika tombol submit ditekan, maka lakukan aksi
        submit!!.setOnClickListener {
            val string = input!!.text.toString()
            val i = string.toInt()
            val binary = Integer.toBinaryString(i)
            output!!.setText(binary)
        }
//        inisialisasi tombol reset
        reset = findViewById(R.id.reset)
//        aksi ketika tombol reset ditekan
        reset!!.setOnClickListener {
            input!!.setText("")
            output!!.setText("")
        }
    }
}
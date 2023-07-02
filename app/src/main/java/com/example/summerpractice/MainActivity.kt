package com.example.summerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private var name: EditText?=null
    private var height: EditText?=null
    private var weight: EditText?=null
    private var age: EditText?=null
    private var button: Button?=null
    private var textView: TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.editTextText)
        height = findViewById(R.id.editTextText1)
        weight = findViewById(R.id.editTextText2)
        age = findViewById(R.id.editTextText3)
        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView2)
        button?.setOnClickListener{
            val names = name?.text.toString()
            val heights = height?.text.toString().toIntOrNull()
            val weights = weight?.text.toString().toDoubleOrNull()
            val ages = age?.text.toString().toIntOrNull()
            if (names.isEmpty() || heights==null || weights==null || ages==null){
                textView?.text = "Данные введены некорректно"
            }else if (names.length>50  || names==null){
                textView?.text = "Данные введены некорректно"
            }else if(heights>250 || heights<0){
                textView?.text = "Данные введены некорректно"
            }else if(weights>250 || weights<0){
                textView?.text = "Данные введены некорректно"

            }else if(ages>150 || ages<0){
                textView?.text = "Данные введены некорректно"
            }else {
                val horo = arrayOf("Овен","Телец","Близнецы","Рак","Лев","Дева","Весы","Скорпион","Стрелец","Козерог","Водолей","Рыбы")
                val result = ((names.length+heights+weights*10+ages)/5).toInt()%12
                textView?.text = "Ответ: ${horo[result]}"

            }
        }
    }
}
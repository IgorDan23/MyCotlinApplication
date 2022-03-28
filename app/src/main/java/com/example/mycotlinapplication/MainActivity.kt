package com.example.mycotlinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var buttonClass: Button
    lateinit var buttonCopy: Button
    lateinit var buttonCycle: Button
    lateinit var textClass: TextView
    lateinit var textCopy: TextView
    lateinit var textCycle: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        set()


    }

    fun init(){
        buttonClass = findViewById(R.id.buttonOne)
        buttonCopy = findViewById(R.id.buttonTwo)
        buttonCycle = findViewById(R.id.buttonThree)
        textClass = findViewById(R.id.textViewOne)
        textCopy = findViewById(R.id.textViewTwo)
        textCycle = findViewById(R.id.textViewThree)

    }

    fun set(){
        buttonClass.setOnClickListener(this)
        buttonCopy.setOnClickListener(this)
        buttonCycle.setOnClickListener(this)
        textClass.setOnClickListener(this)
        textCopy.setOnClickListener(this)
        textCycle.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        if (p0 != null) {
            when (p0.id) {
                R.id.buttonOne -> textClass.text = Day().toString()
                R.id.buttonTwo -> textCopy.text = dtTooString()
                R.id.buttonThree -> list.forEach { textCycle.text=textCycle.text.toString()+" "+it}

            }
        }

    }

}
data class Day(val data: Int = 15, val time: Int = 1430)
var dayOne = Day()
var dayTwo = dayOne.copy(12, 1120)
fun dtTooString(): String {
    val dayTwoSt: String = dayTwo.data.toString() + " " + dayTwo.time.toString()
    return dayTwoSt
}
val  list = listOf("Year","Day","Month")










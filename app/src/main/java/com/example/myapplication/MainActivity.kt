package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    private val peoples = listOf(
        People(R.string.NameGirl, R.string.AgeGirl),
        People(R.string.NameBoy, R.string.AgeBoy)
    )

    private var indexPeople = 0

    lateinit var generate: Button
    lateinit var name: TextView
    lateinit var age: TextView

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        generate = findViewById(R.id.button)
        name = findViewById(R.id.name)
        age = findViewById(R.id.age)

        generate.setOnClickListener { view : View ->
            indexPeople = (indexPeople + 1) % peoples.size
            updateName()
            updateAge()
        }
    }

    private fun updateName()
    {
        val nameG = peoples[indexPeople].name
        name.setText(nameG)
    }

    private fun updateAge()
    {
        val ageG = peoples[indexPeople].age
        age.setText(ageG)
    }
}
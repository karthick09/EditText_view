package com.example.edittext_view

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


class MainActivity : AppCompatActivity(),FragmentActionListener {
    private var fragmentManager: FragmentManager? = null
    private var fragmentTransaction: FragmentTransaction? = null


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragmentManager = supportFragmentManager
        fragmentTransaction = fragmentManager?.beginTransaction()
        fragmentTransaction?.add(R.id.fragmentContainer, fragment())
        fragmentTransaction?.addToBackStack(null)
        fragmentTransaction?.commit()
    }
    fun onClick(view: View){
        fragmentManager = supportFragmentManager
        fragmentTransaction = fragmentManager?.beginTransaction()
        val data =ShowData()
        data.setFragmentActionListener(this)
        fragmentTransaction?.add(R.id.fragmentContainer, ShowData())
        fragmentTransaction?.addToBackStack(null)
        fragmentTransaction?.commit()
    }

    override fun getName(): String {
        val simpleEditText = findViewById<View>(R.id.editText1) as EditText
        return simpleEditText.text.toString()
    }

    override fun getPassword(): String {
        val simpleEditText = findViewById<View>(R.id.editText2) as EditText
        return simpleEditText.text.toString()
    }

    override fun getEmail(): String {
        val simpleEditText = findViewById<View>(R.id.editText3) as EditText
        return simpleEditText.text.toString()
    }

    override fun getCountry(): String {
        val simpleEditText = findViewById<View>(R.id.autocomplete_country) as AutoCompleteTextView
        return simpleEditText.text.toString()
    }

    override fun getMobileNo(): String {
        val simpleEditText = findViewById<View>(R.id.editText5) as EditText
        return simpleEditText.text.toString()
    }
}
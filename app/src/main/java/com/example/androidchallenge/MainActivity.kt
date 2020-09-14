package com.example.androidchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), FirstFragment.OnFragmentInteraction {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        supportFragmentManager?.beginTransaction()?.add(R.id.fragment_container, FirstFragment())?.commit()
    }

    override fun onButtonClicked(name: String, email:String, phone:String) {
        var secondFragment = SecondFragment.newInstance(name, email, phone)

        supportFragmentManager?.beginTransaction()?.add(R.id.fragment_container, secondFragment)?.commit()
    }
}
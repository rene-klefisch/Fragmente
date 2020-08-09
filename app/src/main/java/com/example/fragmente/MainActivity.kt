package com.example.fragmente

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mManager = supportFragmentManager
    val mFragment = ErstesFragment()
    val mFragment2 = ZweitesFragment()

    val mTransaction = mManager.beginTransaction()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("Test", "OnCreate")

        val fragmentButton = findViewById<Button>(R.id.fragmentBtn)
        fragmentButton.setOnClickListener {
            val mTransaction = mManager.beginTransaction()
            mTransaction.replace(R.id.fragmentPlatz, mFragment)
            mTransaction.addToBackStack(null)
            mTransaction.commit()
        }

        val fragment2Button = findViewById<Button>(R.id.fragment2Btn)
        fragment2Button.setOnClickListener {
            val mTransaction = mManager.beginTransaction()
            mTransaction.replace(R.id.fragmentPlatz, mFragment2)
            mTransaction.addToBackStack(null)
            mTransaction.commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("Test", "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Test", "OnResume")
    }
}
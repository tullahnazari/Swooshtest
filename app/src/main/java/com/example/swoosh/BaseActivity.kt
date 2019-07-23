package com.example.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {

    val TAG = "Lifecycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "${javaClass.simpleName} onCreate")
        super.onCreate(savedInstanceState)

    }

    override fun onStart() {
        Log.d(TAG, "${javaClass.simpleName} onStart")
        super.onStart()
    }
    override fun onResume() {
        Log.d(TAG, "${javaClass.simpleName} onResume")
        super.onResume()
    }

    override fun onRestart() {
        Log.d(TAG, "${javaClass.simpleName} onRestart")
        super.onDestroy()

    }




}

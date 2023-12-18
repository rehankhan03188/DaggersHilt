package com.example.daggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var toastHelper: ToastHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toastHelper = ToastHelper(this)
        showToastMessage()
    }

    // Example method to show toast
    private fun showToastMessage() {
        toastHelper.showToast("Your message here")
    }
}
package com.example.daggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
//
//    @Inject
//    lateinit var toastHelper: com.example.mylibrary.ToastHelper


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        toastHelper = com.example.mylibrary.ToastHelper(this)
        // Instantiate your fragments
        val fragment1 = MainFragment()

        // Add the fragments to the activity
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment1)
            .addToBackStack(null) // Optional: Add to back stack if needed
            .commit()

//        showToastMessage()
    }

   /* // Example method to show toast
    private fun showToastMessage() {
        toastHelper.showToast("Your message here")
    }*/
}
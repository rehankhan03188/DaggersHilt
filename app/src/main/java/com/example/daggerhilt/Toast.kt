package com.example.daggerhilt

import android.content.Context
import android.widget.Toast
import javax.inject.Inject

class Toast @Inject constructor(private val context: Context) {

    fun showToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}
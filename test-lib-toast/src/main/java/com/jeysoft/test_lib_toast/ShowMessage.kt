package com.jeysoft.test_lib_toast

import android.content.Context
import android.util.Log
import android.widget.Toast

class ShowMessage {

    companion object {
        fun screen(context: Context, message: String) {
            Toast.makeText(context, "$message", Toast.LENGTH_SHORT).show()
        }

        fun debug(tag: String, message: String) {
            Log.d(tag, message)
        }
    }
}
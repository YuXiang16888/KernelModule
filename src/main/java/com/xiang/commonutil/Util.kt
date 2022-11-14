package com.xiang.commonutil

import android.content.Context
import android.util.Log
import android.widget.Toast

class Util {
    fun showToast(context : Context) {
        Toast.makeText(context, "CommonModule Util Tool Update26", Toast.LENGTH_SHORT).show()
    }

    fun showLogUtil(context: Context) {
        Log.d("YuXiang", "showLogUtil: CommonModule LogUtil Tool Update26")
    }
}
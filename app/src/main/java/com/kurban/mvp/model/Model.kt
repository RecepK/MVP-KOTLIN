package com.kurban.mvp.model

import android.content.Context
import com.kurban.mvp.R

class Model(private val context: Context) {

    fun getData() = context.getString(R.string.app_name)
}
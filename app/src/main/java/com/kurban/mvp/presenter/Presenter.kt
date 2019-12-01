package com.kurban.mvp.presenter

import android.content.Context
import com.kurban.mvp.model.Model

class Presenter(private val view: Contract.View) : Contract.Presenter {

    private val model: Model = Model((view as Context))

    override fun clicked() {
        view.clickHandle(getData())
    }

    override fun longClicked() {
        view.longClickHandle(getLongData())
    }

    private fun getData() = model.getData()

    private fun getLongData() = model.getData().substring(0, model.getData().length - 1)
}
package com.kurban.mvp.presenter

interface Contract {

    interface Presenter {
        fun clicked()
        fun longClicked()
    }

    interface View {
        fun clickHandle(value: String)
        fun longClickHandle(value: String)
    }
}
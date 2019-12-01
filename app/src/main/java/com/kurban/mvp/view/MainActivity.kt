package com.kurban.mvp.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kurban.mvp.R
import com.kurban.mvp.presenter.Contract
import com.kurban.mvp.presenter.Presenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Contract.View {

    lateinit var presenter: Contract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = Presenter(this)

        // init UI
        initUI()
    }

    private fun initUI() {
        textView.setOnClickListener { presenter.clicked() }

        textView.setOnLongClickListener {
            presenter.longClicked()
            return@setOnLongClickListener true
        }
    }

    override fun clickHandle(value: String) {
        textView.text = value
    }

    override fun longClickHandle(value: String) {
        textView.text = value
    }
}
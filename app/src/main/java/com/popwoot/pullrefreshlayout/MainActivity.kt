package com.popwoot.pullrefreshlayout

import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        refreshContainer.setListener {
            //  updateImages()
            Log.d("TAGS", "onCreate: ")

            Handler().postDelayed({hide()},5000)
        }
    }

    private fun hide(){
        refreshContainer.finishRefreshing();
    }
}

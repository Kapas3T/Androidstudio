package com.kapas.pourflorent.stpmarche

import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.startup.AppInitializer
import app.rive.runtime.kotlin.RiveInitializer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppInitializer.getInstance(applicationContext)
            .initializeComponent(RiveInitializer::class.java)



                if (supportActionBar != null) {
                    supportActionBar!!.hide()
                }
            }





        }



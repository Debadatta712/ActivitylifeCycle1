package com.debadatta.activitylifecycle1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import android.os.Parcel
import android.os.Parcelable

class MainActivity() : AppCompatActivity(){

var titleName: String?="z warriors"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scrollview_eg)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        if(intent !=null){
            intent.getStringExtra("name")
        }
        supportActionBar?.title = "z warriors"

    }



}
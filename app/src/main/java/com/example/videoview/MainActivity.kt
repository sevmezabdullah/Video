package com.example.videoview

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        start.setOnClickListener {
            val adres = Uri.parse("android.resource://" + packageName + "/" + R.raw.short_video)
            videoView.setVideoURI(adres)
            videoView.start()
        }

        stop.setOnClickListener {
            videoView.stopPlayback()
        }
    }
}
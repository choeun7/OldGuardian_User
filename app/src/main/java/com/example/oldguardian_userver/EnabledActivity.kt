package com.example.oldguardian_userver

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.oldguardian_userver.databinding.ActivityEnabledBinding

class EnabledActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityEnabledBinding

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = ActivityEnabledBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
    }
}
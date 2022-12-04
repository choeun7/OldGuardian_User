package com.example.oldguardian_userver

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.oldguardian_userver.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        //버튼 누르면 넘어가기
        viewBinding.nextBtn.setOnClickListener {
            val intent = Intent(this, CodeActivity::class.java)
            startActivity(intent)
        }
    }
}
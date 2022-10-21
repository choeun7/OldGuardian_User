package com.example.oldguardian_userver

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.oldguardian_userver.databinding.TestActivityBinding

class TestActivity : AppCompatActivity() {
    private lateinit var viewBinding: TestActivityBinding

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = TestActivityBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        //입력받은 무소음 시간 time에 저장
        var time = viewBinding.time.text.toString()

        //확인 버튼 누르면 실행할 활동
        viewBinding.nextBtn.setOnClickListener {

        }
    }
}
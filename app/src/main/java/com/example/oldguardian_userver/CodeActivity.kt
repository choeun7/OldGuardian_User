package com.example.oldguardian_userver

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.oldguardian_userver.databinding.ActivityCodeBinding

class CodeActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityCodeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityCodeBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        //어르신 전화번호 number 변수에 저장
        var number = viewBinding.phoneNumber.text.toString()

        //버튼 누르면 넘어가기
        viewBinding.nextBtn.setOnClickListener {
            val intent = Intent(this, EnabledActivity::class.java)
            startActivity(intent)
        }
    }
}
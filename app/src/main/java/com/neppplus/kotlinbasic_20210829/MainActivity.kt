package com.neppplus.kotlinbasic_20210829

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logBtn.setOnClickListener {
            Log.d("메인화면", "로그 버튼 눌림")
        }

        secondLogBtn.setOnClickListener {
            Log.e("메인화면", "두번째 로그 버튼 눌림")
        }
    }
}
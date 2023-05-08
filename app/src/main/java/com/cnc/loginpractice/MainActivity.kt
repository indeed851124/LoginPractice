package com.cnc.loginpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.cnc.loginpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var mBinding: ActivityMainBinding? = null
    // 매번 null 체크를 할 필요 없이 편의성을 위해 바인딩 변수 재 선언
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener {
            if(binding.idText.text.toString() == "admin@test.com" && binding.pwText.text.toString()=="qwer") {
                val name = "강호"
                Toast.makeText(this,"${name} 관리자입니다",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"로그인실패",Toast.LENGTH_SHORT).show()
            }
            
        }

    }
}
package com.example.alarm

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TimePicker

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initOnOffBtn()    // ON / OFF 스위치 버튼
        initChangeBtn()


    }


    private fun initOnOffBtn() {
        val onOffBtn = findViewById<Button>(R.id.onOffBtn)
        onOffBtn.setOnClickListener {
            //데이터 버튼확인, 작업처리

        }
    }

    private fun initChangeBtn() {
        val changeAlarmTimeBtn = findViewById<Button>(R.id.changeAlarmTimeBtn)
        changeAlarmTimeBtn.setOnClickListener {
                // 현재시간 가져오기
                // TimePickDialog 시간 설정
            TimePickerDialog(this,{

                // 데이터 저장
                // 뷰 업데이트
                // 알람 초기화
        }
    }



}
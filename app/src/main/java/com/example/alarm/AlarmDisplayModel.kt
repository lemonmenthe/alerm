package com.example.alarm

data class AlarmDisplayModel (
    // 시간, 분
    val hour: Int,
    val minute: Int,
    val onoff: Boolean
)
{
    val timetext: String
    get(){
        val h = "%02d".format(if (hour < 12) hour else hour - 12)
        val m = "%02d".format(minute)

        return "$h:$m"
    }


    val ampmText: String
    get(){
        return if(hour < 12)"AM" else "PM"
    }
}
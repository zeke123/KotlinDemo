package com.zhoujian.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(max(1,2))

    }


    fun max(a: Int, b: Int): Int {
        return if (a > b) a else b
    }

    fun main(args: Array<String>) {
        println("hello world")
    }
}

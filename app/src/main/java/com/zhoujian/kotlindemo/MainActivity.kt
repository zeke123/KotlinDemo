package com.zhoujian.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import java.lang.Integer.parseInt
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //声明变量和值
        //decareVariables()

        //变量类型推断
//        concludeType()

        //使用is运算符进行类型检测
        val length = getLength("abc")
        // Log.i("zhoujian", "length=" + length);


//        val str = "abc"
//        val s = "$str has ${str.length} characters"
//        Log.i("zhoujian", "s=" + s);


//        max(1, 2)
//        Log.i("zhoujian", "最大值为：" + max(1, 2));


//        max2(1, 2)
//        Log.i("zhoujian", "最大值为：" + max2(1, 2));

//        cases("Hello")

//        forMethod()

//        whileMethod()

//        doWhileMethod()

//        breakMethod()

//        continueMethod()

        sumMethod(1,4)
    }

    private fun sumMethod(a:Int,b:Int):Int {
        return a+b
    }


    /**
     * 返回值为Int 的比较大小的函数
     */
    private fun max(a: Int, b: Int): Int {
        return if (a > b) a else b
    }

    private fun continueMethod() {
        for (i in 1..10) {
            if (i % 2 == 0) {
                continue
            }
            Log.i("zhoujian", "i：" + i);
        }
    }

    private fun breakMethod() {
        for (i in 1..10) {
            Log.i("zhoujian", "i：" + i);
            if (i % 2 == 0) {
                break
            }
        }
    }

    private fun doWhileMethod() {
        var y = 5
        do {
            y++
            Log.i("zhoujian", "y：" + y);
        } while (y < 8)
    }


    private fun whileMethod() {
        var x = 3
        while (x > 0) {
            x--
            Log.i("zhoujian", "x：" + x);
        }
    }

    private fun forMethod() {
        var arrays = arrayOf(1, 2, 3)
        for (item in arrays) {
            Log.i("zhoujian", "item：" + item);
        }
    }


    private fun switch(x: Int) {
        val s = "123"
        when (x) {
            -1, 0 -> print("x == -1 or x == 0")
            1 -> print("x == 1")
            2 -> print("x == 2")
            8 -> print("x is 8")
            parseInt(s) -> println("x is 123")
            else -> { // 注意这个块
                print("x is neither 1 nor 2")
            }
        }
    }

    private fun cases(obj: Any) {
        when (obj) {
            1 -> Log.i("zhoujian", "第一项");
            "Hello" -> Log.i("zhoujian", "这是个字符串");
            is Long -> Log.i("zhoujian", "这是个Long类型数据");
            else -> Log.i("zhoujian", "else类似于Java中的default");
        }
    }


    private fun myCases(obj: Any) {
        when (obj) {
            1, 0 -> Log.i("zhoujian", "第一项");
            "Hello" -> Log.i("zhoujian", "这是个字符串");
            is Long -> Log.i("zhoujian", "这是个Long类型数据");
            else -> {
                Log.i("zhoujian", "else类似于Java中的default");
            }
        }
    }


    /**
     * if 的分支可以是代码块，最后的表达式作为该块的值
     */
    private fun max2(a: Int, b: Int): Int {
        val max = if (a > b) {
            a
        } else {
            b
        }
        return max
    }



    //使用is运算符进行类型检测
    private fun getLength(obj: Any): Int? {
        var resault = 0
        if (obj is String) {
            resault = obj.length
        }
        return resault
    }

    /**
     *  声明变量和值
     */
    private fun decareVariables() {
        var a = 1
        a = 2
        Log.i("zhoujian", "a=" + a);
        Log.i("zhoujian", "a::class=" + a::class);
        Log.i("zhoujian", "a::class.java=" + a::class.java);

        Log.i("zhoujian", "-----------------------------------------------------------------1");

        var x = 5
        x += 1
        Log.i("zhoujian", "x=" + x);

        Log.i("zhoujian", "-----------------------------------------------------------------2");

        val b = "a"
        Log.i("zhoujian", "b=" + b);
        Log.i("zhoujian", "b::class=" + b::class);
        Log.i("zhoujian", "b::class.java=" + b::class.java);

        Log.i("zhoujian", "-----------------------------------------------------------------3");

        val c: Int = 1 //立即赋值
        val d = 2  //自动推断出Int类型
        Log.i("zhoujian", "c=" + c);
        Log.i("zhoujian", "d=" + d);
    }

    /**
     * 变量类型推断
     */
    private fun concludeType() {
        //省去变量类型

        val str = "abc"
        val b = str is String
        Log.i("zhoujian", "str=" + str);
        Log.i("zhoujian", "str is String=" + b);
        Log.i("zhoujian", "str::class=" + str::class);
        Log.i("zhoujian", "str::class.java=" + str::class.java);

        Log.i("zhoujian", "-----------------------------------------------------------------1");


        val d = Date()
        val b1 = d is Date
        Log.i("zhoujian", "d=" + d);
        Log.i("zhoujian", "d is Date=" + b1);
        Log.i("zhoujian", "d::class=" + d::class);
        Log.i("zhoujian", "d::class.java=" + d::class.java);

        Log.i("zhoujian", "-----------------------------------------------------------------2");


        val array = arrayOf(1, 2, 3)
        val b2 = array is Array
        Log.i("zhoujian", "array=" + array);
        Log.i("zhoujian", "array is Array=" + b2);
        Log.i("zhoujian", "array::class=" + array::class);
        Log.i("zhoujian", "array::class.java=" + array::class.java);

        //编译器能够检测到其类型，自动完成类型转换。当然，我们也可以明确指定变量类型
        //val x: Int = 10

    }
}

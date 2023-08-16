package com.kyh.sqliteappexempel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kyh.sqliteappexempel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

   private lateinit var binder: ActivityMainBinding

   private lateinit var userDao: UserDao


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binder.root)

        userDao = UserDao(this)

    }

}
package com.kyh.sqliteappexempel

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class UserDao(
    context: Context?, name: String?, factory: SQLiteDatabase.CursorFactory?, version: Int
) : SQLiteOpenHelper
    (context, name, factory, version) {

    constructor(context: Context?) : this(context, "userDB",null, 1)
    override fun onCreate(db: SQLiteDatabase?) {

        val query = "CREATE TABLE users(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, score Integer, isHuman BOOL)"

        db?.execSQL(query)
    }


    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }


}
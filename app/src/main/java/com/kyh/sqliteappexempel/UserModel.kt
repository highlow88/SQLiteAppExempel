package com.kyh.sqliteappexempel

data class UserModel (val id: Int, val name: String, val score: Int, val isHuman: Boolean){

    override fun toString(): String {
        return "UserModel(id=$id, name='$name', score=$score, isHuman=$isHuman)"
    }
}
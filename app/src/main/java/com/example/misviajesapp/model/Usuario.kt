package com.example.misviajesapp.model

import android.graphics.drawable.Icon
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey


open class Usuario(
    @PrimaryKey
    var id:Long = 0,
    var nombre:String ="",
    var nombreUsuario: String ="",
    var email:String ="",
    var contraseña:String ="",
    var foto:String="") : RealmObject() {

    constructor(nombre: String, nombreUsuario: String, email: String, contraseña: String, foto: String)
            : this(System.currentTimeMillis()/1000,nombre,nombreUsuario, email, contraseña, foto)

}
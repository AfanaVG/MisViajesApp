package com.example.misviajesapp.model

import android.graphics.drawable.Icon
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey


class Usuario constructor(@PrimaryKey var id:Int, var nombre:String, var nombreUsuario: String, var email:String, var contraseña:String, var foto:Icon) : RealmObject() {


}
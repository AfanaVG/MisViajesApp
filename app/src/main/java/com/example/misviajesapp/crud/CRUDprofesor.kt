package com.example.misviajesapp.crud

import com.example.misviajesapp.model.Usuario
import io.realm.Realm
import io.realm.kotlin.where

class CRUDprofesor{
    fun calcularID():Int{
        var realm = Realm.getDefaultInstance()
        var idActual = realm.where<Usuario>().max("id")
        var idSig:Int
        if (idActual == null){
            idSig = 0;
        }else{
            idSig = idActual.toInt()+1
        }
        return idSig
    }
}
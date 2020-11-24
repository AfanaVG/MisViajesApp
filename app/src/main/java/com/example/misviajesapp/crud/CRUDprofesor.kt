package com.example.misviajesapp.crud

import com.example.misviajesapp.model.Usuario
import io.realm.Realm
import io.realm.kotlin.createObject
import io.realm.kotlin.where

class CRUDprofesor{
    private fun calcularID():Int{
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

    public fun nuevoUsuario(usuario: Usuario ){
        var realm = Realm.getDefaultInstance()
        realm.executeTransaction(Realm.Transaction {
            @Override
             fun execute(realm: Realm){
                var index = calcularID()
                var realmUsuario = realm.createObject<Usuario>(index)
                realmUsuario.nombre = usuario.nombre
            }
        })
    }
}
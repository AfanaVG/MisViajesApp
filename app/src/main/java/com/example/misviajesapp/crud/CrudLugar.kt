package com.example.misviajesapp.crud

import com.example.misviajesapp.model.Lugar
import com.example.misviajesapp.model.Usuario
import io.realm.Realm
import io.realm.kotlin.createObject
import io.realm.kotlin.where
import java.security.MessageDigest

class CrudLugar {

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

    public fun nuevoLugar(lugar: Lugar,usuario: Usuario){
        var realm = Realm.getDefaultInstance()
        realm.executeTransaction(Realm.Transaction {
            @Override
            fun execute(realm: Realm){
                var index = calcularID()
                var realmLugar = realm.createObject<Lugar>(index)
                realmLugar.id = lugar.id
                realmLugar.id_cliente = usuario.id
                realmLugar.paraje = lugar.paraje
                realmLugar.nombre = lugar.nombre
                realmLugar.puntuacion = lugar.puntuacion
                realmLugar.foto = lugar.foto
            }
        })
    }



}
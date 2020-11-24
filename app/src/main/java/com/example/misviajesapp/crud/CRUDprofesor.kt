package com.example.misviajesapp.crud

import com.example.misviajesapp.model.Usuario
import io.realm.Realm
import io.realm.kotlin.createObject
import io.realm.kotlin.where
import java.security.MessageDigest

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
                realmUsuario.nombreUsuario = usuario.nombreUsuario
                realmUsuario.contraseña = usuario.contraseña
                realmUsuario.email = usuario.email
                realmUsuario.foto = usuario.foto
            }
        })
    }

    fun encriptar(pass:String):String{
        val bytes = pass.toString().toByteArray()
        val md = MessageDigest.getInstance("SH-256")
        val digest = md.digest(bytes)
        return digest.fold("",{str,it -> str + "%02x".format(it)})
    }

    fun getUsuario(nombreUsuario:String, emai:String):String{

    }
}
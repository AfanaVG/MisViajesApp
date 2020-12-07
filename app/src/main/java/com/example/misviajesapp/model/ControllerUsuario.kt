package com.example.misviajesapp.model

import io.realm.Realm
import io.realm.kotlin.where

object ControllerUsuario {
    fun insertarUsuario(usuario: Usuario){
        Realm.getDefaultInstance().executeTransaction{
            it.copyToRealm(usuario)
        }
    }

    fun borrarUsuario(usuario: Usuario){
        Realm.getDefaultInstance().executeTransaction{
            it.where<Usuario>().equalTo("id", usuario.id).findFirst()?.deleteFromRealm()
        }
    }

    /**
    * Select por  id
    * @param id
    */
    fun selectById(id: Long): Usuario? {
        return Realm.getDefaultInstance().copyFromRealm(
            Realm.getDefaultInstance().where<Usuario>().equalTo("id", id).findFirst()
        )
    }


}
package com.example.misviajesapp.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey


open class Lugar(
    @PrimaryKey var id: Int,
    var id_cliente: Int,
    var nombre: String,
    var paraje: String,
    var puntuacion: String,
    var foto: Int
) : RealmObject() {

    constructor() : this(-1, -1, "", "", "", -1)

}
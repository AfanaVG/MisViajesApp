package com.example.misviajesapp

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

class BaseApplication : Application(){

    override fun onCreate(){
        super.onCreate()
        Realm.init(this)
        val configuration =  RealmConfiguration.Builder()
            .name(Realm.DEFAULT_REALM_NAME)
            .schemaVersion(0)
            .deleteRealmIfMigrationNeeded()
            .build()
        Realm.setDefaultConfiguration(configuration)
    }
}
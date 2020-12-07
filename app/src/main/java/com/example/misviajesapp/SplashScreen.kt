package com.example.misviajesapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SplashScreen: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)

        //Animación
        val animacion = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba)

        val imageView = findViewById<ImageView>(R.id.img_splash)

        imageView.animation = animacion

        Handler().postDelayed({
            val intent = Intent(this, InicioActivity::class.java)
            startActivity(intent)
            finish()
        } ,3000)

    }
}
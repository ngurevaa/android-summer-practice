package com.anastasiya.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = supportFragmentManager.findFragmentById(R.id.container) as? NavHostFragment
        val controller = fragment?.navController

        findViewById<BottomNavigationView>(R.id.bnv_main).apply {
            if (controller != null) {
                setupWithNavController(controller)
            }
        }
    }
}
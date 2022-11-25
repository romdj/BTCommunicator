package com.example.btcommunicator

import android.content.Context
import android.media.session.MediaSession
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.btcommunicator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    //private lateinit var mSession: MediaSession

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);

        //  mSession = MediaSession(this, "BTCommunicator");
        // Enable callbacks from MediaButtons and TransportControls
        // mSession.setFlags(1);
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_team, R.id.navigation_map
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}
/*
fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        return super.onKeyDown(keyCode, event)
    }
    when (keyCode) {
        KeyEvent.KEYCODE_MEDIA_PLAY -> {
            yourMediaController.dispatchMediaButtonEvent(event)
            return true
        }
    }
    return super.onKeyDown(keyCode, event)
}
*/

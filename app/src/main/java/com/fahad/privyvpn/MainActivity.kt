package com.fahad.privyvpn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import com.fahad.privyvpn.ui.home.HomeScreen
import com.fahad.privyvpn.ui.theme.PrivyVPNTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrivyVPNTheme {
                HomeScreen()
            }
        }
    }
}

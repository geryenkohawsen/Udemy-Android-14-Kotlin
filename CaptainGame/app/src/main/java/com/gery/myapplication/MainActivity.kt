package com.gery.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.gery.myapplication.ui.theme.MyApplicationTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    CaptainGame(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun CaptainGame(modifier: Modifier) {
    val treasuredFound = remember { mutableStateOf(0) }
    val direction = remember { mutableStateOf("North") }

    Column {
        Text(text = "Treasure Found: ${treasuredFound.value}")
        Text(text = "Current Direction: ${direction.value}")
        Button(onClick = {
            direction.value = "East"

            // 50/50 randomizer
            if (Random.nextBoolean()) {
                treasuredFound.value += 1
            }
        }) {
            Text(text = "Sail East")
        }
        Button(onClick = {
            direction.value = "West"

            // 50/50 randomizer
            if (Random.nextBoolean()) {
                treasuredFound.value += 1
            }
        }) {
            Text(text = "Sail West")
        }
        Button(onClick = {
            direction.value = "North"

            // 50/50 randomizer
            if (Random.nextBoolean()) {
                treasuredFound.value += 1
            }
        }) {
            Text(text = "Sail North")
        }
        Button(onClick = {
            direction.value = "South"

            // 50/50 randomizer
            if (Random.nextBoolean()) {
                treasuredFound.value += 1
            }
        }) {
            Text(text = "Sail South")
        }
    }
}

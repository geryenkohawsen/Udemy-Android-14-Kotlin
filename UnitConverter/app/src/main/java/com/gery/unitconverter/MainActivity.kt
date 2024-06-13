package com.gery.unitconverter

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.gery.unitconverter.ui.theme.UnitConverterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitConverterTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    UnitConverter()
                }
            }
        }
    }
}

@Composable
fun UnitConverter() {
    Column {
        // Here all the UI elements will be stacked below each other
        Text(text = "Unit Converter")
        OutlinedTextField(value = "", onValueChange = {

        })

        Row {
            val context = LocalContext.current
            Button(onClick = {
                Toast.makeText(
                    context,
                    "Thanks for clicking!",
                    Toast.LENGTH_LONG
                ).show()
            }) {
                Text(text = "MyButton")
            }
        }
        Text(text = "Result:")
    }
}

@Preview(showBackground = true)
@Composable
fun UnitConverterPreview() {
    UnitConverter()
}

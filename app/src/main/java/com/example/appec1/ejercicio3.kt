package com.example.appec1

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun ejercicio3(){
    Box(
        Modifier
            .fillMaxSize()
            .padding(top = 30.dp)){

        var añoNac by rememberSaveable{
            mutableStateOf("")
        }

        var resultado by rememberSaveable {
            mutableStateOf("")
        }
        Column {
            Text(text = "CALCULAR EDAD", textAlign = TextAlign.Center,
                modifier= Modifier.fillMaxWidth()
            )
        OutlinedTextField(value = añoNac, onValueChange = {añoNac=it},
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "ingrese año nacimiento") },
            maxLines = 1,
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)

        )
        Button(onClick = { resultado=calcularEdad(añoNac.toInt())

        }, modifier = Modifier.fillMaxWidth())
        {
            Text(text = "calcular edad")
        }

        Text(text = resultado)


    }}
    }
    fun calcularEdad(añoNac:Int):String{
        val edad=2024-añoNac
        val mayorEdad=
            if (edad > 17) {
            "Debes tener un DNI."
             } else {
            "Eres menor de edad."
            }
         return mayorEdad
        }


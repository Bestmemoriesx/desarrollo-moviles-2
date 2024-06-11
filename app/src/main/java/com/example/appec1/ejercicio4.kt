package com.example.appec1

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun ejercicio4(){
    Box(
        Modifier
            .fillMaxSize()
            .padding(top = 30.dp)){
        var pares by rememberSaveable {
            mutableStateOf("")
        }


        Column {
            Text(text = "NUMEROS PARES COMPRENDIDOS ENTRE 20 Y 10 EN DESC", textAlign = TextAlign.Center,
                modifier= Modifier.fillMaxWidth())

            Button(
                onClick = {
                    pares = calcularPares()
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Mostrar números pares")
            }
            Text(text = pares)


        }



    }

    }
fun calcularPares(): String {
    return (20 downTo 10 step 2).toList().joinToString(", ")
}
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
fun ejercicio2(){
    Box(
        Modifier
            .fillMaxSize()
            .padding(top = 30.dp)){

        var nota1 by rememberSaveable {
            mutableStateOf("")
        }
        var nota2 by rememberSaveable {
            mutableStateOf("")
        }
        var nota3 by rememberSaveable {
            mutableStateOf("")
        }
        var nota4 by rememberSaveable {
            mutableStateOf("")
        }

        var resultado by rememberSaveable {
            mutableStateOf("")
        }

        Column {
            Text(text = "CALCULAR NOTAS", textAlign = TextAlign.Center,
                modifier= Modifier.fillMaxWidth()
            )

            OutlinedTextField(value = nota1, onValueChange = {nota1=it},
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "ingrese nota1") },
                maxLines = 1,
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)

            )
            OutlinedTextField(value = nota2, onValueChange = {nota2=it},
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "ingrese nota2") },
                maxLines = 1,
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)

            )
            OutlinedTextField(value = nota3, onValueChange = {nota3=it},
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "ingrese nota3") },
                maxLines = 1,
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)

            )
            OutlinedTextField(value = nota4, onValueChange = {nota4=it},
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "ingrese nota4") },
                maxLines = 1,
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)

            )


            Button(onClick = { resultado=calcularnota(nota1.toInt(),nota2.toInt(),nota3.toInt(),nota4.toInt())

            }, modifier = Modifier.fillMaxWidth())
            {
                Text(text = "calcular notas")
            }

            Text(text = resultado)
        }

    }

}

fun calcularnota(nota1: Int,nota2: Int,nota3: Int,nota4: Int): String {
    val notas = listOf(nota1.toDouble(), nota2.toDouble(), nota3.toDouble(), nota4.toDouble())
    val notasOrden = notas.sorted()
    val notasSinBaja = notasOrden.drop(1)
    val promedio = notasSinBaja[0] * 0.2 + notasSinBaja[1] * 0.3 + notasSinBaja[2] * 0.5
    return "el promedio del alumno es $promedio"



}

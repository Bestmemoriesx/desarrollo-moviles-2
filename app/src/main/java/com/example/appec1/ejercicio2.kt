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

        Column {
            Text(text = "CALCULAR NOTAS", textAlign = TextAlign.Center,
                modifier= Modifier.fillMaxWidth()
            )

}}}

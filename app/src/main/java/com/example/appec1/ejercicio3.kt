package com.example.appec1

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ejercicio3(){
    Box(
        Modifier
            .fillMaxSize()
            .padding(top = 30.dp)){

        var dni by rememberSaveable{
            mutableStateOf("")
        }


    }}
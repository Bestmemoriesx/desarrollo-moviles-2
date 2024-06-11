package com.example.appec1

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
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
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun formularioEc1(){
   Box(
       Modifier
           .fillMaxSize()
           .padding(top = 30.dp)){

       var hora by rememberSaveable {
           mutableStateOf("")
       }
       var minuto by rememberSaveable {
           mutableStateOf("")
       }
       var resultado by rememberSaveable {
           mutableStateOf("")
       }

       Column {
           Text(text = "CALCULAR", textAlign = TextAlign.Center,
               modifier=Modifier.fillMaxWidth()
           )
           
           OutlinedTextField(value = hora, onValueChange = {hora=it},
               modifier = Modifier.fillMaxWidth(),
               label = { Text(text = "ingrese las horas")},
               maxLines = 1,
               singleLine = true,
               keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)

               )
           OutlinedTextField(value = minuto, onValueChange = {minuto=it},
               modifier = Modifier.fillMaxWidth(),
               label = { Text(text = "ingrese los minutos")},
               maxLines = 1,
               singleLine = true,
               keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)

           )


           Button(onClick = { resultado=calcularpago(hora.toDouble(),minuto.toDouble())

                            }, modifier = Modifier.fillMaxWidth())
           {
               Text(text = "calcular pago")
           }
           
           Text(text = resultado)
           }

       }

   }

fun calcularpago(hora: Double,minuto:Double): String {
    val totalMinutos = (hora * 60 + minuto).toInt()
    val totalHoras = if (totalMinutos % 60 == 0) totalMinutos / 60 else totalMinutos / 60 + 1
    val pagoTotal = totalHoras * 1.5
    return "Total a pagar:$pagoTotal"
}


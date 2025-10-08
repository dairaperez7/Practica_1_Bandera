package com.example.practica_1_bandera.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// en un archivo todoo el diseno de mi pantalla de inicio
@Composable
fun InicioScreen(modifier: Modifier){
    Column(modifier=modifier.background(Color.White)){
        Box(modifier= Modifier.fillMaxWidth().weight(weight = 1f)){
            Row(Modifier.fillMaxWidth()){
                Box(modifier= Modifier.weight(weight = 1f).background(Color.Red).fillMaxHeight())
                Spacer(modifier=Modifier.weight(weight = 1f))
                Box(modifier=Modifier.weight(weight = 3f).background(Color.Red).fillMaxHeight())

            }
        }
        Spacer(modifier= Modifier.weight(weight = 1f))
        Box(modifier=Modifier.fillMaxWidth().weight(weight=1f)){
            Row(modifier=Modifier.fillMaxWidth()){
                Box(modifier=Modifier.weight(weight = 1f).background(Color.Red).fillMaxHeight())
                Spacer(modifier =Modifier.weight(weight = 1f))
                Box(modifier=Modifier.weight(weight = 3f).background(Color.Red).fillMaxHeight())

                }
            }

             }
        }





@Preview(showBackground = true, showSystemUi = false)
@Composable
fun InicioScreenPreview(){
    InicioScreen(modifier = Modifier
        .fillMaxSize()
        .background(Color.Gray))
}




//funciones de orden superior //

 //metodos de orden superior son los que no estan dentro de una clase//
//no afecta del orden de los factores
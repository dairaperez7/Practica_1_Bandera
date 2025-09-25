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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asComposePath
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.graphics.shapes.CornerRounding
import androidx.graphics.shapes.RoundedPolygon
import androidx.graphics.shapes.toPath

// en un archivo todoo el diseno de mi pantalla de inicio
@Composable
fun InicioScreen(modifier: Modifier) {
    Box(modifier = Modifier.fillMaxSize()) {

        Column(modifier = Modifier.background(Color.Blue).fillMaxSize()) {

            Spacer(modifier = Modifier.height(90.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .background(Color.White)
                    .height(70.dp)
            )

            Spacer(modifier = Modifier.height(90.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .background(Color.White)
                    .height(70.dp)
            )

            Spacer(modifier = Modifier.height(90.dp))

        }

    }
    Box(
        modifier = Modifier
            .size(width = 150.dp, height = 330.dp)
            .drawWithCache {
                val roundedPolygon = RoundedPolygon(
                    numVertices = 3,
                    radius =  size.height ,
                    centerX = 0f + size.width / 3,
                    centerY = size.height/2 ,
                    rounding = CornerRounding(
                        size.minDimension / 10f,
                        smoothing = 0.1f
                    )
                )
                val roundedPolygonPath = roundedPolygon.toPath().asComposePath()
                onDrawBehind {
                    drawPath(roundedPolygonPath, color = Color.Red)
                }
            }
    ) {

        Text(
            text = "★",
            color = Color.White,
            fontSize = 150.sp,
            modifier = Modifier.align(Alignment.CenterStart) //me dio hueva de otra manera pipipip
        )
    }



}





    @Preview(showBackground = true, showSystemUi = false)
    @Composable
    fun InicioScreenPreview() {
        InicioScreen(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Gray)
        )
    }





//funciones de orden superior //

 //metodos de orden superior son los que no estan dentro de una clase//
//no afecta del orden de los factores
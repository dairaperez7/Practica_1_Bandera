package com.example.practica_1_bandera.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun InicioScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF009739))
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {

            val path = Path().apply {
                moveTo(size.width / 2f, 0f)
                lineTo(size.width, size.height / 2f)
                lineTo(size.width / 2f, size.height)
                lineTo(0f, size.height / 2f)

            }
            drawPath(path, color = Color.Yellow)


            val circleRadius = size.minDimension * 0.25f
            drawCircle(
                color = Color.Blue,
                radius = circleRadius,
                center = center
            )


            val arcRect = Rect(
                center.x - circleRadius,
                center.y - circleRadius,
                center.x + circleRadius,
                center.y + circleRadius
            )
            drawArc(
                color = Color.White,
                startAngle = 200f,
                sweepAngle = 140f,
                useCenter = false,
                topLeft = arcRect.topLeft,
                size = arcRect.size,
                style = Stroke(width = 10f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewInicioScreen() {
    InicioScreen()
}

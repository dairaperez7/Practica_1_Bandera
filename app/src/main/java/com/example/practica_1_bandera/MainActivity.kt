package com.example.practica_1_bandera

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.PaintingStyle
import androidx.compose.ui.graphics.drawscope.draw
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practica_1_bandera.screens.InicioScreen
import com.example.practica_1_bandera.ui.theme.Practica_1_BanderaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Practica_1_BanderaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    InicioScreen(modifier= Modifier.padding(paddingValues = innerPadding))

//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Practica_1_BanderaTheme {
        Greeting("Android")

    }

}
@Preview(showBackground = true)
@Composable
fun rectangulo() {
    Box(modifier = Modifier) {

        Canvas(
            modifier = Modifier
                .fillMaxSize()
                .padding(0.dp, 20.dp)
        )

        {

            drawRect(
                color = Color.Green,
                topLeft = Offset(30f, 0f),
                size = Size(200f, 600f), //para importar debo clickear alt + enter)// f de float//
                style = Fill,
            )
            drawRect(
                color = Color.White,
                topLeft = Offset(200f, 0f),
                size = Size(200f, 600f), //para importar debo clickear alt + enter)// f de float//
                style = Fill,

                )
            drawRect(
                color = Color.Red,
                topLeft = Offset(400f, 0f),
                size = Size(200f, 600f), //para importar debo clickear alt + enter)// f de float//
                style = Fill,
            )
        }
            val image = painterResource(R.drawable.memories)
            Image(
                painter = image,
                contentDescription = "bandderita",
                modifier = Modifier
                    .size(60.dp)
                    .offset(85.dp,100.dp)
            )

        }

    }

//en el box es para que todos esten juntitos, el que se pone hasta abajo es el que dice quien se superpone
//canvas e image son diferentes, por ende no pueden estar dentro de las mismas llaves

// ON= Funciones y metodos que se le asignan a un evento
//scaffold background
package com.example.practica_1_bandera

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
fun Japon() {
    Row(
        modifier = Modifier.statusBarsPadding()
    ){
        Box(
            modifier = Modifier
                .weight(weight = 1f)
                .fillMaxSize()
                .background(Color.White),
            contentAlignment = Alignment.Center

                ){
            Canvas(
                modifier = Modifier
                    .size(300.dp)
            ) {
                drawCircle(
                    color = Color.Red,
                    radius = size.minDimension / 3f,
                    center = center

                )
            }
                }
    }
}


//en el box es para que todos esten juntitos, el que se pone hasta abajo es el que dice quien se superpone
//canvas e image son diferentes, por ende no pueden estar dentro de las mismas llaves

// ON= Funciones y metodos que se le asignan a un evento
//scaffold background

//evento ---> accion//
//click evento, metodo es onclick// nombre de metodo y accion que deben de tener coherencia//
//cada eventi tiene su propia accion//
//Bundle
//scaffold es una estructura inicial
//composable puede meter composables dentro de otros composables
//puedo  psar una funcion como parametro de otr
//content se pone despues de los parentesis
//practica(){
// composable} las llaves son el content
//content es un composable, el composable es una funcionq que se puede representar el formato lambda
//composable es una etiqueta donde puedo meter mas etiquetas
//innerpadding parametro
//@composable() -> Unit = {}
//ctrl + click para ver el scaffold
//topbar es opcional
//carpeta screen con funcion inicio scree
//
//funcion de extension: es una funcion que le voy a ponder a un objeto que no es mio
//composable es un objeto
//hay objetos que pueden devolver el mismo objeto
//Perro.ladrar().Comer().Beber().nombre() asi esta el modifier
//modifier.fillmaxsize().background().
//listener es el que ayuda a que suceda la accion, iria en medio del metoodo y accion
//listener es el que esta atento del evento. porque un evento tiene accion, pero alguien debe estar atento para que cuando suceda el evento se dispare la accion
//on change focus
//on key event
//al preview le podemos poner un tamano
//consejo del preview, para ver que el composable al que voy a hacerle preview no debe tener parametros
//dentro de ese composable debo llamar al otro con los parametros
//creo un metodo vacio y en ese metodo vacio llamo al que tiene parametros//
//todo lo que va despues del punto  modifierr es lo que regresa de nuevo el modifieer//
//orden del modifier importa, al ponerle los metodos hay que cuidar eso
//manzana de pedro
//por ejemplo, separando con un padding puedo hacer multiples border
//dentro de clickable va la accion
//todos los composables deben de tener un composable
//al generar el composable se hase modifier:Modifier=Modifier)
//1.nombre, 2.tipo de dato y 3.el valor
//si quiero que sea opcional pasar el modifier, paso el valor por deffault
///dejar el default me da la oportunidad de no poner parametros
//el modifier que se recibe es el que es con m minuscula si lo pusiera con M seria uno nuevo (por ejemplo en el box)
//modifier debe se der el primero
//si mi objeto no tiene valor por default va primero que mi modifier
//column,scope
//se pueden combinar columnas con renglones y reglones con columnas
//constraint checar
//hacer bandera argentina
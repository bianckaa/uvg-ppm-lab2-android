package com.example.laboratorio2

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laboratorio2.ui.theme.Laboratorio2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()
        }
    }

/*@Composable
fun DemoScreen(){
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.fondo),
            contentDescription = null,
            modifier = Modifier.matchParentSize(),
            contentScale = ContentScale.FillBounds
        )
    }
}

@Composable
fun Header(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 40.dp, horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text = "DESTINITY",
            style = TextStyle(
                color = Color(0xFF22374D),
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
        )
        Text(
            text = "Sana tú, crece él. Destiny.",
            style = TextStyle(
                color = Color(0xFF22374D),
                fontWeight = FontWeight.W300,
                fontStyle = FontStyle.Italic,
                fontSize = 16.sp
            )
        )
    }
}

@Composable
fun Toast(){
    val context = LocalContext.current

    Box(modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ){
        Button(
            onClick = {
            Toast.makeText(context, "¿Por qué me das click? :|", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier.padding(bottom = 42.dp)
        ) {
            Text(text = "¡NO ME DES CLIC!")
        }
    }
} */

// Elementos unificados en una sola Box
@Composable
fun MainScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        // Imagen de fondo
        Image(
            painter = painterResource(id = R.drawable.fondo),
            contentDescription = null,
            modifier = Modifier.matchParentSize(),
            contentScale = ContentScale.FillBounds
        )

        // Título y texto de bienvenida (slogan)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 40.dp, horizontal = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription =  null,
                modifier = Modifier.size(200.dp)
            )

            Spacer(modifier = Modifier.height(18.dp))

            Text(
                text = "DESTINITY",
                style = TextStyle(
                    color = Color(0xFFF8F2E2),
                    fontWeight = FontWeight.Bold,
                    fontSize = 40.sp
                )
            )
            Text(
                text = "Sana tú, crece él. Destiny.",
                style = TextStyle(
                    color = Color(0xFFDAE6DB),
                    fontWeight = FontWeight.W300,
                    fontStyle = FontStyle.Italic,
                    fontSize = 18.sp
                )
            )
        }

        // Boton con Toast
        val context = LocalContext.current

        Button(
            onClick = {
                Toast.makeText(context, "¿Por qué me das click? :|", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFEFC789).copy(alpha = 0.5f),
                contentColor = Color(0xFFDAE6DB)
            )
        ) {
            Text(
                text = "¡NO ME DES CLIC!",
                fontSize = 18.sp
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Laboratorio2Theme {
        MainScreen()
    }
}
}


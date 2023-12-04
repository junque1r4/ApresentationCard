package com.example.apresentationcard

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.MailOutline
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.apresentationcard.ui.theme.ApresentationCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ApresentationCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyScreen()
                }
            }
        }
    }
}

val backgroundColor = Color(0xFFE2DBAC)



@Composable
fun MyScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor), // Define o fundo
        contentAlignment = Alignment.Center // Centraliza o conteúdo dentro do Box
    ) {

        Box() {
            Image(
                painter = painterResource(id = R.drawable.background),
                contentDescription = null,
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(176.dp))

            )
            Spacer(modifier = Modifier.height(600.dp)) // Espaçamento
        }

        Box(
            contentAlignment = Alignment.Center // Centraliza o conteúdo dentro do Box
        ) {
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.test_profile),
                    contentDescription = null,
                    modifier = Modifier
                        .size(216.dp)
                        .clip(shape = RoundedCornerShape(266.dp))
                        .border(
                            width = 4.dp,
                            color = Color.White,
                            shape = CircleShape
                        )
                )
                Text(
                    text = "João Junqueira",
                    style = TextStyle(
                        fontSize = 27.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    ),
                    modifier = Modifier.align(Alignment.CenterHorizontally) // Centraliza verticalmente o texto
                )
                Text(
                    text = "Cybersecurity Analyst",
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontStyle = FontStyle.Italic,
                        color = Color.White
                    ),
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(180.dp))
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row (
                        modifier = Modifier.padding(6.dp)
                    ) {
                        Icon(Icons.Rounded.Call, contentDescription = "Localized description", tint = Color.Black)
                        Text(
                            text = "+55 12 1234-98765",
                            fontWeight = FontWeight.Bold,
                            style = TextStyle(
                                color = Color.Black
                            ),
                            modifier = Modifier.padding(start = 2.dp)
                        )
                    }
                    Row (
                        modifier = Modifier.padding(6.dp)
                    ) {
                        Icon(Icons.Rounded.MailOutline, contentDescription = "Localized description", tint = Color.Black)
                        Text(
                            text = "test@nouc.com",
                            fontWeight = FontWeight.Bold,
                            style = TextStyle(
                                color = Color.Black
                            ),
                            modifier = Modifier.padding(start = 6.dp)
                        )
                    }
                    Row (
                        modifier = Modifier.padding(6.dp)
                    ) {
                        Icon(Icons.Rounded.Share, contentDescription = "Localized description", tint = Color.Black)
                        Text(
                            text = "JoãoKRN",
                            fontWeight = FontWeight.Bold,
                            style = TextStyle(
                                color = Color.Black
                            ),
                            modifier = Modifier.padding(start = 8.dp)
                        )
                    }
                }

            }
        }


    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ApresentationCardTheme {
        MyScreen()
    }
}
package com.example.holamundo.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun Ejercicio2() {
    Column(
        modifier = Modifier
            .border(16.dp, Color.Black)
            .padding(16.dp)
            .fillMaxSize()
    ) {
        // Sección superior
        Column(modifier = Modifier.height(200.dp)) {
            Row {
                Box {
                    Text(
                        text = "Top Start",
                        modifier = Modifier
                            .background(Color.Red)
                            .width(120.dp)
                            .align(Alignment.TopStart),
                        color = Color.White
                    )
                }
                Box {
                    Text(
                        text = "Top",
                        modifier = Modifier
                            .background(Color.Blue)
                            .fillMaxHeight()
                            .width(150.dp),
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
                Box {
                    Text(
                        text = "Top End",
                        modifier = Modifier
                            .background(Color.Magenta)
                            .width(150.dp)
                            .height(50.dp),
                        color = Color.White,
                        textAlign = TextAlign.End
                    )
                }
            }
        }

        // Sección central
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Box(
                    modifier = Modifier
                        .background(Color.Green)
                        .width(160.dp)
                        .height(125.dp)
                ) {
                    Text(text = "Center Start", modifier = Modifier.align(Alignment.CenterStart))
                }
                Box(
                    modifier = Modifier
                        .background(Color.Gray)
                        .width(70.dp)
                        .height(400.dp)
                ) {
                    Text(text = "Center", modifier = Modifier.align(Alignment.Center))
                }
                Box(
                    modifier = Modifier
                        .background(Color.Black)
                        .width(160.dp)
                        .height(30.dp)
                ) {
                    Text(
                        text = "Center End",
                        modifier = Modifier.align(Alignment.CenterEnd),
                        color = Color.White
                    )
                }
            }
        }

        // Sección inferior
        Column(modifier = Modifier.fillMaxHeight()) {
            Row {
                Box(
                    modifier = Modifier
                        .background(Color.Cyan)
                        .width(95.dp)
                        .height(350.dp)
                ) {
                    Text(text = "Bottom Start", modifier = Modifier.align(Alignment.BottomStart))
                }
                Box(
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .width(180.dp)
                        .height(350.dp)
                ) {
                    Text(text = "Bottom Center", modifier = Modifier.align(Alignment.BottomCenter))
                }
                Box(
                    modifier = Modifier
                        .background(Color.Yellow)
                        .width(100.dp)
                        .height(350.dp)
                ) {
                    Text(text = "Bottom End", modifier = Modifier.align(Alignment.BottomEnd))
                }
            }
        }
    }
}

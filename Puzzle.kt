package com.example.holamundo.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Puzzle() {
    val numeros = (1..15).toList() + listOf(0)

    Box(
        modifier = Modifier
            .background(Color(0xFFD9911B))
            .padding(8.dp)
            .size(260.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            numeros.chunked(4).forEach { fila ->
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    fila.forEach { numero ->
                        Box(
                            modifier = Modifier
                                .padding(4.dp)
                                .size(60.dp)
                                .border(2.dp, Color.Black)
                                .background(
                                    when {
                                        numero == 0 -> Color(0xFFB8A382)
                                        numero % 2 == 0 -> Color.White
                                        else -> Color.Blue
                                    }
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            if (numero != 0) {
                                Text(
                                    text = numero.toString(),
                                    fontSize = 24.sp,
                                    color = if (numero % 2 == 0) Color.Blue else Color.White
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}


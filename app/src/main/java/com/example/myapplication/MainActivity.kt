package com.example.myapplication

import android.os.Bundle
import android.telephony.data.RouteSelectionDescriptor
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {

            }
        }
    }
}

@Composable
fun DashBoard() {
    Column(
        modifier = Modifier
        .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Row() {
            Box( modifier = Modifier
                .size(48.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(Color.Gray)
                )
                Column() {
                    Text(
                        text = "Алексей Иванов",
                        fontWeight = FontWeight.Bold,

                    )
                    Text(
                        text = "Android Developer",
                        color = Color.Gray
                    )
                }
            }

        Row() {
            Card() {
                Column() {
                    Text(text = "24",
                        fontWeight = FontWeight.Bold,
                        )
                    Text(text = "Projects",
                        color = Color.Gray
                    )
                }
                }
            Card() {
                    Column() {
                        Text(text = "1")
                        Text(text = "2")
                    }
                }
            Card() {
                    Column() {
                        Text(text = "1")
                        Text(text = "2")
                    }
                }
        }

        Column() {
            Text(text = "About",
                fontWeight = FontWeight.Bold,
                )
            Text(text = "Android developer from Moscow Kotlin enthusiast",
                color = Color.Gray
            )
        }

        Column() {
            Text(text = "Experience",
                fontWeight = FontWeight.Bold,
                )
            Card(modifier = Modifier
                    .size(120.dp)
                    .background(Color.Gray)){
                Column() {
                    Text(text = "Android Developer",
                        fontWeight = FontWeight.Bold,
                        )
                    Text(text = "2022 - Present",
                        color = Color.Gray
                    )
                }



            }


        }

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DashBoard();
}
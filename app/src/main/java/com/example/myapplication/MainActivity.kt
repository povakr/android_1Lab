package com.example.myapplication

import android.os.Bundle
import android.telephony.data.RouteSelectionDescriptor
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.ModifierLocalReadScope
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
        .padding(12.dp)
        .padding(top = 4.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Box( modifier = Modifier
                .size(48.dp)
                .clip(RoundedCornerShape(24.dp))
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

        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            Card(modifier = Modifier
                .height(50.dp)
                .weight(1f)
                .background(Color.White),
                border = BorderStroke(1.dp, Color(0xFFD8DCE6))

                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                            )
                        {
                            Text(
                                text = "24",
                                fontWeight = FontWeight.Bold,

                            )
                            Text(
                                text = "Projects",
                                color = Color.Gray,

                            )
                             }
                        }
                 }


            Card(modifier = Modifier
                .height(50.dp)
                .weight(1f)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "18",
                            fontWeight = FontWeight.Bold,

                            )
                        Text(
                            text = "Followers",
                            color = Color.Gray,

                            )
                    }
                }
            }

            Card(modifier = Modifier
                .height(50.dp)
                .weight(1f)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "7",
                            fontWeight = FontWeight.Bold,

                            )
                        Text(
                            text = "Posts",
                            color = Color.Gray,

                            )
                    }
                }
            }
        }

        Column(modifier = Modifier.fillMaxWidth()) {
            Text(text = "About",
                fontWeight = FontWeight.Bold,
                )
            Text(text = "Android developer from Moscow Kotlin enthusiast",
                color = Color.Gray
            )
        }

        Column(modifier = Modifier
            .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(text = "Experience",
                fontWeight = FontWeight.Bold,
                )
            Card(modifier = Modifier
                    .fillMaxWidth()
                    ){
                Column(modifier = Modifier
                    .padding(8.dp),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
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
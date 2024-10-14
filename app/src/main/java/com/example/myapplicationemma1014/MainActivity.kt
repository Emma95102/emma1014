package com.example.myapplicationemma1014

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.benchmark.perfetto.Row
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplicationemma1014.ui.theme.MyApplicationemma1014Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationemma1014Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Emma",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    //var x:Int=0
    var x by remember { mutableStateOf(0) }

    Column {
        Row {
            Button(
                onClick = {
                    x = x*2
                }
            ) {
                Text("2倍")
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "star圖片"
                )

            }
            Button(
                onClick = {
                    x = 0
                }
            ) {
                Text("歸零")
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "star圖片"
                )
            }



        }
        Text(
            text = x.toString(),
            fontSize = 50.sp,

            modifier = Modifier.clickable { x++ })


            Row {
                Text(
                    text = stringResource(R.string.autor),
                    color = Color.Blue,
                    fontSize = 30.sp,
                    fontFamily = FontFamily(Font(R.font.emma)),
                    modifier = modifier

                )
                Image(
                    painter = painterResource(id = R.drawable.bear),
                    contentDescription = "圖片"
                )

            }

            Box(
                modifier = Modifier.fillMaxSize(),

                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.bear),
                    contentDescription = "圖片"
                )
            }

        }
    }


    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        MyApplicationemma1014Theme {
            Greeting("Android")
        }
    }



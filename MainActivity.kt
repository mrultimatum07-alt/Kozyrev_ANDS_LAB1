package com.timoninkozyrev.learnandroid

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timoninkozyrev.learnandroid.ui.theme.LearnAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text(modifier = Modifier.background(color = Color.Red).padding(30.dp,16.dp,25.dp,32.dp).border(3.dp,Color.Blue, shape = CutCornerShape(4.dp)).width(60.dp),text ="Hello world",fontWeight = FontWeight.Bold, color = Color.Green,fontSize = 20.sp,fontFamily = FontFamily.Cursive)
        }
        println("Hello world!")
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
    LearnAndroidTheme {
        Greeting("Android")
    }
}
package com.tutorial.helloworldcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tutorial.helloworldcompose.ui.theme.HelloWorldComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            app()
        }
    }
}

@Preview
@Composable
fun app() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
    ) {
        item {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp),
                painter = painterResource(id = R.drawable.cypresses),
                contentDescription = "cipreses"
            )
            Text(
                text = "Campo de trigo con cipreses",
                fontSize = 32.sp,
                color = Color.White,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Text(text = "Van Goh", color = Color.White)
        }
    }
}

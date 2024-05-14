package com.tutorial.helloworldcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
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
            viewContainer()
        }
    }
}

@Composable
fun viewContainer() {
    Scaffold(
        topBar = { Toolbar()},
        content = { Content()}

    )


}

@Preview
@Composable
fun Toolbar() {
    TopAppBar(title = { Text(text = "Painter description",color= colorResource(id = R.color.white)) })

}



@Composable
fun Content() {
    var counter by rememberSaveable {
        mutableStateOf(1)
    }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
            .padding(horizontal = 16.dp)
    ) {
        item {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(280.dp),
                painter = painterResource(id = R.drawable.cypresses),
                contentDescription = "cipreses"
            )
            Row(modifier = Modifier.padding(top = 8.dp)) {
                Image(painter = painterResource(id = R.drawable.ic_tenk),
                    contentDescription = "favorites",
                    modifier = Modifier.clickable { counter++ })
                Text(
                    text = counter.toString(),
                    color = Color.White,
                    modifier = Modifier.padding(start = 4.dp)
                )

            }
            Text(
                text = "Campo de trigo con cipreses",
                fontSize = 32.sp,
                color = Color.White,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Row(
                modifier = Modifier.fillMaxWidth()

            ) {
                Text(text = "Author: ", color = Color.White)
                Text(text = "Vincent van Gogh", color = Color.White)
            }
            Row(
                modifier = Modifier.fillMaxWidth()

            ) {
                Text(text = "Technique: ", color = Color.White)
                Text(text = "Impasto technique", color = Color.White)
            }
            Row(
                modifier = Modifier.fillMaxWidth()

            ) {
                Text(text = "Cost: ", color = Color.White)
                Text(text = "2000$", color = Color.White)
            }
        }
    }
}

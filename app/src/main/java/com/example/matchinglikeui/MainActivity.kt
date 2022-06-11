package com.example.matchinglikeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.matchinglikeui.ui.theme.MatchingLikeUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MatchingLikeUITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HomeScreen()
                }
            }
        }
    }
}

@Preview
@Composable
fun HomeScreen() {
    val mediumPadding = 10.dp
    Card(
        shape = RoundedCornerShape(5.dp),
        elevation = 10.dp,
        modifier = Modifier.padding(mediumPadding)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = mediumPadding, vertical = mediumPadding)
        ) {
            Box() {
                Image(
                    painter = painterResource(id = R.drawable.sample_people),
                    contentDescription = null
                )
                FloatingActionButton(onClick = { /*TODO*/ }, modifier = Modifier.align(Alignment.BottomEnd).padding(all = 4.dp), backgroundColor = Color.White) {
                    Icon(
                        Icons.Outlined.Star, contentDescription = null, modifier = Modifier.padding(all = 4.dp), tint = Color.Gray
                    )
                }
            }
            Column(
                modifier = Modifier.padding(
                    horizontal = mediumPadding,
                    vertical = mediumPadding
                )
            ) {
                Text(
                    text = "title",
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.size(mediumPadding))
                Text(
                    text = "Content this is sample text. this is sample text. this is sample text. this is sample text.",
                    color = Color.Gray,
                    maxLines = 4,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}


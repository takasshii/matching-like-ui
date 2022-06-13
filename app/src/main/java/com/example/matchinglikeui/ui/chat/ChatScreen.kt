package com.example.matchinglikeui.ui.chat

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.matchinglikeui.R

@Preview
@Composable
fun ChatScreen() {
    val messages = List(100) {}
    Column(modifier = Modifier.fillMaxSize()) {
        LazyColumn() {
            items(items = messages) { _ ->
                ChatText()
            }
        }
        ChatTextField()
    }
}

@Composable
fun ChatText(

) {
    Row(modifier = Modifier.padding(all = 10.dp)) {
        Image(
            painter = painterResource(id = R.drawable.sample_people),
            contentDescription = "プロフィール画像",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(38.dp)
                .clip(CircleShape)
                .border(1.dp, Color.Gray, CircleShape)
        )
        Spacer(modifier = Modifier.size(10.dp))
        Column() {
            Row() {
                Text(
                    text = "名前が入ります",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.size(4.dp))
                Text(text = "3:50 PM", fontSize = 12.sp, color = Color.Gray.copy(0.2f))
            }
            Surface(
                shape = RoundedCornerShape(5.dp),
                color = Color.Gray.copy(0.1f),
                contentColor = Color.Black,
            ) {
                Text(
                    text = "メッセージだよーーーーーーーーメッセージだよーーーーーーーーメッセージだよーーーーーーーーメッセージだよーーーーーーーー",
                    fontSize = 14.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(all = 10.dp)
                )
            }
        }
    }
}

@Composable
fun ChatTextField() {
    var text by remember { mutableStateOf("") }
    var lastFocusState by remember { mutableStateOf(false)}
    Row(modifier = Modifier.fillMaxWidth()) {
        Box() {
            TextField(value = text, onValueChange = { text = it }, modifier = Modifier.onFocusChanged {  })
            if (text.isEmpty()) {
                Text(text = "メッセージを入力してください")
            }
        }
        Image(
            painter = painterResource(id = R.drawable.ic_outline_unfold_more_24),
            contentDescription = "展開します"
        )
    }
}
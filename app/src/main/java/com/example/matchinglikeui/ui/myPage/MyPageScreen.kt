package com.example.matchinglikeui.ui.myPage

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.matchinglikeui.R

@Preview
@Composable
fun MyPage() {
    Column(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.sample_people),
            contentDescription = "プロフィール画像",
            modifier = Modifier
                .size(64.dp)
                .clip(
                    CircleShape
                ).align(Alignment.CenterHorizontally)
        )
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            StatusButton(title = "ポイント", status = "216", buttonTitle = "追加")
            BetweenLine()
            StatusButton(title = "プラン", status = "無料プラン", buttonTitle = "変更")
            BetweenLine()
            StatusButton(title = "プレミアム", status = "216", buttonTitle = "変更")
        }
    }
}

@Composable
fun StatusButton(title: String, status: String, buttonTitle: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = title, color = Color.Gray, fontSize = 16.sp)
        Text(text = status, color = Color.Gray.copy(0.8f), fontSize = 20.sp)
        TextButton(onClick = { /*TODO*/ }, colors = ButtonDefaults.textButtonColors(backgroundColor = Color.Gray.copy(0.8f))) {
            Text(text = buttonTitle, color = Color.Black, fontSize = 20.sp)
        }
    }
}

@Composable
fun BetweenLine() {
    Canvas(modifier = Modifier.padding(horizontal = 10.dp)) {
        val canvasHeight = size.height
        val canvasWidth = size.width
        drawLine(
            start = Offset(x = canvasWidth, y = 0f),
            end = Offset(x = 0f, y = canvasHeight),
            color = Color.Gray,
            strokeWidth = 1F
        )
    }
}
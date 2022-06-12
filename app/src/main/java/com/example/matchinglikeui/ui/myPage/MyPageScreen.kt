package com.example.matchinglikeui.ui.myPage

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.matchinglikeui.R

@Preview
@Composable
fun MyPage() {
    Column(modifier = Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.height(10.dp))
        Image(
            painter = painterResource(id = R.drawable.sample_people),
            contentDescription = "プロフィール画像",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(128.dp)
                .clip(CircleShape)
                .align(Alignment.CenterHorizontally)
                .border(1.dp, Color.Gray, CircleShape)
        )
        Spacer(modifier = Modifier.height(10.dp))
        TextWithIcon(name = "たかっしー", batch = true)
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .height(IntrinsicSize.Min)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            StatusButton(
                title = "ポイント",
                status = "216",
                buttonTitle = "追加",
                modifier = Modifier.padding(end = 15.dp)
            )
            Divider(
                color = Color.Gray.copy(0.1f),
                modifier = Modifier
                    .fillMaxHeight()
                    .width(1.dp)
            )
            StatusButton(
                title = "プラン",
                status = "無料プラン",
                buttonTitle = "変更",
                modifier = Modifier.padding(horizontal = 15.dp)
            )
            Divider(
                color = Color.Gray.copy(0.1f),
                modifier = Modifier
                    .fillMaxHeight()
                    .width(1.dp)
            )
            StatusButton(
                title = "プレミアム",
                status = "216",
                buttonTitle = "変更",
                modifier = Modifier.padding(start = 15.dp)
            )
        }
        Spacer(
            modifier = Modifier
                .height(20.dp)
                .fillMaxWidth()
        )
    }
}

@Composable
fun TextWithIcon(name: String, batch: Boolean) {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
        Text(text = name, fontSize = 20.sp, modifier = Modifier.padding(end = 4.dp), color = Color.Black)
        if(batch) {
            Image(painter = painterResource(R.drawable.ic_baseline_verified_user_24), contentDescription = "承認済みユーザーです", colorFilter = ColorFilter.tint(Color.Blue))
        } else {
            Image(painter = painterResource(R.drawable.ic_baseline_privacy_tip_24), contentDescription = "本人確認が必要です", colorFilter = ColorFilter.tint(Color.Blue))
        }
    }
}

@Composable
fun StatusButton(title: String, status: String, buttonTitle: String, modifier: Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier) {
        Text(text = title, color = Color.Gray, fontSize = 12.sp)
        Spacer(modifier = Modifier.size(4.dp))
        Text(text = status, color = Color.Gray.copy(0.8f), fontSize = 16.sp)
        Spacer(modifier = Modifier.size(4.dp))
        TextButton(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.textButtonColors(backgroundColor = Color.Gray.copy(0.1f)),
            shape = RoundedCornerShape(10.dp),
            contentPadding = PaddingValues(4.dp),
            modifier = Modifier
                .height(25.dp)
                .width(45.dp)
        ) {
            Text(text = buttonTitle, color = Color.Black, fontSize = 12.sp)
        }
    }
}
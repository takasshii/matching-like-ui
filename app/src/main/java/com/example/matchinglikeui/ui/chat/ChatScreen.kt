package com.example.matchinglikeui.ui.chat

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*

import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.matchinglikeui.R
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatScreen() {
    // スクロール状態を格納
    val scrollState = rememberLazyListState()
    // スクロールを固定
    val scrollBehavior = remember { TopAppBarDefaults.pinnedScrollBehavior() }
    val scope = rememberCoroutineScope()
    val messages = List(100) {}
    Surface() {
        Box(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .nestedScroll(scrollBehavior.nestedScrollConnection)
            ) {

                UserInput(onMessageSent = { content ->

                },
                    resetScroll = {
                        scope.launch { scrollState.scrollToItem(0) }
                    }
                )
            }
        }
    }
}

@Composable
fun ChatText(
    message: List<Message>

) {

}

@Composable
fun Message() {
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

    }
}

@Composable
fun AuthorAndTextMessage(
    isLastMessageByAuthor: Boolean,
    isFirstMessageByAuthor: Boolean,
) {
    if (isLastMessageByAuthor) {
        AutorNameTimestamp()
    }
    ChatItemBubble()
    // 名前とメッセージの空白
    if (isFirstMessageByAuthor) {
        Spacer(modifier = Modifier.height(8.dp))
    } else {
        // メッセージ間の空白
        Spacer(modifier = Modifier.height(4.dp))
    }
}

@Composable
fun AutorNameTimestamp() {
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
}

private val ChatBubbleShape = RoundedCornerShape(4.dp, 20.dp, 20.dp, 20.dp)

@Composable
fun ChatItemBubble(
    message: Message,
    isUserMe: Boolean,
    authorClicked: (String) -> Unit
) {
    val backgroundBubbleColor = if (isUserMe) {
        MaterialTheme.colorScheme.primary
    } else {
        MaterialTheme.colorScheme.surfaceVariant
    }
    Column() {
        Surface(
            shape = ChatBubbleShape,
            color = backgroundBubbleColor,
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

@Preview
@Composable
fun ClickableMessage(

) {
    // urlを開くことができる
    val urlHandler = LocalUriHandler.current

    // Click位置を取得できる
    ClickableText(text = , onClick = )

}


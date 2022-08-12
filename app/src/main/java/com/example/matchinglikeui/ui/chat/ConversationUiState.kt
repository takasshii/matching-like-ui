package com.example.matchinglikeui.ui.chat

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.Face
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.matchinglikeui.R

class ConversationUiState {
}

data class Message(
    val author: String,
    val content: String,
    val timestamp: String,
    val image: Int? = null,
    val authorImage: ImageVector = if (author == "me") Icons.Outlined.AccountBox else Icons.Outlined.Face
)
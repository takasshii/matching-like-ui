package com.example.matchinglikeui.ui.chat

import android.media.Image

sealed class Content {
    class Text(val text:String): Content()
    class Sticker(val sticker: Image): Content()
    class Media(val image: Image): Content()
}

val notEmpty: (String) -> Boolean = { it.isNotEmpty() }



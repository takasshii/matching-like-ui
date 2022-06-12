package com.example.matchinglikeui.domain

import com.example.matchinglikeui.R


sealed class BottomNavItem(val title:String, var Icon:Int, val screen_route: String) {
    object Home: BottomNavItem("Home", R.drawable.ic_outline_home_24, "home")
    object Discover: BottomNavItem("Discover", R.drawable.ic_outline_explore_24, "Discover")
    object Chatting: BottomNavItem("Chatting", R.drawable.ic_outline_sms_24, "Chatting")
    object MyPage: BottomNavItem("MyPage", R.drawable.ic_outline_account_circle_24, "MyPage")
}

package com.example.matchinglikeui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.matchinglikeui.ui.discover.DiscoverScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.matchinglikeui.ui.myPage.MyPage


@Composable
fun NavigationGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController, startDestination = BottomNavItem.Home.screen_route, modifier = modifier) {
        composable(BottomNavItem.Home.screen_route) {
            DiscoverScreen()
        }
        composable(BottomNavItem.Discover.screen_route) {
            DiscoverScreen()
        }
        composable(BottomNavItem.Chat.screen_route) {
            DiscoverScreen()
        }
        composable(BottomNavItem.MyPage.screen_route) {
            MyPage()
        }
    }
}

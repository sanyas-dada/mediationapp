package com.example.mediationapp.ui.theme

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mediationapp.R

@Composable
fun BottomView() {
    val listNavigationItem: List<BottomMenuContent> = listOf(
        BottomMenuContent("Home", R.drawable.ic_home),
        BottomMenuContent("Mediate", R.drawable.ic_calming_sound),
        BottomMenuContent("Sleep", R.drawable.ic_viedo),
        BottomMenuContent("Music", R.drawable.ic_headphone),
        BottomMenuContent("Profile", R.drawable.ic_home)
    )
    Row(modifier = Modifier
        .padding(15.dp),
        ) {
        listNavigationItem.forEachIndexed { index, item ->

        }

    }
}

@Composable
fun ShowNavigation(navigation: Any) {

}

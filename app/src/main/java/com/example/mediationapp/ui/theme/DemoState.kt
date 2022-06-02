package com.example.mediationapp.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Demo() {
    val peoples = remember{dick.doSomething}
    LazyRow(modifier = Modifier.padding(15.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)

    ) {
        items(peoples){ demo ->
            ContentItems(demo)
        }
    }
}

@Composable
fun ContentItems(boxes: Disease) {
    Box(
        modifier = Modifier
            .size(100.dp, 45.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(boxes.backgrcolor),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = boxes.Name,
            color = Color.White
        )
    }
}

@Preview
@Composable
fun Amazing(){
    Demo()
}


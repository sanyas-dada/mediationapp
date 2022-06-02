package com.example.mediationapp.ui.theme

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.nio.file.Files.size

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun GridView() {
    val grid = remember {
        dick.doNothing
    }
    LazyVerticalGrid(
        modifier = Modifier
            .padding(15.dp)
            .fillMaxWidth(),
        cells = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(grid) { showGrid -> ShowGrid(grid = showGrid) }
    }
}

@Composable
fun ShowGrid(grid: GridSystemView) {
    Box(
        modifier = Modifier
            .size(200.dp, 200.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(grid.backgrcolor)
    ) {
        Column(
            modifier = Modifier.padding(15.dp),
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Text(
                text = grid.Name,
                fontSize = 25.sp,
                fontWeight = Bold,
                modifier = Modifier.weight(1f)
            )
            Row(horizontalArrangement = Arrangement.spacedBy(40.dp)) {
                Icon(
                    modifier = Modifier
                        .size(40.dp)
                        .align(Alignment.CenterVertically),
                    tint=Color.White,
                    painter = painterResource(id = grid.drawable),
                    contentDescription = null
                )
                Box(
                    modifier = Modifier
                        .size(80.dp, 40.dp)
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color.Magenta),
                    contentAlignment = Alignment.Center,
                ) {
                    Text(
                        text = grid.text, textAlign = TextAlign.End)
                }
            }
        }
    }
}

@Preview
@Composable
fun Amazing3() {
    GridView()
}




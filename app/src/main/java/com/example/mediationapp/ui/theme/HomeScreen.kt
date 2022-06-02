package com.example.mediationapp.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mediationapp.R

@Composable
fun HomeScreen() {

    Box(
        modifier = Modifier
            .background(DeepBlue)
            .fillMaxSize()
    ) {
        Column {
            GreetingSection()
            GreedSection()
            DailyThought()
            Featured()
            GridView()

        }
        BottomMenu(items = listOf(
            BottomMenuContent("Home",R.drawable.ic_home),
            BottomMenuContent("Mediate",R.drawable.ic_calming_sound),
            BottomMenuContent("Sleep",R.drawable.ic_viedo),
            BottomMenuContent("Music",R.drawable.ic_headphone),
            BottomMenuContent("Profile",R.drawable.ic_home)

        ), modifier = Modifier.align(Alignment.BottomCenter))
    }


}


@Composable
fun Featured() {
    Text(
        text = "Featured",
        color = Color.White,
        fontSize = 25.sp,
        fontWeight = Bold,
        modifier = Modifier.padding(15.dp)
    )
}

@Composable
fun GreetingSection(name: String = "Sanyas") {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {
        Column(modifier = Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(5.dp)) {
            Text(
                text = "Good Morning, $name",
                color = Color.White,
                fontSize = 15.sp
            )

            Text(
                text = "We wish you have a good day!",
                fontSize = 10.sp,
                color = Color.White

            )
        }
        Icon(
            painter = painterResource(id = R.drawable.ic_search),
            modifier = Modifier.align(alignment = Alignment.CenterVertically),
            tint = Color.White,
            contentDescription = "search"
        )
    }
}

@Composable
fun GreedSection() {
    Demo()
    /* Row(
         modifier = Modifier
             .padding(15.dp),
         horizontalArrangement = Arrangement.spacedBy(10.dp)
     ) {
         Box(
             modifier = Modifier
                 .size(100.dp, 45.dp)
                 .clip(RoundedCornerShape(10.dp))
                 .background(Whatis),
             contentAlignment = Alignment.Center
         ) {
             Text(
                 text = "Sweet sleep",
                 color = Color.White
             )
         }
         Box(
             modifier = Modifier
                 .size(100.dp, 45.dp)
                 .clip(RoundedCornerShape(10.dp))
                 .background(Thisis),
             contentAlignment = Alignment.Center
         ) {
             Text(
                 text = "Insomnia",
                 color = Color.White
             )
         }
         Box(
             modifier = Modifier
                 .size(100.dp, 45.dp)
                 .clip(RoundedCornerShape(10.dp))
                 .background(Thisis),
             contentAlignment = Alignment.Center
         ) {
             Text(
                 text = "Depression",
                 color = Color.White
             )
         }
     }*/
}

@Composable
fun DailyThought() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            .padding(15.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Fuck),
        contentAlignment = Alignment.Center
    ) {
        Row(modifier = Modifier.padding(10.dp)) {
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(5.dp)
            ) {
                Text(
                    text = "Daily Thought",
                    fontSize = 16.sp,
                    color = Color.White
                )
                Text(
                    text = "Mediation.3-10 min",
                    fontSize = 10.sp,
                    color = Color.White
                )
            }
            Icon(
                painter = painterResource(id = R.drawable.ic_viedo_player),
                modifier = Modifier.align(alignment = Alignment.CenterVertically),
                tint = Whatis,
                contentDescription = "search"
            )

        }

    }
}

@Composable
fun BottomMenu(
    items: List<BottomMenuContent>,
    modifier: Modifier = Modifier,
    activeHighligtColor: Color = Color.Blue,
    activeTextColor: Color = Color.White,
    inactiveTextColor: Color = Color.Magenta,
    initialSelectedItemIndex: Int = 0
) {
    var selectedItemIndex by remember {
        mutableStateOf(initialSelectedItemIndex)
    }
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .background(DeepBlue)
            .padding(15.dp)
    ) {
        items.forEachIndexed { index, item ->
            BottomMenuItem(
                item = item,
                isSelected = index == selectedItemIndex,
                activeHighligtColor = activeHighligtColor,
                activeTextColor = activeTextColor,
                inactiveTextColor = inactiveTextColor
            ) {
                selectedItemIndex = index
            }
        }
    }
}

@Composable
fun BottomMenuItem(
    item: BottomMenuContent,
    isSelected: Boolean = false,
    activeHighligtColor: Color = Color.Blue,
    activeTextColor: Color = Color.White,
    inactiveTextColor: Color = Color.Magenta,
    onItemClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.clickable { onItemClick() }
    ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .background(if (isSelected) activeHighligtColor else Color.Transparent)
                .padding(10.dp)
        ) {
            Icon(
                painter = painterResource(id = item.iconId),
                contentDescription = item.title,
                tint = if (isSelected) activeTextColor else inactiveTextColor,
                modifier = Modifier.size(20.dp)
            )
        }
        Text(text = item.title, color = if (isSelected) activeTextColor else inactiveTextColor)
    }


}

/*@Preview
@Composable
fun doSomething() {
    HomeScreen()*/
@Preview
@Composable
fun doSomething2() {
  BottomMenu(items =  listOf(
      BottomMenuContent("Home",R.drawable.ic_home),
      BottomMenuContent("Mediate",R.drawable.ic_calming_sound),
      BottomMenuContent("Sleep",R.drawable.ic_viedo),
      BottomMenuContent("Music",R.drawable.ic_headphone),
      BottomMenuContent("Profile",R.drawable.ic_home)))
}
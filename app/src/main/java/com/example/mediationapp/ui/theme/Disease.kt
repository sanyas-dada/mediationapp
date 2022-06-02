package com.example.mediationapp.ui.theme

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import com.example.mediationapp.R

data class Disease(val backgrcolor:Color,val Name:String)
data class GridSystemView(val backgrcolor: Color, val Name:String, @DrawableRes val drawable:Int, val text:String)

// bottom navigation vie
data class BottomMenuContent(val title:String,@DrawableRes val iconId:Int)


val sweetSleep = Disease(Whatis,"SweetSleep")
val insomnia = Disease(Thisis,"Insomnia")
val depression = Disease(Fuck,"Depression")
val enegertic = Disease(Whatis,"Energetic")
val talkActive = Disease(Whatis,"TalkActive")

val grid1 = GridSystemView(Grid1,"Sleep mediation", R.drawable.ic_headphone,"Start")
val grid2 = GridSystemView(Grid2,"Tips for sleeping", R.drawable.ic_viedo,"Start")
val grid3 = GridSystemView(Grid3,"Night island", R.drawable.ic_night_iceland,"Start")
val grid4 = GridSystemView(Grid4,"Calming sounds", R.drawable.ic_calming_sound,"Start")
val grid5 = GridSystemView(Grid1,"Hip-Hop Music", R.drawable.ic_feeling_good,"Start")
val grid6 = GridSystemView(Grid2,"Alpha Phase", R.drawable.ic_headphone,"Start")



val listofDisease = listOf(
    sweetSleep,
    insomnia,
    depression,
    enegertic,
    talkActive
)

object  dick {
    val doSomething:List<Disease> = listofDisease
    val doNothing:List<GridSystemView> = listOf(grid1, grid2, grid3, grid4, grid5, grid6)
}
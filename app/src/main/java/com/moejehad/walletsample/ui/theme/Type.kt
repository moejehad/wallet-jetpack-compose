package com.moejehad.walletsample.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.moejehad.walletsample.R

val tajawal = FontFamily(
    Font(R.font.tajawal_bold, FontWeight.Bold),
    Font(R.font.tajawal_medium, FontWeight.Medium),
    Font(R.font.tajawal_regular, FontWeight.Normal)
)

val Typography = Typography(

    titleLarge = TextStyle(
        fontFamily = tajawal,
        fontWeight = FontWeight.Bold,
        fontSize = 25.sp
    ),

    titleMedium = TextStyle(
        fontFamily = tajawal,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
    ),

    labelSmall = TextStyle(
        fontFamily = tajawal,
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
    )
)
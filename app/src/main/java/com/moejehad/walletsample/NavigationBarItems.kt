package com.moejehad.walletsample


sealed class NavigationBarItems(
    val icon: Int,
    var route: String
) {

    object Home : NavigationBarItems(
        icon = R.drawable.ic_home,
        route = "home_screen"
    )


    object Profile : NavigationBarItems(
        icon = R.drawable.ic_person,
        route = "profile_screen"
    )

    object Settings : NavigationBarItems(
        icon = R.drawable.ic_settings,
        route = "setting_screen"
    )

}

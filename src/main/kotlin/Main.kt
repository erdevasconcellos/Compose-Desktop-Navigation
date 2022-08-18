import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import navigation.Navigator

fun main() = application {

    Window(
        onCloseRequest = ::exitApplication,
        title = "Navigation Compose (for Desktop and others)"
    ) {

        Navigator.run {
            addScreen(route = ScreensRoutes.MainScreen.route, isHome = true) {
                MainScreen()
            }
            addScreen(route = ScreensRoutes.DetailScreen.route) {
                DetailScreen()
            }
            renderUI()
        }

    }
}




import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import navigation.Navigator

fun main() = application {

    Window(
        onCloseRequest = ::exitApplication,
        title = "Navigation Compose (for Desktop and others)"
    ) {

        //Añadimos un composable y lo marcamos como pantalla principal (isHome = true)
        Navigator.addScreen(route = ScreensRoutes.MainScreen.route, isHome = true) {
            MainScreen()
        }

        //Añadimos la segunda pantalla
        Navigator.addScreen(route = ScreensRoutes.DetailScreen.route) {
            DetailScreen()
        }

        //Renderizamos la interfaz
        Navigator.renderUI()

    }
}




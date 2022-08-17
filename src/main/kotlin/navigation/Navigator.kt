package navigation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import kotlinx.coroutines.flow.MutableStateFlow

object Navigator {

    private val screens = HashMap<String, @Composable ()->Unit>()
    private val currentScreen = MutableStateFlow<String>("")
    private var homeScreen = ""

    fun addScreen(route: String, isHome: Boolean = false, contentView: @Composable ()->Unit) {
        screens[route] = contentView

        if (isHome) homeScreen = route
    }

    @Composable
    fun renderUI() {

        if (currentScreen.value.isBlank()) {
            currentScreen.value = homeScreen
        }

        val composable = currentScreen.collectAsState()

        AnimatedVisibility(visible = true) {
            screens[composable.value]?.let{ it() }
        }
    }

    fun navigate(route: String) {
        currentScreen.value = route
    }
}
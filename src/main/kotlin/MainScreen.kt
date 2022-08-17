import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import navigation.Navigator

@Composable
fun MainScreen() {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Pantalla principal",
            fontSize = 80.sp
        )

        Button(
            onClick = { Navigator.navigate(ScreensRoutes.DetailScreen.route) },
            modifier = Modifier.align(Alignment.BottomCenter)
        ){
            Text(
                text = "Ir la segunda pantalla"
            )
        }
    }

}
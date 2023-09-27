import androidx.compose.runtime.Composable

actual fun getPlatformName(): String = "Desktop"

@Composable
fun DesktopApp() {
    App()
}
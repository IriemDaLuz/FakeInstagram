import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Preview
@Composable
fun App() {
    Column {
        Text("FakeInstagram")
        Divider()
        //Historias
        Column {
            Text("Historias")
            Column {
                Row { }//Fotos
                Row { }//Nombre
            }
        }
        Divider()
        //Cuerpo de la app
        Row {
            Column {

            }//Publicaciones
            Column {  }//Sugerencias
        }

    } //Column cierre llave
} //Cierre llave App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "FakeInstagram",
        state = rememberWindowState(width = 425.dp, height = 300.dp)
    ) {
        App()
    }
}

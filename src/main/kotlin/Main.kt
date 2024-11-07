import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
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
        Row { //Publicaciones
            //Publicacion1
            Column {
                Text("Publicaciones")//Titulo de la seccion
                Image()//Foto de la publicacion
                Row {
                    Image()//Foto autor
                    Text()//Nombre autor
                }
                Text()//Descripción
            }
            //Publicacion2
            Column {
                Text("Publicaciones")//Titulo de la seccion
                Image()//Foto de la publicacion
                Row {
                    Image()//Foto autor
                    Text("")//Nombre autor
                }
                Text("")//Descripción
            }

            //Sugerencias
            Column {
                Text("Sugerencias")//Titulo de la seccion
                Text("Personas")//Sugerencias-Personas
                Box {
                    //Cada Row es una Persona
                    accounts.forEach { account ->
                        Row(modifier = Modifier.padding(10.dp)) {
                            Image(
                                modifier = Modifier.clip(CircleShape),
                                painter = painterResource(resourcePath = (account.image)),
                                contentDescription = "Foto"
                            )
                            Column(modifier = Modifier.padding(start = 10.dp)) {
                                Text(account.name)
                            }
                        }
                    }

                }
                Text("Sugerencias")//Sugerencias-Fotos
                Box {
                    publicaciones.forEach { publicacion ->
                        Row(modifier = Modifier.padding(10.dp)) {
                            Image(
                                modifier = Modifier.clip(CircleShape),
                                painter = painterResource(resourcePath = (publicacion.image)),
                                contentDescription = "Foto"
                            )
                        }
                    }
                    publicaciones.forEach { publicacion ->
                        Row(modifier = Modifier.padding(10.dp)) {
                            Image(
                                modifier = Modifier.clip(CircleShape),
                                painter = painterResource(resourcePath = (publicacion.image)),
                                contentDescription = "Foto"
                            )
                        }
                    }
                }
            }
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

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Preview
@Composable
fun App() {
    Column {
        Text(
            text = "FakeInstagram",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            modifier=Modifier.fillMaxWidth()
        )

        Divider(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))
        //Historias
        Column(modifier = Modifier.padding(25.dp,bottom=10.dp)) {
            Text(
                text="Historias",
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                modifier = Modifier.padding(top = 10.dp)
            )
            Row(
                horizontalArrangement = Arrangement.Start) {
                accounts.forEach { account ->
                    Column(modifier = Modifier.padding(15.dp)) {
                        Image(
                            modifier = Modifier.clip(CircleShape).size(70.dp),
                            painter = painterResource(resourcePath = (account.image)),
                            contentDescription = "Foto"
                        )
                    }
                }
            }
        }
        Divider(modifier = Modifier.padding(top = 10.dp, bottom = 5.dp))
        //Cuerpo de la app
        Row(modifier = Modifier.fillMaxHeight().padding(25.dp,bottom=10.dp)) {
            //Publicaciones
            Column(modifier = Modifier.weight(3f)) {
                Text(
                    "Publicaciones",
                    fontWeight = FontWeight.Bold, fontSize = 18.sp
                )
                publicaciones.forEach { publicacion ->
                    Image(
                        modifier = Modifier.fillMaxWidth().size(240.dp),
                        painter = painterResource(resourcePath = (publicacion.publicacion)),
                        contentDescription = "Foto"
                    )
                    Row(modifier = Modifier.padding(top = 5.dp)){
                        Image(
                            modifier = Modifier.clip(CircleShape).size(60.dp),
                            painter = painterResource(resourcePath = (publicacion.image)),
                            contentDescription = "Foto"
                        )

                        Text(publicacion.name,
                            fontSize = 16.sp,
                            modifier = Modifier.padding(20.dp,top = 20.dp, bottom = 0.dp))
                    }
                    Text(publicacion.descripcion,
                        fontSize = 12.sp,
                        modifier = Modifier.padding(bottom = 20.dp))
                }
            }

            Column (modifier=Modifier.weight(2f)){ }//Hacer un hueco entre publicaciones y sugerencias

            //Sugerencias
            Column(modifier = Modifier.weight(5f)){
                //Titulo de la seccion
                Text(
                    text="Sugerencias",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                    )

                //Sugerencias-Personas
                Text(
                    text="Personas",
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(top = 10.dp)
                )
                Column(modifier = Modifier.padding(10.dp)) {
                    //Cada Row es una Persona
                    accounts.forEach { account ->
                        Row(modifier = Modifier.padding(10.dp)) {
                            Image(
                                modifier=Modifier.clip(CircleShape).size(80.dp),
                                painter = painterResource(resourcePath = (account.image)),
                                contentDescription = "Foto",
                            )
                            Column(modifier = Modifier.padding(start = 10.dp)) {
                                Text(account.name,
                                    fontSize = 16.sp,
                                    modifier = Modifier.padding(10.dp,top = 25.dp, bottom = 0.dp))

                            }
                        }
                    }

                }
                //sugerencias-Fotos
                Text(
                    text="Fotos",
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(top = 10.dp)
                )
                Column (modifier = Modifier.padding(top=5.dp).fillMaxSize()){
                    sugPublicacion.forEach { publicacion ->
                        Column(modifier = Modifier.padding(10.dp)){
                            Image(
                                modifier=Modifier.size(80.dp),
                                painter = painterResource(resourcePath = (publicacion.image)),
                                contentDescription = "Foto"
                            )
                        }
                    }
                    sugPublicacion.forEach { publicacion ->
                        Column(modifier = Modifier.padding(10.dp)){
                            Image(
                                modifier = Modifier.padding(10.dp),
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
        state = rememberWindowState(width = 800.dp, height = 800.dp)
    ) {
        App()
    }
}


data class Account(val name : String, val image: String)//Cuentas
val accounts = listOf<Account>(
    Account("Unay Porez","img/accounts/img2.jpeg"),
    Account("Fornondo Mentelongo","img/accounts/img1.jpeg"),
    Account("Pabio Raton","img/accounts/img3.jpeg")
)

data class sugPublicaciones(val image: String)//Sugerencias Fotos
val sugPublicacion = listOf<sugPublicaciones>(
    sugPublicaciones("img/publicaciones/publicacion6.jpeg"),
    sugPublicaciones("img/publicaciones/publicacion5.jpeg"),
    sugPublicaciones("img/publicaciones/publicacion3.jpeg"),
    sugPublicaciones("img/publicaciones/publicacion4.jpeg")
)

data class Publicaciones(val name: String,val image: String,val publicacion: String,val descripcion :String)//Publicaciones
val publicaciones = listOf<Publicaciones>(
    Publicaciones("Unay Porez","img/accounts/img2.jpeg","img/publicaciones/publicacion2.jpeg","In the Dark"),
    Publicaciones("Fornondo Mentelongo","img/accounts/img1.jpeg","img/publicaciones/publicacion1.jpeg","Sun & Beach"),
   )
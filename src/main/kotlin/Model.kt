
data class Account(val name : String, val image: String)
val accounts = listOf<Account>(
    Account("Unay Porez","img/accounts/img2.jpeg"),
    Account("Fornondo Mentelongo","img/accounts/img1.jpeg"),
    Account("Pabio Raton","img/accounts/img3.jpeg"),
    Account("Chimon Otaku","img/accounts/img4.jpeg"),
    Account("Esclavo Nigga","img/accounts/img5.jpeg")
)

data class sugPublicaciones(val image: String)
val sugPublicacion = listOf<sugPublicaciones>(
    sugPublicaciones("img/publicaciones/publicacion1.jpeg"),
    sugPublicaciones("img/publicaciones/publicacion2.jpeg"),
    sugPublicaciones("img/publicaciones/publicacion3.jpeg"),
    sugPublicaciones("img/publicaciones/publicacion4.jpeg"),
    sugPublicaciones("img/publicaciones/publicacion5.jpeg"),
    sugPublicaciones("img/publicaciones/publicacion6.jpeg")
)

data class Publicaciones(val name: String,val image: String,val publicacion: String,val descripcion :String)
val publicaciones = listOf<Publicaciones>(
    Publicaciones("Unay Porez","img/accounts/img2.jpeg","img/publicaciones/publicacion2.jpeg","In the Dark"),
    Publicaciones("Fornondo Mentelongo","img/accounts/img1.jpeg","img/publicaciones/publicacion1.jpeg","Sun & Beach"),
   )
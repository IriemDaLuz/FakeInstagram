
data class Account(val name : String, val image: String)
val accounts = listOf<Account>(
    Account("Unay Porez","img1.jpeg"),
    Account("Fornondo Mentelongo","img2.jpeg"),
    Account("Pabio Raton","img3.jpeg")
)

data class sugPublicaciones(val image: String)
val sugPublicaciones = listOf<sugPublicaciones>(
    sugPublicaciones("publicacion1.jpeg"),
    sugPublicaciones("publicacion2.jpeg"),
    sugPublicaciones("publicacion3.jpeg"),
    sugPublicaciones("publicacion4.jpeg"),
    sugPublicaciones("publicacion5.jpeg"),
    sugPublicaciones("publicacion6.jpeg")
)

data class Publicaciones(val name: String,val image: String,val publicacion: String,val descripcion :String)
val publicaciones = listOf<Publicaciones>(
    Publicaciones("Unay Porez","img1.jpeg","publicacion1.jpeg","Sun & Beach"),
    Publicaciones("Fornondo Mentelongo","img2.jpeg","publicacion2.jpeg","In the Dark"),
   )
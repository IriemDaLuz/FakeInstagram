
data class Account(val name : String,val apellido : String, val image: String)//Cuentas
val accounts = listOf<Account>(
    Account("Unay","Porez","img/accounts/img2.jpeg"),
    Account("Fornondo","Mentelongo","img/accounts/img1.jpeg"),
    Account("Pabio","Raton","img/accounts/img3.jpeg")
)
data class Account2(val name : String,val apellido : String, val image: String)//Cuentas
val accounts2 = listOf<Account2>(
    Account2("FcBarcelona","Football","img/accounts/img7.jpg"),
    Account2("Spiderman","Marvel","img/accounts/img8.png"),
    Account2("Jordi","ENP","img/accounts/img9.jpg")
)

data class sugPublicaciones(val image: String)//Sugerencias Fotos
val sugPublicacion = listOf<sugPublicaciones>(
    sugPublicaciones("img/publicaciones/publicacion6.jpeg"),
    sugPublicaciones("img/publicaciones/publicacion5.jpeg"),
    sugPublicaciones("img/publicaciones/publicacion3.jpeg"),
    sugPublicaciones("img/publicaciones/publicacion7.jpeg")
)
data class sugPublicaciones2(val image: String)//Sugerencias Fotos
val sugPublicacion2 = listOf<sugPublicaciones2>(
    sugPublicaciones2("img/publicaciones/publicacion1.jpeg"),
    sugPublicaciones2("img/publicaciones/publicacion2.jpeg"),
    sugPublicaciones2("img/publicaciones/publicacion4.jpeg"),
    sugPublicaciones2("img/publicaciones/publicacion8.jpeg")
)

data class Publicaciones(val name: String,val image: String,val publicacion: String,val descripcion :String)//Publicaciones
val publicaciones = listOf<Publicaciones>(
    Publicaciones("Unay Porez","img/accounts/img2.jpeg","img/publicaciones/publicacion2.jpeg","In the Dark. #g4y #pride"),
    Publicaciones("Fornondo Mentelongo","img/accounts/img1.jpeg","img/publicaciones/publicacion1.jpeg","Sun & Beach. #amigosm0r0s #negr0s"),
   )
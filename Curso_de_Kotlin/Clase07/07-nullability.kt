package clase7

fun main(){

    var emailObligatorio:String = "user@email.com"
    var emailOpcional : String? = null


    val longitudForzada = emailOpcional?.length ?: 0

    println("Longitud de email: ${longitudForzada}")
    

    println("\n=== EJERCICIO ===")
    println("Crea variables para: email (obligatorio), nombre (opcional)")
    println("Usa ?: para mostrar 'Anónimo' si nombre es null")
    println("Usa ?. para obtener la longitud del nombre de forma segura")

    val miEmail: String = "maria@email.com"
    val miNombre: String? = null

    val nombreMostrar = miNombre ?: "Anónimo"
    val longitudNombre = miNombre?.length ?: 0
    println("Email: $miEmail - Usuario: $nombreMostrar - Longitud: $longitudNombre")
}

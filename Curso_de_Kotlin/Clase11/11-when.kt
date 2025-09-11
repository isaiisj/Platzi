package clase11

fun main(){

    val email = "juan@gmail.com"

    val tipoDeUsuario = when{
        email.contains("admin")-> {
            "Administrador"
        }
        email.contains("support")-> "Soporte"
        else ->"Usuario normal"
    }

    val proveedor = readLine()

    when(proveedor){
        "gmail" -> println("Google Mail")
        "yahoo" -> println("Yahoo Mail")
        "outlook" -> println("Microsoft Outlook")
        else -> println("Otro proovedor")
    }

    val elEmailEsValido = email.contains("@") && email.contains(".com")
    val esGmail = email.contains("gmail")

    when{
        elEmailEsValido && esGmail ->{
            println("Es un correo valido del proveedor gmail")
        }
        elEmailEsValido ->{
            println("Es un correo valido.")
        }
        else->{
            println("Es un correo no valido.")
        }
    }

    println("\n=== EJERCICIO ===")
    println("Crea una función 'evaluarPassword' que use when para:")
    println("1. Si longitud >= 8: 'Fuerte'")
    println("2. Si longitud >= 6: 'Media'")
    println("3. Si no: 'Débil'")

    val password = readLine()?:""
    println(evaluarPassword(password))


    println("El tipo se usuario de email $email es $tipoDeUsuario")


}

fun evaluarPassword(password: String): String {
    return when {
        password.length >= 8 -> "Fuerte"
        password.length >= 6 -> "Media"
        else -> "Débil"
    }
}

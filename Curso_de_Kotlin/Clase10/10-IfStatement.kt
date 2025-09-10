package clase10

fun leerEmail(): String{
    println("Ingresa tu email: ")
    val email =readLine()?.trim() ?: "Sin correo"
    return email
}

fun leerPassword(): String{
    println("Ingresa tu contraseña: ")
    val email =readLine()?.trim() ?: ""
    return email
}

fun main(){

    val email = leerEmail()
    if (email.contains("@")){
        println("El email tiene formato valido")
    } else {
        println("El email no es valido")
    }

    val password = leerPassword()

    if (password.length>=8){
        println("Contraseña fuerte")
    }
    else if (password.length>=6){
        println("Contraseña media")
    }
    else{
        println("Contraseña no segura")
    }

    val nivelDeSeguridad = if (password.length>=8){
        "alto"
    }
    else if (password.length>=6){
        "medio"
    }
    else{
        "bajo"
    }


    println("Nivel de seguridad de contraseña es:$nivelDeSeguridad")

    println("\n=== EJERCICIO ===")
    println("Crea una función llamada 'clasificarEmail' que:")
    println("1. Reciba un email como parámetro")
    println("2. Use if/else if para clasificar:")
    println("   - Si contiene 'admin': 'Administrador'")
    println("   - Si contiene 'support': 'Soporte'")
    println("   - Si no: 'Usuario normal'")
    println("3. Devuelva la clasificación")
    println("4. Imprimir la clasificación")

    println(clasificarEmail("admin@empresa.com"))      // Administrador
    println(clasificarEmail("support@empresa.com"))    // Soporte
    println(clasificarEmail("juan@empresa.com"))       // Usuario normal
}

fun clasificarEmail(email: String): String {
    return if (email.contains("admin")) {
         "Administrador"
    } else if (email.contains("support")) {
         "Soporte"
    } else {
         "Usuario normal"
    }
}

package clase9

fun mostrarBienvenida(){
    println("=====Sistema de email=====")
    println("Bienvenido al gestor de emails")
}

fun saludarUsuario(nombre: String = "Usuario"){
    println("Hola $nombre, tienes nuevos emails")
}

fun leerEmail(): String{
    println("Ingresa tu email: ")
    val email =readLine()?.trim() ?: "Sin correo"
    return email
}

fun leerAsunto(): String{
    println("Ingresa el asunto: ")
    val asunto =readLine()?.trim() ?: "Sin asunto"
    return asunto
}

fun leerMensaje(): String{
    println("Ingresa el mensaje: ")
    val mensaje =readLine()?.trim() ?: "Sin Mensaje"
    return mensaje
}

fun createMessageEmail(destinatario: String, asunto: String, mensaje: String){
    println("======================")
    println("EMAIL CREADO ")
    println("======================")
    println("Para: $destinatario")
    println("Aunto: $asunto")
    println("Mensaje: $mensaje")
    println("======================")
}

fun enviarEmail(){
    println("Email enviado!")
}

fun leerDatosCompletos(): String {
    print("Ingresa tu nombre: ")
    val nombre = readLine()?.trim() ?: "Anónimo"

    print("Ingresa tu email: ")
    val email = readLine()?.trim() ?: "sin-email"

    return "Usuario: $nombre - Email: $email"
}

fun main(){
    mostrarBienvenida()
    saludarUsuario("Juan")
    val email = leerEmail()
    val asunto = leerAsunto()
    val message =leerMensaje()
    createMessageEmail(
        mensaje =  message,
        destinatario = email,
        asunto = asunto
    )
    enviarEmail()

    println("\n=== EJERCICIO ===")
    println("Crea una función llamada 'leerDatosCompletos' que:")
    println("1. No reciba parámetros")
    println("2. Use readLine() para pedir nombre y email")
    println("3. Devuelva un mensaje con los datos")
    println("Luego úsala en main()")

    println(leerDatosCompletos())
}

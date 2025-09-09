package clase8

fun main(){

    println("======Sistema de EMAIL=====")
    print("Ingresa tu email:")
    val email= readLine() ?:"Sin Email"

    print("Ingresa el destinatario:")
    val destinatario = readLine()?:"Sin email"

    print("Ingrese el asunto:")
    val asunto = readLine()?:"Sin asunto"

    println("Para:$destinatario")
    println("Asunto:$asunto")

    print("Ingresa el mensaje:")
    val mensajeSinLimpiar = readLine()
    val mensajeLimpio = mensajeSinLimpiar?.trim()

    println("=====================")
    println("VISTA PREVIA DE EMAIL")
    println("=====================")

    println("De:$email")
    println("Para:$destinatario")
    println("Asunto:$asunto")
    println("Mensaje:$mensajeLimpio")
    println("=====================")
    
}

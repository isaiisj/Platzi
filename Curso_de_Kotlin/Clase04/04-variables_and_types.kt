package clase4

fun main(){

    val nombreUsuario = "Juan"
    var emailNoLeidos = 5

    emailNoLeidos = 3

    println( "Usuario: $nombreUsuario, Emails:$emailNoLeidos")

    val totalEmail:Int = 150
    val totalEmail2:Long = 150
    val porcentaje: Float = 75.5f
    val porcentaje2: Double = 150.2
    val asunto: String = "Reunión"
    val esUrgente: Boolean = true


    val numero = 42

    val comoTexto = numero.toString()
    val textoNumero = "25".toInt()

    println(numero)
    println(textoNumero)

    val leidos= 15
    val totales = 20

    val porcentajeEmails =  leidos.toFloat()/totales

    println(porcentajeEmails)

    println("\n=== EJERCICIO ===")
    println("Crea: nombre (val), emails recibidos/enviados (var)")
    println("Calcula porcentaje de emails enviados")

    val nombre = "María"
    var recibidos = 12
    var enviados = 8
    val porcentajeEnviados = (enviados.toFloat() / (recibidos + enviados)) * 100
    println("$nombre - Enviados: ${porcentajeEnviados}%")
}

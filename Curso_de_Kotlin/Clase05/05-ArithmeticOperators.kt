package clase5

fun main(){

    val emailsRecibidos= 25
    val emailsEnviados = 15
    val emailsEliminados = 3

    val totalEmails = emailsRecibidos + emailsEnviados
    val diferencia = emailsRecibidos - emailsEnviados
    val dobleEmails = emailsRecibidos * 2
    val promedio = totalEmails /  2
    val residuo = emailsRecibidos % 7   // 25- 21 = 4

    println("Total : $totalEmails, promedio: $promedio, Residuo:$residuo")

    val calculo = 10 + 5 * 2
    println(calculo)
    val calculo2 = (10+5) * 2
    println(calculo2)

    val emailsPorSemana = emailsEnviados*7 + emailsRecibidos*7
    println(emailsPorSemana)

    var contador = 10
    println(contador)
    contador += 1
    println(contador)
    contador-=2
    println(contador)
    contador*=2
    println(contador)
    contador/=2
    println(contador)
    contador-=1
    contador%=2
    println(contador)

    println("\n=== EJERCICIO ===")
    println("Calcula: Calcula el incremento en porcentaje de emails enviados ayer vs los enviados hoy")

    val emailsHoy = 12
    val emailsAyer = 8

    val incremento = emailsHoy - emailsAyer
    val porcentajeIncremento = (incremento.toFloat() / emailsAyer) * 100
    println(porcentajeIncremento)
}

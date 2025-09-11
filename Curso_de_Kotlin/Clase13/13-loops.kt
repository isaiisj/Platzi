package clase13

fun main(){

    var emailPendientes = 0

    while (emailPendientes>0){
        println ("Procesando email. Quedan :$emailPendientes email")
        emailPendientes-=1
    }

    var intentos = 0

    do {
        intentos+=1
        println("Intento de envio de correo:$intentos")
    } while (intentos<2)

    for (i in 0 .. 5){
        println("El valor de i es $i")
    }
    var i = 0
    while (i<=5){
        println("El valor de i es $i")
        i++
    }

    for (i in 5 downTo  0){
        println("El valor de i es $i")
    }

    for (i in 0 .. 10 step 2){
        println("El valor de i es $i")
    }

    val emails = arrayOf("juan@empresa.com", "carlos@empresa.com", "wilson@empresa.com")

    for (email in emails){
        println("Correo actual $email")
    }
    var indiceEmail=0
    while (indiceEmail<= emails.size-1){
        println("Correo actual ${emails.get(indiceEmail)}")
        indiceEmail++
    }

    println("\n=== EJERCICIO ===")
    println("Crea una lista de 3 emails usando for y readline")
    println("Luego recórrela con while y cuenta cuántos contienen '@'")

    val misEmails = mutableListOf<String>()

    for (i in 1..3) {
        print("Email #$i: ")
        val email = readLine()?.trim() ?: "email$i@test.com"
        misEmails.add(email)
    }

    var contador = 0
    var pos = 0
    while (pos < misEmails.size) {
        if (misEmails[pos].contains("@")) {
            contador++
        }
        pos++
    }

    println("Emails válidos: $contador")


    // Otra solucion ligeramente diferente
    /*

    val listadeEmails = mutableListOf<String>()

    for(i in 0..2){
        println("Introduce un correo:")
        listadeEmails.add(readLine() ?: "email$i@test.com")
    }

    var countAt = 0
    var index = 0
    while(index < listadeEmails.size){
        if (listadeEmails[index].contains("@")){
            countAt++
        }
        index++
    }

    println("El numero de correos que contienen @ son: $countAt")
    
    */

}

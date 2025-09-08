package clase6

fun main(){
    val emailRecibidos = 15
    val emailsEnviados = 16
    val limiteEmails = 20

    val tieneEmails = emailRecibidos > 16
    val excedeEnviados  = emailsEnviados >= limiteEmails

    println("Tiene emails ? ${tieneEmails} ")
    println("Alcanzamos el limite de emails enviados ? ${excedeEnviados} ")

    val sonIguales = emailRecibidos == emailsEnviados

    println("Son iguales ? :$sonIguales")
    val sonDiferentes = emailRecibidos != emailsEnviados
    println("Son diferentes? :$sonDiferentes ")


    val email = "user@example.com"
    val password = "1234"

    val tieneArroba = email.contains("@")
    val tienePunto = email.contains(".com")
    val esEmailValido = tieneArroba && tienePunto //AND


    println("Es email valido? $esEmailValido")

    val passwordCorto = password.length < 6
    val passwordLargo = password.length > 20
    val passwordProblematico = passwordCorto || passwordLargo // OR
    println("Es una contraseña problematica ? $passwordProblematico")

    val emailInvalido = !esEmailValido //! true- false  false - true

    print("Es un email invalido?$emailInvalido")

    println("\n=== EJERCICIO ===")
    println("Valida email: debe tener @ y ., no debe contener 'test'")
    println("Valida que no sea spam: asunto no debe tener 'GRATIS' o 'URGENTE'")

    val emailTest = "usuario@correo.com"
    val asuntoTest = "Reunión de trabajo"

    val emailOk = emailTest.contains("@") && emailTest.contains(".") && !emailTest.contains("test")
    val noEsSpam = !asuntoTest.contains("GRATIS") && !asuntoTest.contains("URGENTE")
    val emailAceptable = emailOk && noEsSpam

    println("Email aceptable: $emailAceptable")

}

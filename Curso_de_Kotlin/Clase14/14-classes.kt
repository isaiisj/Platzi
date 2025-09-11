package clase14

class Email(
    val asunto: String,
    val remitente: String,
    val mensaje: String
){
    var leido: Boolean = false

    fun marcarComoLeido(){
        leido = true
    }

    fun getterLeido(): Boolean{
        return leido
    }
    fun setterLeido(leido: Boolean){
        this.leido = leido
    }

    fun marcarComoNoLeido(){
        leido = false
    }

    fun mostrarLaInfo(){
        println("De: $remitente | Asunto:$asunto | Leído:$leido")
    }
}

class BandejaEmails{
    val emails =mutableListOf<Email>()

    fun agregarUnEmail(email:Email){
        emails.add(email)
    }
    fun contarNoLeidos():Int{
        var contador = 0
        for (email in emails){
            if(!email.leido)
                contador ++
        }
        return contador
    }
}

fun main(){
    val email1= Email(
        asunto = "Reunion viernes",
        "carlos@email.com",
        mensaje = "No se te olvide nuestra reunion para el viernes"
    )
    val email2= Email(
        asunto = "Reunion viernes",
        "carlos@email.com",
        mensaje = "No se te olvide nuestra reunion para el viernes"
    )
    val email3= Email(
        asunto = "Reunion viernes",
        "carlos@email.com",
        mensaje = "No se te olvide nuestra reunion para el viernes"
    )

    val bandejaEmails= BandejaEmails()

    bandejaEmails.agregarUnEmail(email1)
    bandejaEmails.agregarUnEmail(email2)
    bandejaEmails.agregarUnEmail(email3)

    println("Faltan por leer: ${bandejaEmails.contarNoLeidos()}")

    println("\n=== EJERCICIO ===")
    println("Crea una clase 'Contacto' con:")
    println("- Propiedades: nombre, email")
    println("- Método: mostrarContacto()")

    val contacto = Contacto("María", "maria@email.com")
    contacto.mostrarContacto()

}

class Contacto(val nombre: String, val email: String) {

    fun mostrarContacto() {
        println("$nombre - $email")
    }
}

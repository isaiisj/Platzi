package clase12

fun main(){
    //Array 0,1,2
    val emails = arrayOf("juan@empresa.com", "carlos@empresa.com", "wilson@empresa.com")
    val  cantidadDeCorreos = arrayOf(1,15,50,100)

    println("El primer correo es : ${emails[0]}")
    println("El segundo correo es : ${emails[1]}")
    println("El tercer correo es : ${emails[2]}")

    emails[0]="nuevocorreojuan@empresa.com"
    emails.set(0, "nuevocorreojuan@empresa.com")
    println("El primer correo es : ${emails[0]}")
    println("La lista de correos es:${emails.joinToString()}")

    println("El tamaños del array es :${emails.size}")

    val nuevaListaDeEmails = mutableListOf<String>()
    println("Nueva lista : ${nuevaListaDeEmails.joinToString ()} tamaño:${nuevaListaDeEmails.size}")
    nuevaListaDeEmails.addAll(arrayOf("juan@empresa.com","carlos@empresa.com", "wilson@empresa.com"))
    println("Nueva lista : ${nuevaListaDeEmails.joinToString ()} tamaño:${nuevaListaDeEmails.size}")
    nuevaListaDeEmails.remove("juan@empresa.com")
    println("Nueva lista : ${nuevaListaDeEmails.joinToString ()} tamaño:${nuevaListaDeEmails.size}")
    nuevaListaDeEmails.add(0,"juan@empresa.com")
    println("Nueva lista : ${nuevaListaDeEmails.joinToString ()} tamaño:${nuevaListaDeEmails.size}")

    val listOfEmails = listOf<String>("juan@empresa.com", "carlos@empresa.com", "wilson@empresa.com")
    val nuevalista= listOfEmails.subList(1,3)
    println("Nueva lista: ${nuevalista.joinToString()}")
    val primerElemento = listOfEmails.first()
    val ultimoElemento = listOfEmails.last()
    val indexLastElement = listOfEmails.lastIndex
    println("Primer elemento: $primerElemento")
    println("Ultimo elemento: $ultimoElemento y su indice = $indexLastElement")


    println("\n=== EJERCICIO ===")
    println("Crea una lista mutable de asuntos de email y:")
    println("1. Agrega 3 asuntos diferentes")
    println("2. Modifica el segundo asunto")
    println("3. Elimina el primer asunto")
    println("4. Muestra la lista final y su tamaño")

    val asuntosEmail = mutableListOf<String>()


    asuntosEmail.add("Reunión de equipo")
    asuntosEmail.add("Reporte mensual")
    asuntosEmail.add("Invitación evento")
    println("Lista inicial: $asuntosEmail")


    asuntosEmail[1] = "Reporte semanal"
    println("Después de modificar: $asuntosEmail")

    asuntosEmail.removeAt(0)
    println("Después de eliminar: $asuntosEmail")

    println("Lista final: $asuntosEmail")
    println("Tamaño final: ${asuntosEmail.size}")


    // Otra forma de resolver el ejercicio
    /* 
  
    val asuntosEmail = mutableListOf("Reunion de equipo", "Reporte mensual","Invitacion de evento")
    asuntosEmail.set(1,"Reporte semanal")
    asuntosEmail.removeFirst()
    println("Lista de asuntos de email: ${asuntosEmail.joinToString()}")
    
    */

}

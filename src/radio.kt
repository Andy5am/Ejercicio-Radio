package main

fun main (args: Array<String>) {
    var radio = Radio(false, 20, "Am", 99.9)
    println(radio)

    println("""
       Radio:
       1. Encender
       2. Salir
   """.trimIndent())
    var opcion = "0"
    while (opcion != "2") {
        print("Que opcion desea?:")
        var opcion = readLine()!!
        if (opcion == "1") {
            println("""
                Radio:
                1. Cambiar a Am
                2. Cambiar a Fm
                3. Subir volumen
                4. Bajar volumen
                5. Subir emisora
                6. Bajar emisora
                7. Apagar
            """.trimIndent())
            var opcion2 = "0"
            while (opcion2 != "7")
            println("Que opcion desea?: ")
            var opcion2 = readLine()!!
            if (opcion2 == "1") {
                radio.ponerAm()
                println(radio)
            } else if (opcion2 == "2") {
                radio.ponerFm()
                println(radio)
            } else if (opcion2 == "3") {
                radio.subirvol()
                println(radio)
            } else if (opcion2 == "4") {
                radio.bajarvol()
                println(radio)
            } else if (opcion2 == "5") {
            }
        }


    }
}
class Radio(
        var encendido: Boolean = false,
        var volumen: Int,
        var emisora: String,
        var NumEmisora: Double
        ) {
    fun encender() {
        encendido = true
    }

    fun apagar() {
        encendido = false
    }

    fun ponerAm() {
        emisora = "Am"
    }

    fun ponerFm() {
        emisora = "Fm"
    }
    fun subirvol(){
        volumen+= 1
    }
    fun bajarvol(){
        volumen-=1
    }
    override fun toString(): String {
        return """
            Radio:
                Esta encendido: $encendido
                Esta en: $emisora
                Sintoniza la emisora: $NumEmisora
                El volumen es de: $volumen
        """.trimIndent()
    }
}

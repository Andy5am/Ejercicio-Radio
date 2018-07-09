package main

fun main (args: Array<String>) {
    var radio = Radio(false, 20, "Am", 99.9)
    println(radio)
    var opcion = true
    while (opcion != false) {
        println("""
       Radio:
       1. Encender
       2. Salir
   """.trimIndent())
        print("Que opcion desea?:")
        var respuesta = readLine()!!
        if (respuesta == "1") {
            var opcion2 = true
            while (opcion2 != false) {
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
                print("Que opcion desea?: $opcion2 ")
                var respuesta2 = readLine()!!
                if (respuesta2 == "1") {
                    radio.ponerAm()
                    println(radio)
                } else if (respuesta2 == "2") {
                    radio.ponerFm()
                    println(radio)
                } else if (respuesta2 == "3") {
                    radio.subirvol()
                    println(radio)
                } else if (respuesta2 == "4") {
                    radio.bajarvol()
                    println(radio)
                } else if (respuesta2 == "5") {

                } else if (respuesta2 == "6") {

                } else if (respuesta2 == "7") {
                    radio.apagar()
                    opcion2 = false
                    println(radio)
                } else {
                    println("Opcion invalida")
                }
            }
        } else if (respuesta =="2"){
            println("Adios")
            opcion = false
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

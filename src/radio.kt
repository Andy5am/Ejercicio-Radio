package main

fun main (args: Array<String>) {
    var radio = Radio(false, 20, "Fm", 95.0)
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
                    if (radio.emisora== "Am" &&(radio.NumEmisora<=1400.0 )) {
                        println("Cuanto desea subir la emisora?: ")
                        var numero2: String = readLine()!!
                        radio.subirEst(numero2)
                        println(radio)
                    } else if (radio.emisora== "Fm" &&(radio.NumEmisora<104.0 )) {
                        println("Cuanto desea subir la emisora?: ")
                        var numero2: String = readLine()!!
                        radio.subirEst(numero2)
                        println(radio)
                    } else {
                        println("No puede subir mas de emisora")
                    }

                } else if (respuesta2 == "6") {
                    if (radio.emisora== "Am" &&(radio.NumEmisora>=1000.0 )) {
                        println("Cuanto desea bajar la emisora?: ")
                        var numero2: String = readLine()!!
                        radio.bajarEst(numero2)
                        println(radio)
                    } else if (radio.emisora== "Fm" &&(radio.NumEmisora>=87.0 )) {
                        println("Cuanto desea bajar la emisora?: ")
                        var numero2: String = readLine()!!
                        radio.bajarEst(numero2)
                        println(radio)
                    } else {
                        println("No puede bajar mas de emisora")
                    }

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
        NumEmisora = 1200.0
    }

    fun ponerFm() {
        emisora = "Fm"
        NumEmisora = 95.0
    }
    fun subirvol(){
        if(volumen<100){
            volumen+=1
        }else{
            println("No puede subir mas volumen")
        }
    }
    fun bajarvol(){
        if (volumen>0){
            volumen-=1
        }else{
            println("No puede bajar mas volumen")
        }
    }
    fun subirEst(num:String){
        NumEmisora+=num.toDouble()
        if (NumEmisora> 104.0 &&(emisora== "Fm")){
            NumEmisora-=num.toDouble()
            println("No puede subir ese numero de emisoras")
        }else if (NumEmisora> 1400.0&&(emisora=="Am")) {
            NumEmisora -= num.toDouble()
            println("No puede subir ese numero de emisoras")
        }
    }
    fun bajarEst(num2: String){
        NumEmisora-=num2.toDouble()
        if (NumEmisora< 87.0 &&(emisora == "Fm")) {
            NumEmisora -= num2.toDouble()
            println("No puede bajar ese numero de emisoras")
        } else if (NumEmisora< 1000.0&&(emisora== "Am")) {
            NumEmisora -= num2.toDouble()
            println("No puede subir ese numero de emisoras")
        }
    }
    override fun toString(): String {
        return """
            Radio:
                Esta encendido: $encendido
                Frecuencia: $emisora
                Emisora: $NumEmisora
                Volumen: $volumen
        """.trimIndent()
    }
}

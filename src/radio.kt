package main

fun main (args: Array<String>){
    var radio = radio(false,20, "Am",99.9 )
    println(radio)

    radio.encender()
    radio.ponerFm()

    println(radio)




}
class radio(
        var encendido: Boolean = false,

        var volumen: Int,
        var emisora: String,
        var NumEmisora: Double
        ){
    fun encender(){
        encendido= true
    }
    fun apagar(){
        encendido= false
    }
    fun ponerAm(){
        emisora = "Am"
    }
    fun ponerFm(){
        emisora="Fm"
    }
    fun ajustarVol(){
        volumen = readLine("")
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
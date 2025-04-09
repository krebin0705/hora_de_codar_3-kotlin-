
fun main() {
    for (i in 30 downTo 0) {
        println("Contagem: $i")
        Thread.sleep(1000) // Pausa de 1 segundo (1000 milissegundos)
    }
    println("💥 EXPLOSÃO 💥")
}

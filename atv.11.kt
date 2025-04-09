
fun main() {
    print("Digite um valor N (maior que zero): ")
    val n = readLine()?.toIntOrNull()

    if (n == null || n <= 0) {
        println("Valor inválido. Digite um número inteiro maior que zero.")
        return
    }

    println("\n--- Tabuadas de 1 até $n ---\n")

    for (i in 1..n) {
        println("Tabuada do $i:")
        for (j in 1..10) {
            println("$i x $j = ${i * j}")
        }
        println() // linha em branco entre as tabuadas
    }
}

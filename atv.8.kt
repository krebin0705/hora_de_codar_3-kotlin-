fun main() {
    print("Digite um valor N (maior que zero): ")
    val n = readLine()?.toIntOrNull()

    if (n == null || n <= 0) {
        println("Valor inválido. N deve ser um número inteiro maior que zero.")
        return
    }

    println("Números de 1 até $n:")
    for (i in 1..n) {
        println(i)
    }
}

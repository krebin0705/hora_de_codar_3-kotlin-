fun main() {
    var soma = 0
    var quantidade = 0

    for (i in 15..100) {
        soma += i
        quantidade++
    }

    val media = soma.toDouble() / quantidade
    println("A média aritmética dos números de 15 a 100 é: $media")
}

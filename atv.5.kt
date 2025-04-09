fun main() {
    print("Digite o primeiro número (menor): ")
    val primeiro = readLine()?.toIntOrNull() ?: return println("Entrada inválida.")

    print("Digite o segundo número (maior): ")
    val segundo = readLine()?.toIntOrNull() ?: return println("Entrada inválida.")

    if (primeiro >= segundo) {
        println("O primeiro número deve ser MENOR que o segundo.")
        return
    }

    var soma = 0
    var quantidade = 0

    for (i in primeiro..segundo) {
        soma += i
        quantidade++
    }

    val media = soma.toDouble() / quantidade
    println("A média aritmética dos números de $primeiro a $segundo é: $media")
}

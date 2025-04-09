fun main() {
    print("Digite o primeiro valor: ")
    val primeiro = readLine()?.toDoubleOrNull() ?: 0.0

    var segundo: Double

    while (true) {
        print("Digite o segundo valor (maior que zero): ")
        segundo = readLine()?.toDoubleOrNull() ?: -1.0

        if (segundo > 0) {
            break
        } else {
            println("Valor inválido! O segundo valor deve ser MAIOR que zero.")
        }
    }

    val resultado = primeiro / segundo
    println("Resultado da divisão: $primeiro / $segundo = $resultado")
}

fun main() {
    var dentroIntervalo = 0
    var foraIntervalo = 0

    for (i in 1..10) {
        print("Digite o valor $i: ")
        val valor = readLine()?.toIntOrNull()

        if (valor == null) {
            println("Valor inválido! Tente novamente.")
            continue
        }

        if (valor in 24..42) {
            dentroIntervalo++
        } else {
            foraIntervalo++
        }
    }

    println("\nQuantidade de valores dentro do intervalo [24, 42]: $dentroIntervalo")
    println("Quantidade de valores fora do intervalo: $foraIntervalo")
}

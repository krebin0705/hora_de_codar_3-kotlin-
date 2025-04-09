fun main() {
    val totalNotas = 6
    var somaNotas = 0.0

    for (i in 1..totalNotas) {
        var notaValida: Double? = null

        while (notaValida == null) {
            print("Digite a nota $i (de 0 a 10): ")
            val input = readLine()?.toDoubleOrNull()

            if (input != null && input in 0.0..10.0) {
                notaValida = input
                somaNotas += notaValida
            } else {
                println("Nota inválida! Digite um valor entre 0 e 10.")
            }
        }
    }

    val media = somaNotas / totalNotas
    println("Média final do aluno: $media")
}

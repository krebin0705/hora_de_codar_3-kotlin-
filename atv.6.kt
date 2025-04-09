fun main() {
    var alunosAprovados = 0

    do {
        print("Digite a primeira nota do aluno: ")
        val nota1 = readLine()?.toDoubleOrNull() ?: continue

        print("Digite a segunda nota do aluno: ")
        val nota2 = readLine()?.toDoubleOrNull() ?: continue

        val media = (nota1 + nota2) / 2
        println("Média final: $media")

        if (media >= 9.5) {
            println("Aluno APROVADO! 🎉")
            alunosAprovados++
        } else {
            println("Aluno REPROVADO. 😞")
        }

        print("Calcular a média de outro aluno? (S/N): ")
        val resposta = readLine()?.trim()?.uppercase()

    } while (resposta == "S")

    println("\nQuantidade de alunos aprovados: $alunosAprovados")
}

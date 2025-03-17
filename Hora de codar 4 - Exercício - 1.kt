fun main() {
    val estudantes = mutableListOf<String>()

    do {
        print("Digite o nome do estudante (ou 'PARE' para finalizar): ")
        val entrada = readLine()?.trim()
        if (!entrada.isNullOrEmpty() && !entrada.equals("PARE", ignoreCase = true)) {
            estudantes.add(entrada)
        }
    } while (!entrada.equals("PARE", ignoreCase = true))

    println("\nQuantidade de estudantes cadastrados: ${estudantes.size}")
    estudantes.forEachIndexed {index, estudante -> println("${index + 1}. $estudante")
    }
}

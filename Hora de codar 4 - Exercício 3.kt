fun main() {
    val frutas = mutableListOf("Maçã", "Banana", "Laranja", "Abacaxi", "Morango")

    while (frutas.isNotEmpty()) {
        println("Lista de frutas: $frutas")
        println("Digite o nome de uma fruta para remover:")

        val fruta = readLine()?: ""

        if (frutas.contains(fruta)) {
            frutas.remove(fruta)
            println("Fruta foi retirada da lista")
        } else {
            println("Fruta indisponível no nosso mercado")
        }
    }

    println("Lista de compras finalizada")
}

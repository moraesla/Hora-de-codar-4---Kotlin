fun main(){

    val planetas = arrayOf("Terra" , "Marte" , "Plutão" , "Vênus" , "Júpiter" , "Saturno")

    println("Informe o nome de um planeta: ")
    val nome = readlnOrNull()?.trim()

    if(nome in planetas){
        println("O planeta $nome está na lista!")
    }
    else{
        println("O planeta $nome não está na lista!")
    }
}



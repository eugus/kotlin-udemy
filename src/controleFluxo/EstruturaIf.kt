package controleFluxo

fun maiorDeIdade(idade: Int){
    if (idade > 18){
        println("Maior de idade")
    }else{
        println("Menor de idade")
    }
}

fun saudacao(dia: Boolean): String {
    return if (dia){
        "Bom dia"
    }else {
        "Boa noite"
    }

}

fun main() {

    maiorDeIdade(19)
    maiorDeIdade(12)
    println( saudacao(false))



}
package funcao

fun main() {

    var str = "Kotlin language"

    println(str.length)

    println("Posição 0: ${str[8]}")
    println(str.startsWith("Ko"))
    println(str.endsWith("ge"))

    println(str.substring(0, 1))

    println(str.replace("Kotlin", "Kotlin mac"))


    println(str.lowercase())
    println(str.uppercase())
    println("         trim         ".trim())

}
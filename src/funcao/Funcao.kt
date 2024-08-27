package funcao

fun main() {

    fun helloName(nameUser: String): String {
        return "Hello, $nameUser"
    }

    val name =  "Luis"

    helloName("Silva")

    println(helloName(name))

    fun teste(): Unit{
    }

    teste()

    println("a somma é ${sum(2,8)}")

}

fun sum (a: Int, b: Int): Int {
    return a + b
}
fun main() {
    name()
    println("Hello, Bridget")
    add()
    sum(67,56,96,57)
    fact()
}
fun name(){
    var name = "Bridget"
    println("Hello" + " "  + name)
}

fun add(){
    var b = 86
    var c = 17
    var sum = b % c
    println(sum)
}

fun sum(num1:Int, num2:Int, num3:Int, num4:Int,){
    var sum = num1 + num2 + num3 + num4
    println(sum)
}

fun fact(){
    var fact = "I love myself and i strive to achieve my goals"
    println(fact)
}
package basic

class Person(
        val name: String,
        val isMarried: Boolean
)

class Rectangle(
        val height: Int,
        val width: Int
) {
    val isSquare: Boolean get() = height == width
}

fun main(args: Array<String>) {
    val x = 3
    println(max(x, y = 4))

    val person = Person("Bob", true)
    println(person.name)
    println(person.isMarried)

    val rectangle = Rectangle(100, 100)
    println(rectangle.isSquare)
}

fun max(x: Int, y: Int) = if (x > y) x else y
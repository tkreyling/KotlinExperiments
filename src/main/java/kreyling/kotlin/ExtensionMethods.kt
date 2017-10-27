package kreyling.kotlin

fun MutableList<Int>.addToAll(number: Int) {
    val iterate = listIterator()
    while (iterate.hasNext()) {
        val oldValue = iterate.next()
        iterate.set(oldValue + number)
    }
}

fun MutableList<String>.addToAll(appendix: String) {
    val iterate = listIterator()
    while (iterate.hasNext()) {
        val oldValue = iterate.next()
        iterate.set(oldValue + appendix)
    }
}

fun <T> MutableList<T>.removeLast() {
    removeAt(size - 1)
}


fun main(args: Array<String>) {
    val someList = arrayListOf(1, 20, 10, 55, 30, 22, 11, 0, 99)
    someList.addToAll(10)
    someList.removeLast()
    println(someList)

    val someStringsList = arrayListOf("", "foo", "wurst")
    someStringsList.addToAll("bar")
    someStringsList.removeLast()
    println(someStringsList)
}
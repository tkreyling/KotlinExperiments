package kreyling.kotlin


fun main(args: Array<String>) {


    fun longMethod(string: String?): String? {
        if (string == null) return null

        // Some lengthy code
        // ...
        // ...
        // ...
        // ...

        return ""
    }

    fun String.customExtensionLength() = this.length
    fun customLength(string: String?) = string?.length

    data class Person(val name: String?, val age: Int?)

    run {
        val person = Person(name = "Thomas", age = 35)
        println(person.name?.customExtensionLength() ?: 0)

        val nullName = Person(name = null, age = 35)
        println(nullName.name?.customExtensionLength() ?: 0)

        val nullPerson: Person? = null
        println(nullPerson?.name?.customExtensionLength() ?: 0)
    }

    run {
        val person = Person(name = "Thomas", age = 35)
        println(customLength(person.name) ?: 0)

        val nullName = Person(name = null, age = 35)
        println(customLength(nullName.name) ?: 0)

        val nullPerson: Person? = null
        println(customLength(nullPerson?.name) ?: 0)
    }


    run {
        val meaningOfLife: String? = null

        when (meaningOfLife) {
            null -> println("There's no meaning")
            else -> println(meaningOfLife.toUpperCase()) //non-nullable here
        }
    }

    run {
        val meaningOfLife: String? = null

        when (meaningOfLife) {
            is String -> println(meaningOfLife.toUpperCase()) //non-nullable here
            else -> println("There's no meaning")
        }
    }

}

val name : String = "Peter"
var surname = "Welcome"
var age = 18


data class Human (var name : String = "Peter", var surname : String = "asd", var age : Int? = null)

var hairColor: String? = null

fun main () {
    val human : Human? = Human ()


    var names = arrayListOf<Human>()

    names.add(Human (name = "John"))
    names.add(Human ())


    names.forEach {
        print(it)
    }

    val something = names.map {
         it.name
    }.sortedBy { it > "asdas" }.filter { it == "Peter" }.first()


    print("Hello ${human?.name} ${human?.surname} is ${human?.age} ")

    print (resultsFromService(Result.Success(human?.name)))

    print (functionName)

    human?.surname?.createHuman()
    print ("Peter".createHuman().name)

    JavaClass("")

    print (1 add 2)
}

sealed class Result<out T> {
    data class Success<out T> (val value : T) : Result<T>()
    data class Error(val error : MyError) : Result<MyError>()
}

class MyError


fun <T>resultsFromService(result : Result<T>) : String  {

    when (result) {
        is Result.Success -> return "${result.value} World"
        is Result.Error -> return result.error.toString()
    }
    return ""
}

val functionName = addition(2,2)

fun hello (func : (String) -> String ): (String) -> String {
    fun world () {

    }
    return  func
}

fun String.createHuman () : Human {
    return Human(name = this)
}

infix fun Int.add (value : Int) : Int = this + value

fun addition( one :Int, two : Int ) : Int {

    return  one.plus(two)
}
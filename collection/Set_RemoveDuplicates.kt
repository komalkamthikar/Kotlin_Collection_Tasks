package collection

fun main(){

    var duplicates= mutableListOf<String>("Anil","Ankit","kumar","Manish","Ankit","Gopal","Anil")
    println(duplicates)

    var removeDuplicate=duplicates.toSet()
    println("After removing duplicate: $removeDuplicate")
}
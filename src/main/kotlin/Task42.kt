import java.util.*
//Declaring Sets
var list1 : MutableSet<String>? = null
var allcaps : MutableSet<String>? = null
fun main() {
    val scanner = Scanner(System.`in`)
    list1 = mutableSetOf()
    allcaps = mutableSetOf()
    // Taking inout from user (no of Strings)
    print("Enter the number of Strings :  ")
    var N = scanner.nextInt()
    scanner.nextLine()

    //taking string Inputs
    while (N > 0){
        print("Enter Name : ")
        val input = scanner.nextLine()
        list1?.add(input)
        N--

    }
    //turning it to uppercase to ignore case
    list1?.forEach(){
        allcaps?.add(it.toUpperCase())
    }
    // using Filter List
    val filterlist1 = allcaps?.filter {
        it.contains("A") || it.contains("M")
    }
    // printing them in uppercase
    println("The words that have 'M' or 'A' are : ")
    filterlist1!!.forEach(){
        println(it)
    }

}

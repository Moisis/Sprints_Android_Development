import java.util.Scanner

/*
* Task #4
* Using lists and loops write  a program that takes an integer N as an input from user ,
* then create a List of Strings with Size N
* That list is filled with the user
* for each item in the list if it contains Characters A or M (ignore case )
* print the String in uppercase
* */
var list2 : MutableSet<String>? = null
fun main() {
    val scanner = Scanner(System.`in`)
     list2 = mutableSetOf()
   print("Enter the number of Strings :  ")
   var N = scanner.nextInt()
    scanner.nextLine()

    while (N > 0){
        print("Enter Name : ")
        val input = scanner.nextLine()
        list2?.add(input)
        N--

    }
    println("The words that have 'M' or 'A' are : ")
    for (i in 0 until list2?.size!!){
        if(check(list2!!.elementAt(i).toUpperCase())){
            println(list2!!.elementAt(i).toUpperCase())
        }
    }
}
fun check (x : String ) : Boolean {
  for(i in x.indices){
     if (x[i]== 'A' || x[i]==  'M' ){
         return true
     }
  }
return false
}


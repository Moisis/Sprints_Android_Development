/*
*Task # 3
*  Write a program using loops that draws a square with dimentions of (10x10) using "*"
*
* */

import java.util.*

fun main() {
    println("Enter Number of Rows : ")
    val rows  = Scanner(System.`in`).nextInt()
    println("Enter Number of columns : ")
    val columns  = Scanner(System.`in`).nextInt()
    printSquare(rows,columns)
}
fun printSquare (rows1 : Int , columns1 : Int) {
    for (i in 1.. rows1){
        for (j in 1 .. columns1 ){
            print("* ")
        }
        println("")
    }


}
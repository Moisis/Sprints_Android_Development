/*
* Task #2
* Read input from user
* if it is odd -> Print odd
* if it is even -> Print Even
* if it is  even greater than 99 -> print even with three digits
* */

import java.util.*


fun main() {
    val num : Int = Scanner(System.`in`).nextInt()

    if (num%2==0)
    {
        if (num >99){
            print("Even with 3 digits")
        }else{
            print("Even")
        }

    }else{
        print("odd")
    }
}
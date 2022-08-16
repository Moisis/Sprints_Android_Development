/*
    Task #5
    Create class car that contains the following fields (model ,  color , speed )
    create subclass BMW from car and override the get fuelType ()
    create another subclass Tesla from car and override the get fuel type
    Note : TESLA is electric car

    Output /  Create new objects from BMW and Tesla , then print the fuel type for each object

   Bonus / Use interfaces in this example


* */

import java.util.Scanner


fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter BMW  Car Details  :( Model , Color ,Speed )")
    val BMWCAR = BMW(scanner.next(),scanner.next(),scanner.nextFloat())
    println("BMW'S Fuel Type is  ${BMWCAR.getFuelType()} \n")
    println("Enter Tesla Car Details :( Model , Color ,Speed )")
    val TeslaCAR = Tesla(scanner.next(),scanner.next(),scanner.nextFloat())
    println("Tesla'S Fuel Type is ${TeslaCAR.getFuelType()}")

}
//Car class (Parent Class)
abstract class Car(model:String, color:String, speed:Float) : `Car-interface`{

}
//BMW class (Child Class)
class BMW(model:String, color:String, speed: Float) : Car(model,color,speed){

    override fun getFuelType(): String {
        return "Petrol"
    }

}
//Tesla class (Child Class)
class Tesla(model:String,color:String,speed:Float) : Car(model,color,speed){

    override fun getFuelType(): String {
        return "electricity"
    }

}
// abstract methods can be added
interface `Car-interface` {
    fun getFuelType(): String
}


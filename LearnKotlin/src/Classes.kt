/**
 * Created by emad on 6/18/18.
 */
/*class Car constructor(val make: String, val model: String, var color:String) {
    fun accelerate(){
        println("vroom vroom")
    }

    fun details(){
        println("this is a $color $make $model")
    }
}

class Truck(val make:String,val model:String,val towingCapacity: Int){
    fun tow() {
        println("taking horses to the rodeo")
    }

    fun details(){
        println("The $make $model has a towing capacity of $towingCapacity lbs")
    }

}*/




open class Vehicle(val make: String, val model: String){

   open fun accelerate(){
        println("vroom vroom")
    }

    fun park(){
        println("parking the vehicle")
    }


    fun brake(){

        println("STOP")
    }
}

class Car(make:String, model:String, color: String) : Vehicle(make,model){

    override fun accelerate(){
        println(" we are going ludicrous model")
    }
}

class  Truck(make:String, model:String, val towingCapacity:Int):Vehicle(make,model) {

    fun tow(){
        println("headed out to the mountains!")
    }

}
fun main(args: Array<String>) {

    /*val car = Car("Toyota","Avalon","Red")
    println(car.make)
    println(car.model)
    car.accelerate()
    car.details()

    val truck = Truck("Ford","F-150",10000)
    truck.tow()
    truck.details()*/

    val tesla = Car("Tesla","ModelS","Red")

    val truck = Truck("Ford","F-150",10000)


    tesla.accelerate()

}
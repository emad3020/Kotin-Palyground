/**
 * Created by emad on 6/18/18.
 */
fun main(args: Array<String>) {


    val printMessage = {message:String -> println(message)}

    printMessage("Hello World!")


    val sumA = { x: Int, y: Int -> x + y}
    println(sumA(4,5))


    val sumB: (Int ,Int) ->Int = { x,y ->  x + y }


    fun downloadData(url: String, completion: ()-> Unit) {
        //sent a download request
        //we get back data
        //there were no network errors

        completion()
    }

    fun downloadCarData(url: String, completion: (Car)-> Unit){
        //send a download  request
        //we got back car data
         val car = Car("Tesla","ModelX","Red")
        completion(car)
    }

    //call the download function

    downloadData("fakeUrl.com",{
        println("The code in this block, will only run" +
                "after the completion")
    })

    downloadCarData("fakeUrl.net") {
        it.park()
        println(it.make)

    }

    downloadCarData("fakeUrl.net") {car ->
        car.park()
        println(car.make)

    }


    fun downloadTruckData(url: String, completion: (Truck?,Boolean)-> Unit){
        //mak the web request
        // we get the results back

        val webRequestSuccess = true

        if (webRequestSuccess){
            //recieved truck data
            val truck = Truck("Ford","F-150",10000)
            completion(truck,true)
        } else {
            completion(null,false)
        }
    }


    downloadTruckData("fakeUrl.org"){ truck, success ->

        if (success) {
            //do something with our truck
            truck?.tow()
        } else{
            //handel the web request failure
            println("Something went wrong!")
        }
    }
}
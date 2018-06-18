/**
 * Created by emad on 6/18/18.
 */
fun main(args: Array<String>) {
    val rebels = arrayListOf("Leiah","Luke","Han Solo","Mon Mothma")

    val rebelsVehicles = hashMapOf("Solo" to "Millenuim Falcon ", "Luke" to "Landspeeder"
            ,"Boba Fett" to " Rocket Pack")


    for (rebel in rebels) {
        println("Name: $rebel")
    }

    for ((key,value) in rebelsVehicles) {
        println("$key gets around in their $value")
    }

    var x = 10

    while (x > 0) {
        println(x)
        x -= 1
    }
}
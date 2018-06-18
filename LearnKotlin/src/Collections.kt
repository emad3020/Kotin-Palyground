/**
 * Created by emad on 6/11/18.
 */
fun main(args: Array<String>) {

    /** Work With Arrays**/
    val imperials = listOf("Emperor","Dearth Vader", "Boba Fett", "Tarkin")

    println(imperials.sorted())

    println(imperials[2])
    println(imperials.first())
    println(imperials.contains("Emperor"))
    println(imperials)

    val rebels = arrayListOf("Leiah","Luke","Han Solo","Mon Mothma")
    println(rebels.size)
    rebels.add("Chewbacca")
    println(rebels)
    rebels.add(0,"Lando")
    println(rebels)
    println(rebels.indexOf("Luke"))
    rebels.remove("Han Solo")
    println(rebels)


    /** Work with HashMap & Map **/

    val rebelsVehiclesMap = mapOf("Solo" to "Millenuim Falcon ", "Luke" to "Landspeeder")

    println(rebelsVehiclesMap["Solo"])
    println(rebelsVehiclesMap.get("Solo"))
    println(rebelsVehiclesMap.getOrDefault("Leiah","This shit doesn't exist"))
    println(rebelsVehiclesMap.values)

    val rebelsVehicles = hashMapOf("Solo" to "Millenuim Falcon ", "Luke" to "Landspeeder"
                                    ,"Boba Fett" to " Rocket Pack")

    rebelsVehicles["Luke"] = "XWing"
    rebelsVehicles.put("Leiah", "Tantive IV")
    println(rebelsVehicles)
    rebelsVehicles.remove("Boba Fett")
    println(rebelsVehicles)

    rebelsVehicles.clear()
    print(rebelsVehicles.isEmpty())



}
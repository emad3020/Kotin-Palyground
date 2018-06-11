/**
 * Created by emad on 6/9/18.
 */
fun main(args: Array<String>) {

    val str = "May the force be with you."

    println(str)

    val str1 = "My dad said the funniest thing he said \"A joke\" "

    val rawCrawl = """>Along time ago ,
        >in the galaxy
        >far, far , far away ....
        >BUMM, BUMM, BUMMMMM """.trimMargin(">")

    println(rawCrawl)

    /*for (char in str){
        println( char)
    }*/

    val contentEquals = str.contentEquals("May the force be with you.")
    println(contentEquals)


    val contains = str.contains("Force",true) //ignore case to ignore upper or lower cases in the string
    println(contains)

    val uppercasee = str.toUpperCase()
    val lower = str.toLowerCase()

    println(uppercasee+"\n"+lower)


    /* Converting numbers to strings */
    val num = 6
    val stringNum = num.toString()
    println(stringNum)


    /** Sub sequence a string **/

    val subsequence = str.subSequence(4,13)
    println(subsequence)

    /** String completes**/

    val luke = "Luke Skywalker"
    val lightSaberColor = "green"
    val vehicle = "landspeeder"
    val age = 27

    println("$luke has a $lightSaberColor lightsaber and drives a $vehicle and he is $age years old")

    println("lukes full name $luke has a ${luke.length} chars")
}
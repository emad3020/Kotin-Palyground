/**
 * Created by emad on 6/9/18.
 */
fun main(args: Array<String>) {

    forceChoke()

    makeAnEntrance("I find your lack of faith disturbing")

    val rebels = calculateNumberGoodGuys(5,7)
    println("Darth Vader faced off against $rebels rebel scum")
    println("Darth Vader faced off against ${calculateNumberGoodGuys(5,7)} rebel scum")


    vaderIsFeeling()
    vaderIsFeeling("meh")
}

fun forceChoke() {
    println("You have failed me for the last time Admiral....")
}


/** function with parameters**/
fun makeAnEntrance(line: String){

    println(line)
}

/** function with a return value **/

fun calculateNumberGoodGuys(rebels:Int ,ewoks: Int) : Int {
    val goodGuys = rebels + ewoks
    return goodGuys
}

/** function with default value of its parameters**/
fun vaderIsFeeling(mood: String = "angry"){
    println(mood)
}
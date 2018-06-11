/**
 * Created by emad on 8/31/17.
 */


fun main(args: Array<String>) {


 /*   val arrayInt= Array(5){0}
    for (index in 0 ..4){
        println(arrayInt[index])
    }


    val arrayInt2 = Array(5){1}
    for (item in arrayInt2){
        println(arrayInt2[item])
    }*/

    //get elements from the user
    var inputArray = Array<Int>(5){0}
    for (index in 0..4){
        inputArray[index] = readLine()!!.toInt()
    }

    println("****List of elements *****")

    for (item in inputArray){
        println(item)
    }
}
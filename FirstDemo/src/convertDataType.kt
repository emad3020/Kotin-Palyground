/**
 * Created by emad on 8/30/17.
 */


fun main(args:Array<String>){

    /*
    * Convert String to Integer
    * */
    val strInt ="1233"

    val intNum:Int = strInt.toInt()

    println(intNum)

    /*
    * Convert String to Double
    * */

    val strDouble = "12.7"
    val doubleNum:Double = strDouble.toDouble()
    println(doubleNum)

    /*
    * Convert Integer to String
    * */
    val monthSalary = 2000
    val strSalary:String = monthSalary.toString()

    println(strSalary)

    /*
    * Convert Double to Integer
    * */
    val doubleSource = 14.9
    val convertedInt : Int = doubleSource.toInt()

    println(convertedInt)

}
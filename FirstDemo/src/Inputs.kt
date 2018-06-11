/**
 * Created by emad on 8/28/17.
 */


fun main(args:Array<String>){

    print("Enter Your Name: ")
    val myName:String = readLine()!!

    println("your name is : "+myName)

    print("Enter Your Age: ")
    val my_Age:Int = readLine()!!.toInt()

    println("and your age is " +my_Age)

    print("Enter Your Title: ")

    var title:String?=null
    title = readLine()

    println("Your title is : "+ title)
}
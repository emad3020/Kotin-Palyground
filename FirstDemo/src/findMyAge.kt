import java.util.*

fun main(args: Array<String>) {


    //input

    print("Enter your year of birth: ")
    var yearOfBirth:Int = readLine()!!.toInt()


    //process

    var currentYear = Calendar.getInstance().get(Calendar.YEAR)
    var age = currentYear - yearOfBirth


    //output

    println("your age is $age years")
}
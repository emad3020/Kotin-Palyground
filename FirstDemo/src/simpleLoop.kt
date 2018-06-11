/**
 * Created by emad on 8/31/17.
 */


fun main(args: Array<String>) {

    println("****** this program will print odd numbers between 1 : 10 *******")

    for(number in 1..10){
        if (number %2 == 1){
            println("$number")
        }
    }


    //example for loop control by labeling the loop

    loop@ for (count in 1..10){

        for (count2 in 1..5){
            if(count2 == 3)
                break@loop
            println("count1: $count , count2: $count2" )
        }
    }
}
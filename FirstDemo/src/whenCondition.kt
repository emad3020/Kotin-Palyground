fun main(args: Array<String>) {

    println("Enter a number: ")

    val number:Int = readLine()!!.toInt()

    when (number) {
        1-> {
            print ("You are the first smart boy")
        }

        2->{
            print("second degree is not bad dude")

        }
        3,4 -> {
            print ("try again! never lose hope")
        }
         in 5..10 ->{
             print("oops! You are loser")
         }
        !in 1..10 -> {
            print ("you are go so way honey")
        } else -> {
        print ("I don not have any thing for you")
    }
    }
}
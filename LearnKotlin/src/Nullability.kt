/**
 * Created by emad on 6/18/18.
 */
fun main(args: Array<String>) {
    var name: String = "Emad Ahmed"
//    name = null   /*kotlin is never assign null to a variable*/

    var nullableName : String ? = "Do I really exist?"
    nullableName = null

    //null check
    var length = 0
    if(nullableName != null) {
        length = nullableName.length
    } else{
        length = -1
    }

    println(length)



    //another way to make null check
    val l = if (nullableName != null) nullableName.length else -1

    //second method " safe call operator "

    println(nullableName?.length)


    //third method is " Elvis Operator "

    val len = nullableName?.length ?: -1
    val noName = nullableName ?: "No one knows me ..."
    println(noName)


    // use !! when you are 100% sure the variable is not null
    // or you will get Null Pointer Exception

    println(nullableName!!.length)
}
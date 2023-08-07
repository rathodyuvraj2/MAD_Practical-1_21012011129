fun main(){


    arithOps()
}

fun arithOps(){
    print("Enter fist number : ")
    var usrInputOne = readLine()!!.toInt()
    print("Enter second number : ")
    var usrInputTwo = readLine()!!.toInt()
    print("Enter third number : ")
    var usrInputThree = readLine()!!.toInt()

    print("Sum : ")
    println(usrInputOne + usrInputTwo + usrInputThree)
    print("Sub : ")
    println(usrInputOne - usrInputTwo - usrInputThree)
    print("Mul : ")
    println(usrInputOne * usrInputTwo * usrInputThree)
    print("Div : ")
    println(usrInputOne / usrInputTwo )
}
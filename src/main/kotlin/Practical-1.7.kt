fun  main()
{
    println("Enter Number:")
    var n= readln().toInt()
    var value=fact(n)
    println("Factorial:" + value)
}

fun fact(num:Int):Int
{
    if(num==0 || num==1)
        return 1
    else{
        return num * fact(num-1)
    }
}
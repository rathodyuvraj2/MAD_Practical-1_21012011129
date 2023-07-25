open class person(var firstname:String,var lastname:String) {
var first=firstname
    var last =lastname
}
class student(var name:String):person(firstname = "yuvraj", lastname = "rathod"){
var enrollmentno : String="21012011129"
    constructor(name: String,enrollmentno:String):this(name){
        var enno=enrollmentno
    }

    init {
        println("my name is : $name")
        println("my enrollment is : $enrollmentno ")
    }


}

fun main(){
    val s = student("Rathod")
    println(s)
    println(s.name)
    println(s.enrollmentno)
    println(s.first +" "+s.last)
}
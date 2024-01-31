package knowledge1.learnkotlinspringboot.learnKotlin
fun main (){

    val name = "Felix"
    val reverse: (String) -> String  = { data -> data.reversed()}
    print(reverse("12"))

    fun data(string: String, dataFunc:(String) -> String):String = "this is my life ${dataFunc(string)}"
    print(data("yolo"){ z -> z.reversed()})

}
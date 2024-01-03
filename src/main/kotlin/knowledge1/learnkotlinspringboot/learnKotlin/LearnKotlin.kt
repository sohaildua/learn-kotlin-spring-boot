package knowledge1.learnkotlinspringboot.learnKotlin
fun main (){

    val name = "Felix"
    val reverse: (String) -> String  = { data -> data.reversed()}
    print(reverse("12"))
}
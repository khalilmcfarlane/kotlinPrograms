import Person
import java.lang.Exception
import java.lang.NumberFormatException


fun main(args: Array<String>) {
    val question = Question()

   question.getAnswer()


    question.displayAnswer()

    question.showChoice()

    question.prompt()
    var choice = readLine()!!
    while(choice.lowercase() == "yes" || choice.lowercase() == "y") {
        question.getAnswer()
        question.prompt()
        choice = readLine()!!
    }

    println("See you later!")
    for(i in 0..10 step 2)
        print("$i ")
}



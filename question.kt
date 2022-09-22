import java.lang.NumberFormatException

class Question {
    var answer: String? = null
    private val correctAnswer = "25"

    fun displayAnswer() {
        println("You said $answer")
    }
    fun showChoice() {
        when(answer) {
            correctAnswer -> println("You got that right.")
            else -> println("Wrong answer.")
        }
    }

    fun prompt() {
        print("Want to play again? Say yes or no. ")

    }

    fun getAnswer() {
        print("What's 5 x 5? ")
        var isNum = false
        while(!isNum) {
            try {
                answer = readLine()!!
                if(answer is String) {
                    answer!!.toInt()
                    isNum = true
                }

            } catch (e: NullPointerException) {
                print("Invalid input! Try again ")
            } catch (e: NumberFormatException) {
                print("That ain't a number, try again. ")
            }
        }
    }
}
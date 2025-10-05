package expressions

import kotlin.math.truncate

object WhenExpression {
    fun whichMonth() {
        val months = 7

        val whichMonth = when (months) {
            1 -> "January"
            2 -> "February"
            3 -> "March"
            4 -> "April"
            5 -> "May"
            6 -> "June"
            7 -> "July"
            8 -> "August"
            9 -> "September"
            10 -> "October"
            11 -> "November"
            12 -> "December"
            else -> "Invalid month!"
        }
        println("This is $whichMonth month.")
    }

    fun ticketState() {
        val accept = true

        val ticketState = when(accept) {
            true -> print("Ticket is accepted.")

            false -> print("Ticket is not accepted!")
        }
    }
}
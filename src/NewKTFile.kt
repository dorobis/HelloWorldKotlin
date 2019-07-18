import java.util.*


fun main(args: Array<String>) {
    dayOfWeek()
    when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {

        Calendar.SUNDAY -> println("Sunday")
        Calendar.MONDAY -> println("Monday")
        Calendar.TUESDAY -> println("Tuesnday")
        Calendar.WEDNESDAY -> println("Wednesnday")
        Calendar.THURSDAY -> println("Thursday")
        Calendar.FRIDAY -> println("Friday")
        Calendar.SATURDAY -> println("Saturday")
        else -> println("Time has stopped")
    }
}

fun dayOfWeek() {
    println("What day is today?")
}
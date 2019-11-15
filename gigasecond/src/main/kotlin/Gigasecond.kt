import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(dateTime: LocalDateTime) {
    private val gigasecondInSeconds: Long = 1000000000
    val date: LocalDateTime = dateTime.plusSeconds(gigasecondInSeconds)

    constructor(localDate: LocalDate) : this(
        LocalDateTime.of(
            localDate.year,
            localDate.month,
            localDate.dayOfMonth,
            0,
            0
        )
    )
}

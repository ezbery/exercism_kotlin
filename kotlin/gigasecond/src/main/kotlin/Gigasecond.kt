import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(dateTime: LocalDateTime) {
    private val gigasecondInSeconds: Long = 1_000_000_000
    val date: LocalDateTime = dateTime.plusSeconds(gigasecondInSeconds)

    constructor(localDate: LocalDate) : this(localDate.atStartOfDay())
}

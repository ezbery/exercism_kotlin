import java.time.LocalDateTime

class Gigasecond(dateTime: LocalDateTime) {
    private val gigasecondInSeconds: Long = 1000000000
    val date: LocalDateTime = dateTime.plusSeconds(gigasecondInSeconds)
}

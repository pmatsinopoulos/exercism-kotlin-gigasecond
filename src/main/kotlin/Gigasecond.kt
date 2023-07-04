import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

class Gigasecond(localDateTime: LocalDateTime) {
    var date: LocalDateTime = localDateTime
        get() = field.plusSeconds(1_000_000_000)

    constructor(localDate: LocalDate) : this(LocalDateTime.of(localDate.year, localDate.month, localDate.dayOfMonth, 0, 0, 0))
}

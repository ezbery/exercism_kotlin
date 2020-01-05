data class Year(val year: Int) {

    val isLeap: Boolean = when {
        year.isDividable(4) -> when {
            year.isDividable(400) -> true
            year.isDividable(100) -> false
            else -> true
        }
        else -> false
    }

    private fun Int.isDividable(divider: Int) = year % divider == 0
}

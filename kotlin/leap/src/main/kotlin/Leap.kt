data class Year(val year: Int) {

    val isLeap: Boolean = when {
        year % 4 == 0 -> when {
            year % 400 == 0 -> true
            year % 100 == 0 -> false
            else -> true
        }
        else -> false
    }
}

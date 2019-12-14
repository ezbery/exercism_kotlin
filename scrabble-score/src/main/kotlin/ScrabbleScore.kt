object ScrabbleScore {
    private val lettersScore = mapOf(
        listOf('A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T') to 1,
        listOf('D', 'G') to 2,
        listOf('B', 'C', 'M', 'P') to 3,
        listOf('F', 'H', 'V', 'W', 'Y') to 4,
        listOf('K') to 5,
        listOf('J', 'X') to 8,
        listOf('Q', 'Z') to 10
    )

    private fun scoreLetter(c: Char): Int = lettersScore.map {
        when (c.toUpperCase()) {
            in it.key -> it.value
            else -> 0
        }
    }.sum()

    fun scoreWord(word: String): Int = word.map { scoreLetter(it) }.sum()
}

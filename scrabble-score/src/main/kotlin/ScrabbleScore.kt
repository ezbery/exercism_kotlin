object ScrabbleScore {
    private val lettersScore = mapOf(
            Pair(listOf('A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'), 1),
            Pair(listOf('D', 'G'), 2),
            Pair(listOf('B', 'C', 'M', 'P'), 3),
            Pair(listOf('F', 'H', 'V', 'W', 'Y'), 4),
            Pair(listOf('K'), 5),
            Pair(listOf('J', 'X'), 8),
            Pair(listOf('Q', 'Z'), 10))

    fun scoreLetter(c: Char): Int {
        TODO("Implement this function to complete the task")
    }

    fun scoreWord(word: String): Int {
        TODO("Implement this function to complete the task")
    }
}

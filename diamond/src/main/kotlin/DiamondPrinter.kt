class DiamondPrinter {
    private val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    private val delimiter = " "

    fun printToList(input: Char): List<String> {
        val charIndex = alphabet.indexOf(input)
        var diamondRows = mutableListOf<Int>()
        for (i in 0..charIndex)
            diamondRows.add(i)
        for (i in charIndex - 1 downTo 0)
            diamondRows.add(i)

        return emptyList()
    }
}

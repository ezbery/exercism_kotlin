class DiamondPrinter {
    private val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    private val delimiter = " "

    private fun spaces(numberOfSpaces: Int): String {
        var string = ""
        for (i in 1..numberOfSpaces)
            string += delimiter
        return string
    }

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

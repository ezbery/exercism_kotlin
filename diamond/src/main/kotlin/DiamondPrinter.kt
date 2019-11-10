class DiamondPrinter {
    private val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    private val delimiter = " "

    private fun spaces(numberOfSpaces: Int): String {
        var string = ""
        for (i in 1..numberOfSpaces)
            string += delimiter
        return string
    }

    private fun generateDiamondRow(currentCharIndex: Int, maxCharIndex: Int): String {
        val leadingSpaces = spaces(maxCharIndex - currentCharIndex)
        val size = maxCharIndex * 2 + 1

        val middleChars = if (size - 2 * leadingSpaces.length != 1)
            alphabet[currentCharIndex] + spaces(size - 2 * leadingSpaces.length - 2) + alphabet[currentCharIndex]
        else {
            alphabet[currentCharIndex].toString()
        }

        return leadingSpaces + middleChars + leadingSpaces
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

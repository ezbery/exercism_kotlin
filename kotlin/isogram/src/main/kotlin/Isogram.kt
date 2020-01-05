class Isogram {
    fun isIsogram(input: String): Boolean {
        val mapOfChars = input.replace(Regex("[-_ ]"), "")
            .map { it.toLowerCase() }
            .groupingBy { it }
            .eachCount()

        return mapOfChars.size == mapOfChars.values.sum()
    }
}
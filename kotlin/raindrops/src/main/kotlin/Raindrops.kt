class Raindrops {

    private val parsableFactors = listOf(3, 5, 7)

    private fun findFactors(number: Int): List<Int> {
        val numberFactors = mutableListOf<Int>()

        for (i in 1..number) {
            if (number % i == 0)
                numberFactors.add(i)
        }
        return numberFactors
    }

    private fun changeToRaindropString(numbers: List<Int>): String {
        var rainString = ""
        if (numbers.isEmpty())
            return ""
        if (numbers.contains(parsableFactors[0]))
            rainString += "Pling"
        if (numbers.contains(parsableFactors[1]))
            rainString += "Plang"
        if (numbers.contains(parsableFactors[2]))
            rainString += "Plong"
        return rainString
    }

    fun convert(input: Int): String {
        val inputFactors = findFactors(input)
        val filteredInputFactors = inputFactors.filter { parsableFactors.contains(it) }
        var rainString = changeToRaindropString(filteredInputFactors)
        if (rainString.isEmpty())
            rainString = input.toString()
        return rainString
    }
}
class Hamming {
    fun compute(first: String, second: String): Int {
        require(first.length == second.length) { "left and right strands must be of equal length." }

        var sumOfDifferences = 0
        for (i in first.indices)
            if (first[i] != second[i])
                sumOfDifferences++
        return sumOfDifferences
    }
}
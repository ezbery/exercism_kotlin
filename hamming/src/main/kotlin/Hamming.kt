import java.lang.IllegalArgumentException

class Hamming {
    @Throws(Exception::class)
    fun compute(first: String, second: String): Int {
        var sumOfDifferences = 0
        for (i in first.indices)
            if (first[i] != second[i])
                sumOfDifferences++
        return sumOfDifferences
    }
}
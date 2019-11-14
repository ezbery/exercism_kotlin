class Hamming {
    fun compute(first: String, second: String): Int {
        require(first.length == second.length) { "left and right strands must be of equal length." }

        return first.zip(second).count { (f, s) -> f != s }
    }
}
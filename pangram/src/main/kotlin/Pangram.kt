class Pangram {
    private val allChars = "abcdefghijklmnopqrstuvwxyz"
    fun isPangram(input: String): Boolean {
        var result = true
        allChars.forEach { c: Char ->
            if (!(input.contains(c, ignoreCase = true)))
                result = false
        }
        return result
    }
}
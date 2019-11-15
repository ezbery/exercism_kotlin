class PigLatin {
    private val vowels = listOf('a', 'e', 'i', 'o', 'u')
    private val consonants = ('a'..'z').filterNot { it in vowels }
    private val pigLatinEnding = "ay"

    fun translate(input: String): String {
        return when {
            input.first() in vowels -> input
            input.first() in consonants -> input.drop(1) + input.take(1)
            else -> ""
        } + pigLatinEnding
    }
}
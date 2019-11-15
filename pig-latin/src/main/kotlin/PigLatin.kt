class PigLatin {
    private val vowels = listOf('a', 'e', 'i', 'o', 'u')
    private val specialVowels = listOf("xr", "yt")
    private val consonants = ('a'..'z').filterNot { it in vowels }
    private val specialConsonants = listOf("ch", "qu", "th", "rh", "thr", "sch")
    private val pigLatinEnding = "ay"

    fun translate(input: String): String {
        return when {
            input.take(2) in specialVowels -> input
            input.first() in vowels -> input
            input.first() in consonants ->
                when {
                    input.take(3) in specialConsonants -> input.drop(3) + input.take(3)
                    input.take(2) in specialConsonants -> input.drop(2) + input.take(2)
                    else -> input.drop(1) + input.take(1)
                }
            else -> ""
        } + pigLatinEnding
    }
}
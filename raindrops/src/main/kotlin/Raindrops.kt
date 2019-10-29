class Raindrops {

    fun convert(input: Int): String {
        var raindropString = ""
        if (input % 3 == 0)
            raindropString += "Pling"
        if (input % 5 == 0)
            raindropString += "Plang"
        if (input % 7 == 0)
            raindropString += "Plong"

        if (raindropString.isEmpty())
            raindropString = input.toString()

        return raindropString
    }
}
package blackjack.api


enum class Rank(private val symbol: String, private val hcp : Int = 0) {
    ACE("A",4), KING("K",3), QUEEN("Q",2), JACK("J",1),
    TWO("2"), THREE("3"), FOUR("4"), FIVE("5"),
    SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"), TEN("10");

    override fun toString(): String {
        return symbol
    }

    companion object {
        val values = enumValues<Rank>()
    }
}
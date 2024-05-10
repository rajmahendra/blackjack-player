package blackjack.api


enum class Rank(private val symbol: String, val value : Int = 0) {
    ACE("A",11), KING("K",10), QUEEN("Q",10), JACK("J",10),
    TWO("2",2), THREE("3",3), FOUR("4",4), FIVE("5",5),
    SIX("6",6), SEVEN("7",7), EIGHT("8",8), NINE("9",8), TEN("T",10);

    override fun toString(): String {
        return symbol
    }

    companion object {
        val values = enumValues<Rank>()
    }
}
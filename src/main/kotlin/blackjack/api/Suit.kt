package blackjack.api

enum class Suit(val symbol: String) {
    SPADE("♠\uFE0F"),
    HEART("❤\uFE0F"),
    DIAMOND("♦\uFE0F"),
    CLUBS("♣\uFE0F");

    override fun toString(): String {
        return symbol
    }

    companion object {
        val values = enumValues<Suit>()
    }
}
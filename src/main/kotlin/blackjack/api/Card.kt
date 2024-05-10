package blackjack.api

class Card(private val suit: Suit, private val rank: Rank) {
    fun getValue() = rank.name
    fun getSuit() = suit
    fun getRank() = rank
    override fun toString(): String {
        return "$rank$suit"
    }
    companion object {
        fun createDeck(decks: Int = 1): MutableList<Card> {
            val deck = mutableListOf<Card>()
            for (i in 1..decks)
                Suit.values.forEach { suit ->
                    Rank.values.forEach { rank ->
                        deck.add(Card(suit, rank))
                    }
                }
            deck.shuffle()
            return deck
        }
    }


}
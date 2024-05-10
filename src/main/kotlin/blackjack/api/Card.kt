package blackjack.api

class Card(private val suit: Suit, private val rank: Rank) {
    private var cardState: CardState = CardState.FACE_UP
    fun getValue() = rank.value
    fun getSuit() = suit
    fun getRank() = rank
    fun getCardStatus() = cardState
    fun setCardStatus(cState: CardState) {
        cardState=cState
    }

    override fun toString(): String {
        if (cardState == CardState.FACE_DOWN)
            return "XX"
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
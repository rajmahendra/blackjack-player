package blackjack.api

class Hand {
    private val cards = mutableListOf<Card>()

    fun add(card: Card)= cards.add(card)

    fun size() = cards.size

    private fun isHandHaveRank(rank: Rank) = cards.find { it.getRank() == rank } != null

    fun getHand() = cards

    fun getCard(idx: Int)=cards.get(idx)

    fun isBlackjack() = (size() ==2  && (isHandHaveRank(Rank.ACE) && isHandHaveRank(Rank.KING) || isHandHaveRank(Rank.QUEEN)|| isHandHaveRank(Rank.JACK)))

    fun isBust() = score() > 21

    fun isEmpty() = cards.isEmpty()

    fun score (): Int {
        var score =0
        var aces = 0

        cards.forEach { card ->
            score += card.getValue()
            if (card.getRank() == Rank.ACE)
                aces++
        }
        while (aces > 0 && score > 21) {
            score -= 10
            aces--
        }
        return score
    }

    override fun toString(): String {
        return "Hand of $cards, at Score ${score()}"
    }

}
package blackjack.runner

import blackjack.api.Card
import blackjack.api.CardState
import blackjack.api.Hand
import blackjack.api.Player

class Dealer (name: String = "Dealer") {
    var hand = Hand()



    fun initialDeal(deck: MutableList<Card>,players :ArrayList<Player>) {
        for (i in 1..2)
        players.forEach { player ->
            val lastCard = deck.lastOrNull()
            if (lastCard != null) {
                deck.remove(lastCard)
                player.hand.add(lastCard)
            }
        }
        var lastCard = deck.lastOrNull()
        deck.remove(lastCard)
        if (lastCard != null) {
            hand.add(lastCard)
        }
        lastCard = deck.lastOrNull()
        deck.remove(lastCard)
        if (lastCard != null) {
            lastCard.setCardStatus(CardState.FACE_DOWN)
            hand.add(lastCard)
        }

    }

    fun dealCard(deck: MutableList<Card>, playedCards: MutableList<Card> ): Card? {
        if (deck.isNotEmpty()) {
            // Lógica para garantir que a carta retirada do deck não tenha sido jogada anteriormente
            val lastCard = deck.lastOrNull { it !in playedCards }
            if (lastCard != null) {
                deck.remove(lastCard)
               // add(lastCard)
                playedCards += lastCard
                return lastCard
            }
        }
        return null
    }
}
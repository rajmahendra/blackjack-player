package blackjack.gameimpl

import blackjack.api.Card
import blackjack.api.PlayDecision
import blackjack.api.Player

class DummyPlayer( name: String) : Player(name) {
    override fun decision(): PlayDecision {
        if(hand.score() <= 15)
            return PlayDecision.HIT

        return PlayDecision.STAND
    }

    override fun hit(card: Card) {
            hand.add(card)
    }

    override fun double() {

    }

    override fun stand() {

    }

    override fun split() {

    }

    override fun surrender() {

    }
}
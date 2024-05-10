package blackjack.api

abstract class Player(val name: String ) {
    var hand = Hand()
    var money: Int = 1000
    var currentBid = arrayListOf<Chip>()

    fun addCard(card: Card) = hand.add(card)

    fun moneyInHand() = money
    fun currentBid() = currentBid

    fun getBid(chips: ArrayList<Chip>) : ArrayList<Chip> {
    var total = 0
        for (chip in chips) {total += chip.money()}
        if (money >= total) {
            money -= total
            currentBid = chips
            return chips
        }
        else
            throw Exception("Betting beyond fund in hand")
    }


    /**
     * Player decision on the current situation
     */
    abstract fun decision(): PlayDecision

    /**
     * If player decision is PlayDecision.HIT this is called
     */
    abstract fun hit(card: Card)
    /**
     * If player decision is PlayDecision.DOUBLE this is called
     */
    abstract fun double()
    /**
     * If player decision is PlayDecision.STAND this is called
     */
    abstract fun stand()
    /**
     * If player decision is PlayDecision.SPLIT this is called
     */
    abstract fun split()
    /**
     * If player decision is PlayDecision.SURRENDER this is called
     */
    abstract fun surrender()


}
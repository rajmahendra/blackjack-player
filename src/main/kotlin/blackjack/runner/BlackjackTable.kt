package blackjack.runner

import blackjack.api.Card
import blackjack.api.Player
import blackjack.gameimpl.DummyPlayer

class BlackjackTable {
    val dealer= Dealer()
    val discardDeck = mutableListOf<Card>()
    val deck = Card.createDeck(3)
    val players =ArrayList<Player>()

    fun addPlayer(player: Player)= players.add(player)


    fun boardSummary() {

        println ("Meta Info")
        println ("**********")
        println ("Deck Size : ${deck.size}")

        println ("Dealer")
        println ("*******")
        println("Dealer Hand " + dealer.hand)

        println ("Players")
        println ("*******")
        players.forEach {
          println("Player ${it.name}")
            println("Hand " + it.hand)
        }
    }

    fun startBlackjackTable() {
        var gameEnd = false

        addPlayer(DummyPlayer("Dummy 1"))
        addPlayer(DummyPlayer("Dummy 2"))
        addPlayer(DummyPlayer("Dummy 3"))

        if(players.size < 1)  {
            gameEnd = true
        println ("Terminating Game: Players not in the table.")
        }
        initiateFirstGame()
        while (!gameEnd || deck.isEmpty() ) {

            boardSummary()


            gameEnd=true
        }
    }

    fun initiateFirstGame() {

        dealer.initialDeal(deck,players)
    }

}
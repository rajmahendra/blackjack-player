package blackjack.api

enum class PlayDecision {
    HIT, // take another card - tapping
    STAND, // Do not want another card - wave
    SPLIT, // if you have pair of cards you can split - split finger  - ace will have only one card
    SURRENDER, //
    DOUBLE // doubling down first two card or sometime late. put equal bet amount another.
}
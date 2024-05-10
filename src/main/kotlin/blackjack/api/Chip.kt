package blackjack.api

enum class Chip(private val money: Int) {
    FIVE(5),
    TEN(10),
    TWENTY(20),
    FIFTY(50),  HUNDRED(100);
fun money(): Int = money

}
fun main() {
    val transfer = 100_000
    val commission = 0.0075
    var amount = 0.0
    if (transfer>=3500){
        amount = transfer-(transfer*commission)
    } else amount = transfer.toDouble()
    println("Ваш перевод с учётом комиссии: ${amount.toInt()} копеек")
}
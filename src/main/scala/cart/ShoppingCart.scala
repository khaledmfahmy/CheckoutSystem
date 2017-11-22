package cart

object ShoppingCart {


  def checkout(items: Array[String]): Double = {

    val basket = items.groupBy(k => k)
    //Step 1: Caculate cost without offers
    var applesCost = 0.0
    if (basket.isDefinedAt("apple")) {
      val NumberOfApples = basket("apple").length
      val applePrice = PriceList.fruit("apple")
      //Step 2: buy one, get one free on Apples
      applesCost = if (NumberOfApples >= 2) {
        NumberOfApples % 2 * applePrice + (NumberOfApples / 2 * applePrice)
      } else {
        NumberOfApples * applePrice
      }
    }

    var orangesCost = 0.0
    if (basket.isDefinedAt("orange")) {
      val NumberOfOranges = basket("orange").length
      val orangePrice = PriceList.fruit("orange")
      //Step 2: 3 for the price of 2 on Oranges
      orangesCost = if (NumberOfOranges >= 3) {
        NumberOfOranges % 3 * orangePrice + (NumberOfOranges / 3 * 2 * orangePrice)
      } else {
        NumberOfOranges * orangePrice
      }


    }

    applesCost + orangesCost
  }
}
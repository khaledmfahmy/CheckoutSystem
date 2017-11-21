package cart

object ShoppingCart {


  def checkout(items: Array[String]): Double = {

    val basket = items.groupBy(k => k)
    //Step 1: Caculate cost without offers
    var applesCost = 0.0
    if (basket.isDefinedAt("apple")) {
      val allApplesNumber = basket("apple").length
      val applePrice = PriceList.fruit("apple")
      applesCost = allApplesNumber * applePrice
    }

    var orangesCost = 0.0
    if (basket.isDefinedAt("orange")) {
      val allOrangesNumber = basket("orange").length
      val orangePrice = PriceList.fruit("orange")
      orangesCost = allOrangesNumber * orangePrice
    }

    applesCost + orangesCost
  }
}
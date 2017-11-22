package cart

import cart.ShoppingCart._
import org.scalatest.FunSuite

class ShoppingCartTest extends FunSuite {

  test("Empty basket costs 0"){
    val basket = Seq ()
    assertResult(0)(checkout(basket.toArray))
  }

  test("An Apple costs 0.60"){
    val basket = Seq ("apple")
    assertResult(.6)(checkout(basket.toArray))
  }

  test("Two apples costs 0.60"){
    val basket = Seq ("apple", "apple")
    assertResult(0.60)(checkout(basket.toArray))
  }

  test("Three apples costs 1.20"){
    val basket = Seq ("apple", "apple", "apple")
    assertResult(1.20)(checkout(basket.toArray))
  }

  test("Four apples costs 1.20"){
    val basket = Seq ("apple", "apple", "apple", "apple")
    assertResult(1.20)(checkout(basket.toArray))
  }

  test("An Orange costs 0.25"){
    val basket = Seq ("orange")
    assertResult(0.25)(checkout(basket.toArray))
  }

  test("Two Oranges costs 0.50"){
    val basket = Seq ("orange", "orange")
    assertResult(0.50)(checkout(basket.toArray))
  }

  test("Three Oranges costs 0.50"){
    val basket = Seq ("orange", "orange", "orange")
    assertResult(0.50)(checkout(basket.toArray))
  }

  test("Four Oranges costs 0.75"){
    val basket = Seq ("orange", "orange", "orange", "orange")
    assertResult(0.75)(checkout(basket.toArray))
  }

  test("An Orange + An Apple costs 0.85") {
    val basket = Seq("orange", "apple")
    assertResult(0.85)(checkout(basket.toArray))
  }

  test("Three Apples and an Orange costs 1.45"){
    val basket = Seq ("apple", "apple", "orange", "apple")
    assertResult(1.45)(checkout(basket.toArray))
  }

  test("two Apples and and three Orange costs 1.10"){
    val basket = Seq ("apple", "orange", "orange", "apple", "orange")
    assertResult(1.10)(checkout(basket.toArray))
  }

  test("Three Apples and and Four Orange costs 1.95"){
    val basket = Seq ("apple", "orange", "orange", "apple", "orange", "apple", "orange")
    assertResult(1.95)(checkout(basket.toArray))
  }
}

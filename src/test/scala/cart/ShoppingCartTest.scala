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

  test("An Orange costs 0.25"){
    val basket = Seq ("orange")
    assertResult(0.25)(checkout(basket.toArray))
  }

  test("An Orange + An Apple costs 0.85"){
    val basket = Seq ("orange", "apple")
    assertResult(0.85)(checkout(basket.toArray))
  }

  test("Three Apples and an Orange costs 2.05"){
    val basket = Seq ("apple", "apple", "orange", "apple")
    assertResult(2.05)(checkout(basket.toArray))
  }
}

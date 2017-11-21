package cart

object Main {

    def main(args: Array[String]) {
      println("[ " + args.mkString(", ") + " ] => £" + ShoppingCart.checkout(args))
    }
  }

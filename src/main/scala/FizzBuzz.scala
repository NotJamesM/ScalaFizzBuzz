object FizzBuzz {
  def getResult(input: Int): String = {
    (input % 3, input % 5) match {
      case (0, 0) => "fizzbuzz"
      case (0, _) => "fizz"
      case (_, 0) => "buzz"
      case (_, _) => input.toString
    }
  }
}

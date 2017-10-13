import org.scalatest.FunSuite
import org.scalatest.Matchers._

class FizzBuzzTest extends FunSuite {
  test("Should return fizz if the number is divisible by 3") {
    FizzBuzz.getResult(3) shouldBe "fizz"
    FizzBuzz.getResult(6) shouldBe "fizz"
  }

  test("Should return buzz if the number is divisible by 5") {
    FizzBuzz.getResult(5) shouldBe "buzz"
    FizzBuzz.getResult(10) shouldBe "buzz"
  }

  test("Should return fizzbuzz if the number is divisible by 15") {
    FizzBuzz.getResult(15) shouldBe "fizzbuzz"
    FizzBuzz.getResult(30) shouldBe "fizzbuzz"
  }

  test("Return the same number if no other requirement is fulfilled") {
    FizzBuzz.getResult(1) shouldBe "1"
    FizzBuzz.getResult(2) shouldBe "2"
  }
}

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers._
import org.scalatestplus.scalacheck.Checkers
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks.forAll

class FindMiddleSpec extends AnyFlatSpec with should.Matchers with Checkers {

  import FindMiddle._

  "findMiddle" should "return middle element in odd length list" in {
    val listOdd = List(1, 2, 3, 4, 5)
    val expected = Some(3)
    findMiddleElement(listOdd) shouldBe expected
  }

  "findMiddle" should "return middle left element in even list" in {
    val listEven = List(1, 2, 3, 4)
    val expected = Some(2)
    findMiddleElement(listEven) shouldBe expected
  }

  "findMiddle" should "return None if list is empty" in {
    val listEmpty = List()
    val expected = None
    findMiddleElement(listEmpty) shouldBe expected
  }

  "findMiddle" should "return headOption if list have two elements" in {
    val listWithTwo = List(1, 2)
    val expected = Some(1)
    findMiddleElement(listWithTwo) shouldBe expected
  }

  "findMiddle" should "return None only element in list with one element" in {
    val listWithOne = List(1)
    val expected = Some(1)
    findMiddleElement(listWithOne) shouldBe expected
  }
}
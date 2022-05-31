import scala.annotation.tailrec

object FindMiddle {
  def findMiddleElement[T](xs: List[T]): Option[T] = {
    @tailrec
    def loop(ys: List[T], acc: List[T], cnt: Int): Option[T] = {
      ys match {
        case _ :: tail if cnt % 2 == 0 => loop(tail, acc.tail, cnt + 1) //parzyste
        case _ :: tail => loop(tail, acc, cnt + 1) //nieparzyste
        case Nil => acc.headOption
      }
    }
    loop(xs, xs, 0)
  }
}

//testy pokazuja ze wynik zawsze jest index + 1

package fpinscala.gettingstarted

import org.scalatest.{WordSpec, ShouldMatchers}
import MyModule._

class MyModuleTests extends WordSpec with ShouldMatchers {
  "fib" should {
    "map 0 to 1" in {
      fib(0) should be (1)
    }
    "map 1 to 1" in {
      fib(1) should be (1)
    }
    "map 2 to 2" in {
      fib(2) should be (2)
    }
    "map 3 to 3" in {
      fib(3) should be (3)
    }
    "map 4 to 5" in {
      fib(4) should be (5)
    }
    "map 5 to 8" in {
      fib(5) should be (8)
    }
  }
}
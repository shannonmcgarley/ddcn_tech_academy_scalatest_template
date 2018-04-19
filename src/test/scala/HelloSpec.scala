import org.scalatest._

class HelloSpec extends WordSpec with MustMatchers {

  "Hello" must {

    "split and cross a pair of chromosomes that are 1 in length" in {
      chromosomeCrossover.crossing("0","1", 0) mustEqual ("1", "0")
    }
    "split and cross a pair of chromosomes that are 4 in lenth" in{
      chromosomeCrossover.crossing("1111", "0000", 1) mustEqual ("1000", "0111")
    }
    "split and cross a pair of chromosomes that are 7 in length" in{
      chromosomeCrossover.crossing("1111111","0000000", 3) mustEqual ("1110000", "0001111")
    }

  }

}

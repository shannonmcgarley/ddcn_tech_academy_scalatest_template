import org.scalatest._

class HelloSpec extends WordSpec with MustMatchers {

  "Hello" must {

    "say hello" in {
      Hello.greet mustEqual "hello"
    }

  }

}

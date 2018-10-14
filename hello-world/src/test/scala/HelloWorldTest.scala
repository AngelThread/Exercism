import org.scalatest.{Matchers, FunSuite}

/** @version 1.1.0 */
class HelloWorldTest extends FunSuite with Matchers {

  test("Say Hi!") {
    HelloWorld.hello() should be ("Hello, World!")
  }

  test("Hello") {
    HelloWorld.hello() should not be ("Hello!")
  }
}

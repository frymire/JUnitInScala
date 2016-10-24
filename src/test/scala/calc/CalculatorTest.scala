
package calc

import org.junit.{Before, Test, Rule}
import org.junit.Assert.assertThat
import org.junit.rules.ExpectedException
import org.hamcrest.CoreMatchers.{is}


class CalculatorTest {
  
  var calc: Calculator = null;
  
  @Before def setup = { calc = new Calculator }
  
  @Test def shouldReturn0_whenInitialized = { assertThat(calc(), is(0)); }
  
  @Test def shouldReturn0_whenReset {
    calc.reset()
    assertThat(calc(), is(0));
  }
  
  @Test def shouldReturn1_whenUserAdds1 {
    calc.add(1)
    assertThat(calc(), is(1))
  }
  
  @Test def shouldReturn5_whenUserSetsValueTo5 {
    calc(5)
    assertThat(calc(), is(5))
  }
  
  @Test def shouldReturn8_whenUserAdds5Plus3 {
    calc(5)
    calc add 3
    assertThat(calc(), is(8))
  }
  
  // Scala is complaining that this isn't public, but it's public by default (?).
//  @Rule val thrown = ExpectedException.none()
  
  @Test(expected = classOf[ArithmeticException])
  def shouldThrowAritmeticException_whenYouDivideBy0 { calc div 0 }
  
}

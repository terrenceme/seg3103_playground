import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class EasterCalculatorTest {
  @Test
  void tc1() {
    assertEquals(null, EasterCalculator.easterDate(1583));
  }

  @Test
  void tc2() {
    assertEquals("April 4", EasterCalculator.easterDate(1584).toString());
  }

  @Test
  void tc3() {
    assertEquals("April 18", EasterCalculator.easterDate(1954).toString());
  }

  @Test
  void tc4() {
    assertEquals("April 19", EasterCalculator.easterDate(1981).toString());
  }

  @Test
  void tc5() {
    assertEquals("April 25", EasterCalculator.easterDate(2049).toString());
  }

  @Test
  void tc6() {
    assertEquals("April 19", EasterCalculator.easterDate(2076).toString());
  }

  @Test
  void tc7() {
    assertEquals("March 29", EasterCalculator.easterDate(4098).toString());
  }

  @Test
  void tc8() {
    assertEquals(null, EasterCalculator.easterDate(4099));
  }
}
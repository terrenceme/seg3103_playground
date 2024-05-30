import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  void nextDate_sample() {
    Date d = new Date(2020,5,3);
    assertEquals(new Date(2020,5,4), d.nextDate());
  }

  @Test
  void nextDate_Christmas(){
    Date d = new Date(2020,12,24);
    assertEquals(new Date(2020,12,25), d.nextDate());
  }

  @Test
  void nextDate_NewYear(){
    Date d = new Date(2020,12,31);
    assertEquals(new Date(2021,1,1), d.nextDate());
  }
}
import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class TheBigJazzTest {

  @Test
  public void boolean_quitsIfNoJive_bool() {
    TheBigJazz bigJazzTest = new TheBigJazz();
    boolean expectedValue = false;
    assertEquals(expectedValue, bigJazzTest.jiveOrNoJive("N"));
  }

  @Test
  public void boolean_continuesIfJive_bool() {
    TheBigJazz bigJazzTest = new TheBigJazz();
    boolean expectedValue = true;
    assertEquals(expectedValue, bigJazzTest.jiveOrNoJive("Y"));
  }

  @Test
  public void String_setsNameForObject_String() {
    TheBigJazz bigJazzTest = new TheBigJazz();
    bigJazzTest.callingCard("The Hoot-Hoot");
    String expectedValue = "The Hoot-Hoot";
    assertEquals(expectedValue, bigJazzTest.mName);
  }

  @Test
  public void String_setsLocationForObject_String() {
    TheBigJazz bigJazzTest = new TheBigJazz();
    bigJazzTest.theHotSpot("2");
    String expectedValue = "THE BOURBON BAYOU";
    assertEquals(expectedValue, bigJazzTest.mLocation);
  }

  @Test
  public void String_setsBandForObject_String() {
    TheBigJazz bigJazzTest = new TheBigJazz();
    bigJazzTest.tuneLayinDaddies("3");
    String expectedValue = "APALACHEE ERIK AND THE SNOWGLOBIN' HATCHETS";
    assertEquals(expectedValue, bigJazzTest.mBand);
  }

  @Test
  public void int_setsTotalCostCorrectly_int() {
    TheBigJazz bigJazzTest = new TheBigJazz();
    bigJazzTest.theHotSpot("2");
    bigJazzTest.tuneLayinDaddies("3");
    bigJazzTest.theBigBusinessJive();
    int expectedValue = 14;
    assertEquals(expectedValue, bigJazzTest.mTotalCost);
  }

}

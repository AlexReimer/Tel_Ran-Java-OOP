package auto;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class AutoByPriceComparatorTest {

    AutoByPriceComparator comparator;

    @BeforeEach
    public void init() {
        comparator = new AutoByPriceComparator();
    }

    @Test
    public void testGreater_ByPrice() {
        Auto carOne = new Auto("Audi", "black", (long) 35.000);
        Auto carTwo = new Auto("Subaru", "red", (long) 20.000);
        int res = comparator.compare(carOne, carTwo);
        assertTrue("expected to be greater", res >= 1);
    }

    @Test
    public void testSmaller_ByPrice() {
        Auto carOne = new Auto("Audi", "black", (long) 15.000);
        Auto carTwo = new Auto("Subaru", "red", (long) 20.000);
       int res = comparator.compare(carOne, carTwo);
//        assertTrue("expected to be smaller", res <= 1);
        assertTrue(comparator.compare(carOne, carTwo) < 0);
    }

    @Test
    public void testEqual_ByPrice() {
        Auto carOne = new Auto("Audi", "black", (long) 15.000);
        Auto carTwo = new Auto("Subaru", "red", (long) 15.000);
        int res = comparator.compare(carOne, carTwo);
        assertTrue("expected to be equal", res == 0);
    }

    @Test
    public void compare_ByPrice() {
//        assertTrue(comparator.compare(1L, 2L) < 0);
//        assertTrue(comparator.compare(3L, 2L) < 0);
        //   assertEquals(comparator.compare(2L, 2L));
    }
}
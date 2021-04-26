package primes;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PrimeNummTest {

    @Test
    public void getPrimesTill() {
        List<Integer> primes = new PrimeNumm().getPrimesTill(20);
        Integer[] intAr = {2, 3, 5, 7, 11, 13, 17, 19};

        assertEquals(intAr.length, primes.size());

        assertEquals((Integer) 2, new PrimeNumm().getPrimesTill(2));

    }

}




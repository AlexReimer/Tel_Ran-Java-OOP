package primes;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PrimeNummTest {

    PrimeNumm primeNumms = new PrimeNumm();

    @Test
    public void testGetPrimesTill_emptyList_throwsNoSuchElementException() {
        List<Integer> emptyList = Arrays.asList();
        assertThrows(NoSuchElementException.class, ()->primeNumms.getPrimesTill(emptyList));
    }

    @Test
    public void testGetPrimesTill(){
        List<Integer> primes = Arrays.asList(2, 3, 5, 6, 16, 13, 15, 20);
       int res = primeNumms.getPrimesTill(primes);
        assertTrue(2 == res || 3 == res || 5 == res || 13==res);

//        assertEquals(intAr.length, primes.size());
//
//        assertEquals((Integer) 2, new PrimeNumm().getPrimesTill(2));
    }


}




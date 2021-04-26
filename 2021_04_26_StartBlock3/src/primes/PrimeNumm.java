package primes;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumm {
//    public static void main(String[] args) {
//        List<Integer> prime = getPrimesTill(10);
//        System.out.println(prime);
//    }

    public List<Integer> getPrimesTill(int n) {
        List<Integer> primeNumsTillN = new ArrayList<>();
        for (int i = 2; i <= n; i++)
            if (primeNumber(i)) primeNumsTillN.add(i);
        return primeNumsTillN;
    }

    private boolean primeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}

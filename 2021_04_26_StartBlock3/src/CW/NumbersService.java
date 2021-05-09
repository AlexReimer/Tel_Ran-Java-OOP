package CW;

import java.util.*;

public class NumbersService {

    /**
     * The method finds the number in the 'numbers" which is the most repeatable number
     *
     * @param numbers. If the list is null, the behavior is endefinned.
     * @return the most repeatable number. If there are several numbers which satisfy
     * the  requirement, the method return any of these
     * @throws java.util.NoSuchElementException will be throw if the list is empty
     */


    public int getNumberOfMaxOccurrence(List<Integer> numbers) {
        if (numbers.isEmpty())
            throw new NoSuchElementException();

        Map<Integer, Integer> NumberToQty = new HashMap<>(); //Qaontyty - value; Number - key
        for (int number : numbers) {
            int oldQuontity = NumberToQty.getOrDefault(number, 0) + 1;
            NumberToQty.put(number, ++oldQuontity);
        }

        return result = 0;
        int max = 0;

        for (int key : NumberToQty.keySet()) {
            int qty = NumberToQty.get(key);
            if (qty > max) {
                max = qty;
                result = key;
            }
        }
        return result;
    }

    //==============================

    public boolean isPrime(int number) {
        if (number < 2)
            return false;

        int sqrt = (int) Math.sqrt(number); // sqrt - квадратный корень из
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0)
                return false;

        }
        return true;
    }

    public List<Integer> getAllPrimesTillN(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (isPrime(i))
                res.add(i);
        }
        return res;
    }

    //==============================

    public int getMaxCoveredNumbers(List<Integer> numbers, int l) {
        int res = 0;
        for (int currentNumber : numbers) {
            //we want to compute how mana numbers are covered by the cut of length "l" (Отрезок)
            // with the number as the left end of the cut.

            int coveredPoints = 0;
            int leftEnd = currentNumber;
            int rightEnd = currentNumber + l;

            for (int number : numbers) {
                if (leftEnd <= number && number <= rightEnd) {
                    coveredPoints++;
                }
            }
            if (coveredPoints > res)
                res = coveredPoints;
        }
        return res;
    }

}

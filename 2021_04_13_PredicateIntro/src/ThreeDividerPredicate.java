import java.util.function.Predicate;

public class ThreeDividerPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer t) {
        return t % 3 == 0;
    }
}

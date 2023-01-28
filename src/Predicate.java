import Function.Function;
import Predikat.predicate;

public class Predicate {

    public static void main(String[] args) {

        predicate<String> predicate = new predicate<String>() {
            @Override
            public boolean test(int s) {

                return s > 0;
            }
        };
        System.out.println(predicate.test(-5));
        System.out.println(predicate.test(0));
        System.out.println(predicate.test(6));

        predicate<String> predicate2 = (s) -> {

            return s > 0;
        };
        System.out.println(predicate.test(-9));
        System.out.println(predicate.test(0));
        System.out.println(predicate.test(10));





    }

}





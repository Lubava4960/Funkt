package Function;




public class FunctionDemo {
    public static void main(String[] args) {
        Function<Double, Long> function = d -> Math.round(d); {

            System.out.println(function.apply(5.7));
            System.out.println(function.apply(6.9));
            System.out.println(function.apply(15.5));


        };



    }
}
package Function;




public class FunctionDemo {
    public static void main(String[] args) {
        Function<Double, Long> function = d -> Math.round(d); {

           System.out.println(function.apply(5.7));
            System.out.println(function.apply(6.9));
            System.out.println(function.apply(15.5));


        };
        Function<Double, Long> function1 = new Function<Double, Long>() {
            @Override
            public Long apply(Double Long) {
                return (Math.round(Long));
            }

        };
        System.out.println(function1.apply(7.9));
        System.out.println(function1.apply(10.2));


    }
}
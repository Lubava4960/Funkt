package Supplier;

public class  SupplierDemo {
    public static void main(String[] args) {
         Supplier<Integer> supplier = () -> (int) Math.random()*100;
         System.out.println(supplier.get());


        Supplier<Integer> supplierN= new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 100);

            }

        };
     System.out.println(supplierN.get());

    }
             }
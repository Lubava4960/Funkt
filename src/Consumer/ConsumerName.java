package Consumer;

import javax.naming.Name;

public class ConsumerName {




    public static void main(String[] args) {

        Consumer<String> consumer = Name -> System.out.println("Hello");
         consumer.accept("Mike");
         consumer.accept("Ded");
         consumer.accept("Sarah");

    };
    Consumer<String> consumer1 = new Consumer<String>() {
        @Override
        public void accept( String Name) {
            System.out.println("Hello");

        }

    };


}
package ExpresionesLmabdas;

import java.util.function.Consumer;

public class InterfceConsumer {

    public static void main(String[] args){

        Consumer<String> interfaceConsum = new Consumer<String>() {
            @Override
            public void accept(String cad) {
                System.out.println(cad.length());
            }
        };
        Consumer<String> interfaceConsum2 = cad2 -> System.out.println(cad2.length());

        interfaceConsum2.accept("esteban");
    }
}

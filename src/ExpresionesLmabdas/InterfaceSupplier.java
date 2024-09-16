package ExpresionesLmabdas;

import java.util.function.Supplier;

public class InterfaceSupplier {

    public static void main(String[] args){

        Supplier<String> interfaceSup = new Supplier<String>() {
            @Override
            public String get() {
                return "esteban";
            }
        };
        Supplier<String> interfaceSup2 = () -> "esteban2";
        System.out.println(interfaceSup2.get());
        System.out.println(interfaceSup.get());

    }
}

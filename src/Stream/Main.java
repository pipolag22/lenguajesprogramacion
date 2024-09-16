package Stream;

import otraclase.Factura;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Factura fac1 = new Factura();
        fac1.setCodigo(23);
        fac1.setDescripcion("Factura 1");
        fac1.setTotal(2300);

        Factura fac2 = new Factura();
        fac2.setCodigo(23);
        fac2.setDescripcion("Factura 2");
        fac2.setTotal(2300);

        Factura fac3 = new Factura();
        fac3.setCodigo(23);
        fac3.setDescripcion("Factura 3");
        fac3.setTotal(2300);

        ArrayList<Factura> misFacturas = new ArrayList<>();
        misFacturas.add(fac1);
        misFacturas.add(fac2);
        misFacturas.add(fac3);
//Caso 1
        Function<Factura, Integer> interfaceFunction = new Function<Factura, Integer>() {
            @Override
            public Integer apply(Factura integer) {
                return integer.getTotal()*2;
            }
        };
//Caso 2
        Function<Factura, Integer> interfaceFunction2 =elem ->elem.getTotal()*2;
        Stream nuevoStream = misFacturas.stream().map(interfaceFunction);
        nuevoStream.forEach(System.out::println);

        //Caso 3
        Stream nuevoStream3 =misFacturas.stream().map(e->e.getTotal()*2);

        misFacturas.stream().map(interfaceFunction2);


        misFacturas.forEach(System.out::println);

        //Metodo filter
        Predicate<Factura> filtro = new Predicate<Factura>() {
            @Override
            public boolean test(Factura total) {
                if(total.getTotal()>2000){
                    return true;
                }else return false;
            }
        };
        Predicate<Factura> filtro2= e->e.getTotal()>2000;

        Stream nuevoStreamFilter= misFacturas.stream().filter(filtro);
        Stream nuevoStreamSinFilter = misFacturas.stream().filter(e->e.getTotal()>2000);
        Stream nuevoStreamAlt=misFacturas.stream().filter(filtro2);

        ArrayList<Integer> misNumeros = new ArrayList<>();
        misNumeros.add(22);
        misNumeros.add(21);
        misNumeros.add(2);
        misNumeros.stream().sorted().forEach(System.out::println);
    }
}
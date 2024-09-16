import otraclase.Factura;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){

        Factura miFac = new Factura();

        miFac.setCodigo(23);
        miFac.setDescripcion("Factura 1");
        miFac.setTotal(2000);

        Factura miFac2 = new Factura();

        miFac2.setCodigo(24);
        miFac2.setDescripcion("Factura 2");
        miFac2.setTotal(2100);

        Factura miFac3 = new Factura();

        miFac.setCodigo(25);
        miFac.setDescripcion("Factura 3");
        miFac.setTotal(2200);

        System.out.println(miFac);

        ArrayList<Factura> misFacturas = new ArrayList<>();
        misFacturas.add(miFac);
        misFacturas.add(miFac2);
        misFacturas.add(miFac3);

        Function<Factura, Integer> InterfaceFuntion= new Function<Factura, Integer>() {
            @Override
            public Integer apply(Factura integer) {
                return integer.getTotal()*2;
            }
        };

        Function<Factura, Integer> interfaceFunction2;

    Stream nuevoStream= misFacturas.stream().map(elem->elem.getTotal()*2);


        Function<? super Factura, ?> interfaceFunction;
        misFacturas.stream().map(interfaceFunction);

    nuevoStream.forEach(System.out::println);
    nuevoStream.forEach(System.out::println);


    //metodo filter

        Predicate<Factura> miPredicado = new Predicate<Factura>() {
            @Override
            public boolean test(Factura total) {
                if(total.getTotal()>2000){
                    return true;
                }else return false;
            }
        };

        Predicate<Factura> miPredicado1= e->e.getTotal()>2000;

        Stream nuevoStream2 = misFacturas.stream().filter(miPredicado);

        Stream nuevoStream3 = misFacturas.stream().filter(factura -> factura.getTotal() > 2000);

        Stream nuevoStream4 = misFacturas.stream().filter(miPredicado1);
}
}
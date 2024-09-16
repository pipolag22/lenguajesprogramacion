import otraclase.Factura;

import java.util.ArrayList;
import java.util.function.Function;
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


    Stream nuevoStream= misFacturas.stream().map(elem->elem.getTotal()*2);

    nuevoStream.forEach(System.out::println);
    nuevoStream.forEach(System.out::println);
}
}
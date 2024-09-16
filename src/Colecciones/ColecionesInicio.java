package Colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ColecionesInicio {

    public static void main(String[] args){
//ejemplo 1
        ArrayList<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("esteban");
        listaArrayList.add("jose");

        //ejemplo2
        List<String> listaArrayList1 = new ArrayList<>();
        listaArrayList1.add("esteban");
        listaArrayList1.add("juan");

        //ejemplo3
        List<String> nombres = Arrays.asList("esteban", "jose");
        //forma inmutable
        // ejemplo 4
        ArrayList<String> nombres1 = new ArrayList<>(Arrays.asList("esteban", "jose","pedro"));
        //modifico la inmutabilidad del caso anterior

        //ejemplo5
        List<String> nombre2 = new ArrayList<String>(){{add("esteban"); add("pipo");}};

        //ejemplo6

        List<String> nombre3 = List.of("esteban", "pipo", "jose");
        //forma inmutable a partir de java 9

        // ejemplo 7
        List<String> nombre4 = new ArrayList<>(List.of("esteban", "pipo", "jose"));
        // rompe la inmutabilidad del caso anterior, a partir de java 9
        //ejemplo 8
        List<String> nombre5 = List.of("esteban", "pipo", "jose");
        List<String> nombre6 = nombre5.stream().collect(Collectors.toList());

        //ejemplo 9
        List<String> nombre7 = nombre6.stream().collect(Collectors.toList());


    };
}

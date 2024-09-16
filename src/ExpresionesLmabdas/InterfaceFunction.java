package ExpresionesLmabdas;

import java.util.function.Function;

public class InterfaceFunction {

    public static void main(String[] args){

        //Function <String, Integer> interfaceFunc = new Function<String, Integer>() {
        //    @Override
         //   public Integer apply(String param) {

         //       return param.length();

        Function<String, Integer> interfaceFunc = param -> param.length();

        System.out.println(interfaceFunc.apply("esteban"));




            }
        };

  // }

//}

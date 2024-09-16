package ExpresionesLmabdas;

import java.util.function.Predicate;

public class InterfacePredicated {

    public static void main(String[] args){

        Predicate<String> variablePredicate = cad -> cad.length() > 3;

        System.out.println(variablePredicate.test("holaa"));
        System.out.println(variablePredicate.test("pa"));

        //Predicate<String> variablePredicate= new Predicate<String>() {
        //    @Override
        //    public boolean test(String cad) {
        //        if (cad.length()>3){
         //           return true;
         //       }
         //       else{
         //           return false;
          //      }
          // }
      //  };
    }
}

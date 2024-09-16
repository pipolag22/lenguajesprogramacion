package ExpresionesLmabdas;

public class Lambdas {
    public static void main(String[] args)

    {

        Iinterface inter = new Iinterface() {

            public void suma(int a, int b)
            {
                System.out.println(a+b);
            }
        };

    }
}
  //  Iinterface inter = (a, b) -> System.out.println(a + b);

      //  inter.suma(21,45);
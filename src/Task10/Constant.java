package Task10;

public class Constant {
    static  class mysql{
        static class local{

            static String username="mysql local username";
            static String password="mysql local password";
        }
        static class Dev{
            static String username="mysql Dev username";
            static String password="mysql Dev password";
            void m1(){
                System.out.println("method");
            }
        }
        static class Prod{
            static String username="mysql Prod username";
            static String password="mysql Prod password";
        }
    }

    static  class oracle{

        static class local{

            static String username="oracle local username";
            static String password="oracle local password";
        }
        static class Dev{
            static String username="oracle Dev username";
            static String password="oracle Dev password";
        }
        static class Prod{
            static String username="oracle Prod username";
            static String password="oracle Prod password";
        }
    }
}

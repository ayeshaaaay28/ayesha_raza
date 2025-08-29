//// Create a Main class
//    public class main {
//        int x;
//        int y;
//
//        // Create a class constructor for the Main class
//        public main() {
//            x = 5;
//            x= y;
//            x= 4 ;
//        }
//
//        public static void main(String[] args) {
//            main myObj = new main();
//            System.out.println(myObj.x);
//        }
//    }
//public class main {
//    int a;
//    String b;
//    boolean c;
//
//
//    public main() { // default construr null hojyga lkn ham khud banygy apne marzi se taky value asgong kr ske
//        a = 100;
//        b = "ayesha";
//        c = true;
//    }
//
//    public static void main(String[] args) {
//        main ref = new main();
//        System.out.println(ref.a);
//        System.out.println(ref.b);
//        System.out.println(ref.c);
//    }
//}
class A {
    int x; int y;
    A(int a, int b){
        x=a; y=b;
    }
//    void show(){
//        System.out.println(x + y);
//    }
}
class B{
public static void main(String[] args) {
    A ref= new A(100,20);
    System.out.println(ref.A);
      }
}
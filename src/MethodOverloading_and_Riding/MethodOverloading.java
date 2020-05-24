package MethodOverloading_and_Riding;
// same  methods (same name) in a class with different parameters is called Method Overloading
public class MethodOverloading {
    public static void main(String[] args) {

    }
    public  void a(){
        System.out.println("Simple a");
    }

    public static void a(String s){
        System.out.println("String a");
    }
    public static void a(int a){
        System.out.println("Int a");
    }
}

package Inheritance;


//Super keyword basically calls the constructor of parent class that matches with the child class constructor type
 class A{
     A(){
         System.out.println("Default A");
     }
     A(int a){
         System.out.println(a+"a int mein hoon");
     }
 }

 class B extends A{
     B(){
         super(5);
         System.out.println("Default B");
     }
     B(int b){
         super(b);
         System.out.println(b+" b int mein hoon");
     }
 }



public class SuperKeyword {

    public static void main(String[] args) {
        B b=new B();

    }
}

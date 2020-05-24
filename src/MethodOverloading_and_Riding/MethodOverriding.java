package MethodOverloading_and_Riding;
//child class overrides methods of parent class
// in case a method is not present in child class then compiler looks for parent class
public class MethodOverriding {
    public static void main(String[] args) {
        C c=new C();
        c.axe();
    }
}

class A{
    public void axe(){

        System.out.println("axe in A");
    }
}

class B extends A{
    public void axe(){
        super.axe();
        System.out.println("axe in B");
    }
}

class C extends B{

    public void axe(){
        super.axe();
        System.out.println("axe in C");
    }

}
package Inheritance;
// Java has multi-level inheritance
// It does not have multiple inheritance
//parent class can access all methods/variables of above parent classes
class Car{
    public Car(){
        System.out.println("Car it is");
    }
    int number;
    String tyres;
    int doors;

}
class BMW extends Car{
    public BMW(){
        System.out.println("BMW it is");
    }
    String material="Alloy Tungsten";
    public void nitro(){
        System.out.println("BMW nitro3 xxqr");
    }

}
class I3 extends BMW{
   public  I3(){
       System.out.println("I3 it is");
    }
    String door="vertical opener";
}


public class Parent {
    public static void main(String[] args) {


        I3 gen2020=new I3();
//        gen2020.number=241;
//        System.out.println(gen2020.material);
//        gen2020.nitro();
    }
}


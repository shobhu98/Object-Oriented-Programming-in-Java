package Abstraction;
// A class  with only given structure but no implementation
// We cannot create objects of  abstract classes
// Abstract classes can be  extended and then object can be created
public class abstraction {
    public static void main(String[] args) {
        Aman aman = new Aman();
        aman.eat();
        Rohan rohan=new Rohan();
        rohan.eat();
    }


}


 abstract class Human{
 abstract public void eat();
 abstract public void sleep();
}

class Aman extends Human{
    @Override
    public void eat() {
        System.out.println("Eats 4 meals  a day");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps 5 hours");
    }
}

class Rohan extends  Human {
    @Override
    public void eat() {
        System.out.println("Eats 3 meals a day");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep 7 hours");
    }

}
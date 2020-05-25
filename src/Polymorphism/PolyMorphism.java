package Polymorphism;// What belongs to a child will belong to the parent but not the other way round
//Runtime polymorphism -method overriding



public class PolyMorphism {
    public static void main(String[] args) {
//        Polymorphism.Child c1=new Polymorphism.Parent();
        Parent p1=new Child();
        p1.book();
        System.out.println(p1.s);

    }

}


class Parent{
    String s="Polymorphism.Parent";
    public void book(){
        System.out.println("Parents book");
    }
    public void parent(){
        System.out.println("Polymorphism.Parent Properties");
    }
}


class Child extends Parent{
    String s="Polymorphism.Child";
    public void book(){
        System.out.println("Polymorphism.Child book");
    }
    public void child(){
        System.out.println("Polymorphism.Child Properties");
    }
}
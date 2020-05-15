package Intro;

 public class Parent {
    public Parent(){
        System.out.println("Parent class");
    }
   final public void func(){
        System.out.println("I am func");
    }

}
class Child extends Parent{



    public Child(){
        System.out.println("Child class");
    }
     public void func(){
        System.out.println("I am func");
    }
}

package Intro;

public class PersonClient {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.age=22;
        p1.name="Stw";
        p1.Setgender("male");

        System.out.println(p1.name);
        System.out.println(p1.age);
    }
}

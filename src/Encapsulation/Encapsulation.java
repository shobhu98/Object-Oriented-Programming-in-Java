package Encapsulation;
// Basically means that binding data with methods so that not everybody can change the values assigned to a object
//We keep variables private and access them only through methods




public class Encapsulation {
 private int age;
 private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Accessor{
    public static void main(String[] args) {
        Encapsulation e1=new Encapsulation();
        e1.setName("Harsh");
        e1.setAge(12);
        System.out.println(e1.getName());
        System.out.println(e1.getAge());
    }
}

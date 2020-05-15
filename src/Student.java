public class Student {
    int age;
    String name;
    static String teacher;
    static {
        System.out.println("I am inside static block");
    }
    public Student(){
        System.out.println(" I am inside default constructor");
    }
}
class Student_Client{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();


    }
}

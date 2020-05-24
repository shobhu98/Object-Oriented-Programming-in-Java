package Static_Keyword;
//Static keyword
// variable : common for all objects(class specific)
//method: static methods can only
//static block loaded only once
public class Static_Keyword {
   public Static_Keyword(){
       System.out.println("Default Constructor");
   }
   static {
       System.out.println("Static block");
   }
    static String teacher="Devi";
    int age;
}
class Client{
    public static void main(String[] args) {
        Static_Keyword staticKeyword=new Static_Keyword();
        staticKeyword.age=14;
        staticKeyword.teacher="Harsh";

        Static_Keyword s2=new Static_Keyword();
        s2.age=12;
        System.out.println(staticKeyword.age+": "+staticKeyword.teacher);
        System.out.println(s2.age+": "+s2.teacher);
    }


}

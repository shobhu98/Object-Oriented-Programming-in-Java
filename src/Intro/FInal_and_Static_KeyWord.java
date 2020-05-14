package Intro;

public class FInal_and_Static_KeyWord {


// final is used to set the final value. It cannot be changed again.
    //non static function can access both  static and non static variables
    // static function can only access static variables/
    // We cannot use this keyword with static functions

   // What is static variables?
    //Static variables are not object specific . They are accessed by the whole class.
    //A static value is changed for all objects belonging to that class.



    //Using static blocks is a good habit because they are called only once when a class is loaded.



    public final int rollno=0;
    public static final int students=1000;

    public static void stud(){
       if(FInal_and_Static_KeyWord.students==1000){
           System.out.println("aa");
       }
    }



}

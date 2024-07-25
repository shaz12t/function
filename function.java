import java.util.*;
public class function{
     public static void PrintMyName (String name){
        System.err.println(name);
    
     }
     public static void sumNumber (int a, int b){
        System.out.println(a+b);
    return;
     }
       public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       String name =sc.next();
       PrintMyName(name);
       sumNumber(2,3);
    }
}

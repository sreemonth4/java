// here i am going to code program about palindrome by using boolean datatype and some new logic.
import java.util.*;
public class Main{
  public static void main(String[] args){
   boolean palindrome=true;
   String s="bo00ghjob";
   int n=s.length();
   for(int i=0;i<n/2;i++){
     System.out.println(i);
     if(s.charAt(i)!=s.charAt(n-i-1)){
       palindrome=false;
       break;
     }
   }
   if(palindrome){
     System.out.println("yes "+s+" is a palindrome");
   }else{
     System.out.println("No "+s+" is not a palindrome");
   }
  }
}

output: No // will be printed for above string input.

import java.util.*; 
import java.io.*;

class FirstReverse_code {  
  public static String FirstReverse(String str) { 
      String reverse = "";
      for (int i = str.length()-1; i >= 0; i--) {
          reverse += str.charAt(i);
          // this will take the last character of the string and insert it
          // in another string, this will make the reverse.
      }
    return reverse;
  } 
  
  public static void main (String[] args) {     
    Scanner in = new Scanner(System.in);
    System.out.print(FirstReverse(in.nextLine())); 
    in.close();
  }    
}
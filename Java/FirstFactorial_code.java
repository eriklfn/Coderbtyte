import java.util.*;
import java.io.*;

class FirstFactorial_code {
    public static int FirstFactorial(int num) {
        if (num >= 1) {
            return num * FirstFactorial(num - 1);
            //this is a recursive method, it will call itself decremented by one.
        } else {
            return 1;
            //this is the base of the method, it represents 1*0 in the factorial
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // this create a new scanner called in
        System.out.print(FirstFactorial(in.nextInt()));
        // the input is already inserted inside the method call
        in.close();
    }
}
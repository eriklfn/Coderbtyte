import java.util.*;
import java.io.*;

class SimpleAdding_code {

    public static int SimpleAdding(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        // this is so easy that if I try to explain, it will look harder
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(SimpleAdding(in.nextInt()));
        in.close();
    }

}
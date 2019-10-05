import java.util.*;
import java.io.*;

class LongestWord_code {
    public static String RemovePunctuation(String sentence) {
        return sentence.replaceAll("[^a-zA-Z0-9 ]", "");
    }
    // this method removes everything but alphanumeric characters
    // and space from the string

    public static String LongestWord(String sentence) {
        String[] split = sentence.split(" ");
        String longest = split[0];
        // this defaults the first word of the array as the longest
        for (int i = 1; i < split.length ; i++) {
            if (split[i].length() > longest.length()) {
                longest = split[i];
                // this checks if the current word in the loop is
                // longer than the previous one recorded
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(LongestWord(RemovePunctuation(in.nextLine())));
        in.close();
    }
}
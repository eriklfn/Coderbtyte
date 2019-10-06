import java.util.*;
import java.io.*;

class LetterChanges_code {
    public static String NextChar(String str) {
        String text = "";
        for (int i = 0; i < str.length(); i++) {
            char charNow = str.charAt(i);
            if ((charNow > 64 && charNow < 90) || (charNow > 96 && charNow < 122)) {
                text += (char) ((int) charNow + 1);
            } else if (charNow == 90 || charNow == 122) {
                text += "A";
            }
            else {
                text += charNow;
            }
        }
        return text;
    }

    public static String LetterChanges(String str) {
        String text = "";
        for (int i = 0; i < str.length(); i++) {
            char charNow = str.charAt(i);
            switch (charNow) {
            case 'e':
                charNow = 'E';
                break;
            case 'i':
                charNow = 'I';
                break;
            case 'o':
                charNow = 'O';
                break;
            case 'u':
                charNow = 'U';
                break;
            }
            text += charNow;
        }
        return text;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(LetterChanges(NextChar(in.nextLine())));
        in.close();
    }

}
package codeChef;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T --> 0) {
            String str = scanner.next();
            char ch;
            boolean smallLetters = false;
            boolean capitalLetters = false;
            boolean number = false;
            boolean specialChar = false;
            if (str.length() >= 10) {
                for (int i = 0; i < str.length(); i++) {
                    ch = str.charAt(i);
                    if (Character.isDigit(ch)) {
                        if (i > 0 && i < str.length() - 1) {
                            number = true;
                        }
                    } else if (Character.isUpperCase(ch)) {
                        if (i > 0 && i < str.length() - 1) {
                            capitalLetters = true;
                        }
                    } else if (Character.isLowerCase(ch)) {
                        smallLetters = true;
                    } else if (str.charAt(i) == '@'|| str.charAt(i) == '#'|| str.charAt(i) == '%'||
                    str.charAt(i) == '&'|| str.charAt(i) == '?') {
                        if (i > 0 && i < str.length() - 1) {
                            specialChar = true;
                        }
                    }
                }
                if ( number && capitalLetters && smallLetters && specialChar) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}

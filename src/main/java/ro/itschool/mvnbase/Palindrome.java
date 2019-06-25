package ro.itschool.mvnbase;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        int control;
        int code;
        String stringToSplit;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println(" Input 1 for int and 2 for string; ");
            code = scan.nextInt();

            if (code != 1 && code != 2) {
                System.out.println(code + " is not a valid input, try again: ");
                control = 0;
            } else {
                control = 1;
            }
        }
        while (control == 0);

        if (code == 1) {
            System.out.println(" Input integer: ");
            int integerToSplit = scan.nextInt();
            if (integerToSplit<0) {integerToSplit=-integerToSplit;}
            stringToSplit = Integer.toString(integerToSplit);
        }
        else {
            System.out.println(" Input string: ");
            scan.nextLine();
            stringToSplit = scan.nextLine();
        }

        CheckIfStringIsPalindrome myCase = new CheckIfStringIsPalindrome();
            boolean finalControl = myCase.checkIfPalindrome(stringToSplit);
            if (finalControl) {
                System.out.println(" Your input is a palindrome ");
            }
            else {
                System.out.println(" Your input is not a palindrome ");
            }
    }
}

package String;

import java.util.Scanner;

public class IntegerToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        String numberString = String.valueOf(number);
        System.out.println("Converted String: " + numberString);

        sc.close();
    }
}


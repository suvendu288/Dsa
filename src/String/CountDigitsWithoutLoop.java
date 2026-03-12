package String;

import java.util.Scanner;

public class CountDigitsWithoutLoop {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        String s=Integer.toString(n);
        System.out.println(s);
        System.out.println(s.length());


    }
}

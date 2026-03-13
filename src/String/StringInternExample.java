package String;

public class StringInternExample {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        // Comparing references
        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1 == s3 : " + (s1 == s3));
        System.out.println("s3 == s4 : " + (s3 == s4));
        String s5 = s3.intern();
        System.out.println("s1 == s5 : " + (s1 == s5)); // true (same pool reference)
    }
}

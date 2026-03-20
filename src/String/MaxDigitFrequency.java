package String;

public class MaxDigitFrequency {
    public static void main(String[] args) {
        String str = "122334455566666"; // input

        int[] freq = new int[10]; // digits 0-9

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - '0']++;
        }

        // Find max frequency digit
        int maxFreq = 0;
        int digit = -1;

        for (int i = 0; i < 10; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                digit = i;
            }
        }

        System.out.println("Digit with max frequency: " + digit);
    }
}
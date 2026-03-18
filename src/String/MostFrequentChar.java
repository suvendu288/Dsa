package String;

import java.util.*;

public class MostFrequentChar {
    public static void main(String[] args) {
        String str = "banana"; // You can change this input

        int[] freq = new int[26]; // For 26 lowercase letters

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }

        // Find max frequency character
        int max = 0;
        char result = 'a';

        for (int i = 0; i < 26; i++) {
            if (freq[i] > max) {
                max = freq[i];
                result = (char) (i + 'a');
            }
        }

        System.out.println("Most frequent character: " + result);
    }
}
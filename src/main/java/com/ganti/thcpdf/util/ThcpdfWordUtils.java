package com.ganti.thcpdf.util;

public class ThcpdfWordUtils {
    // Add custom word processing utility functions here

    /**
     * Example: Capitalize the first letter of each word in a string.
     */
    public static String capitalizeWords(String input) {
        if (input == null || input.isEmpty()) return input;
        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                sb.append(Character.toUpperCase(word.charAt(0)));
                sb.append(word.substring(1).toLowerCase());
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    // Add more word processing methods as needed
}

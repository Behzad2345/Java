/*10. Write a Java program to store multiple strings in an
array and display them in alphabetical order, then find the
longest string among them. */

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] str = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }

        // Sort alphabetically
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        System.out.println("Strings in alphabetical order:");
        for (int i = 0; i < n; i++) {
            System.out.println(str[i]);
        }

        // Find longest string
        String longest = str[0];

        for (int i = 1; i < n; i++) {
            if (str[i].length() > longest.length()) {
                longest = str[i];
            }
        }

        System.out.println("Longest String: " + longest);

        sc.close();
    }
}
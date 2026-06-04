/*Assignment 7
Write a Java program to print:
1
212
32123
4321234
Use nested loops. */

public class Pattern {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {

            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Print increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
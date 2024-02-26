public class Main {
    public static void main(String[] args) {
        // Problem 6: Nested loop to create the figure
        System.out.println("Nested loop to create the figure:");
        // Outer loop controls the number of rows
        for (int i = 5; i >= 1; i--) {
            // Inner loop controls the number of asterisks in each row
            for (int j = 1; j <= i; j++) {
                // Print an asterisk for each iteration of the inner loop
                System.out.print("*");
            }
            // Move to the next line after each row is printed
            System.out.println(); // newline
        }
    }
}

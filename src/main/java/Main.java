import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];  
        int sum = 0; 

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number to sum " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();  
            sum += numbers[i]; 
        }
        scanner.close();  

       
        System.out.println("\nThe sum of the numbers:  "  + sum / 10);
    }
}
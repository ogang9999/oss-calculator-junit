package itm.oss;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();        
        while (true) {
            System.out.println("=== Calculator Menu ===");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Get next prime");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            if (choice == 6) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter first number: ");
            int a = scanner.nextInt();
            
            int b = 0;
            if (choice < 5) {
                System.out.print("Enter second number: ");
                b = scanner.nextInt();
            }

            switch (choice) {
                case 1:
                    System.out.println("Result: " + calc.add(a, b));
                    break;
                case 2:
                    System.out.println("Result: " + calc.subtract(a, b));
                    break;
                case 3:
                    System.out.println("Result: " + calc.multiply(a, b));
                    break;
                case 4:
                    System.out.println("Result: " + calc.divide(a, b));
                    break;
                case 5:
                    System.out.println("Result: " + calc.getNextPrime(a));
                    break;
                case 6:
                    try {
                        System.out.println("Result: " + calc.divide(a, b));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid option.");
            }
            System.out.println();
        }

        scanner.close();


        // .jar excution: cmd> java -jar <file_name>
    }
}

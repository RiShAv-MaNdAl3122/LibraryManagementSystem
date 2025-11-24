import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("   LIBRARY MANAGEMENT SYSTEM V1.0    ");
        System.out.println("=====================================");
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nSelect an Option:");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");
            
            String choice = scanner.nextLine();
            
            if (choice.equals("1")) {
                System.out.println(">> Login functionality coming soon...");
            } else if (choice.equals("2")) {
                System.out.println(">> Exiting System. Goodbye!");
                break;
            } else {
                System.out.println(">> Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}

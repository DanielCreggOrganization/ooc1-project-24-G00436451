package ie.atu.SuperheroManager;

import java.util.Scanner;

public class Main {
    private static Superhero[] superheroes = new Superhero[10];  // Array to store Superhero objects
    private static int count = 0;  // Track how many superheroes have been created

    public static void main(String[] args) {
        // Scanner to capture user input
        Scanner scanner = new Scanner
        (System.in);

        // Infinite loop to display the menu repeatedly
        while(true) {
            // Displaying menu options to the console
            System.out.println("");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Superhero Manager Menu");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1. Create a Superhero");
            System.out.println("2. View All Superheroes");
            System.out.println("3. Delete a Superhero");
            System.out.println("4. Exit");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Enter your choice: ");

            // Get user input
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the leftover newline character

            // Menu action based on user input
            if (choice == 1) {
                // Option to create a new superhero
                System.out.print("Enter Comic Name: ");
                String comic = scanner.nextLine();

                System.out.print("Enter Volume Number: ");
                int volume = scanner.nextInt();

                System.out.print("Enter Price (EUR): ");
                float price = scanner.nextFloat();

                System.out.print("Does the superhero have superpowers? (true/false): ");
                boolean hasSuperpowers = scanner.nextBoolean();

                // Create a new superhero and add to the array
                superheroes[count] = new Superhero(volume, comic, price, hasSuperpowers);
                count++;  // Increment count after adding a superhero
                System.out.println("Superhero created successfully!");

            } else if (choice == 2) {
                // Option to view details of all superheroes
                System.out.println("\nList of Superheroes:");
                for (int i = 0; i < count; i++) {
                    superheroes[i].displayCharacterDetails();
                    System.out.println("--------------------");
                }

            } else if (choice == 3) {
                // Option to delete a superhero by their unique ID
                System.out.print("Enter the ID of the superhero to delete: ");
                int idToDelete = scanner.nextInt();

                if (idToDelete >= 1 && idToDelete <= count) {
                    // Shift all superheroes after the deleted one
                    for (int i = idToDelete - 1; i < count - 1; i++) {
                        superheroes[i] = superheroes[i + 1];
                    }
                    superheroes[count - 1] = null;  // Clear last element
                    count--;  // Decrease count
                    System.out.println("Superhero deleted successfully!");
                } else {
                    System.out.println("Invalid ID! No superhero found with that ID.");
                }

            } else if (choice == 4) {
                // Exit the program
                System.out.println("Exiting program...");
                break;

            } else {
                // Invalid option
                System.out.println("Invalid option! Please try again.");
            }
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
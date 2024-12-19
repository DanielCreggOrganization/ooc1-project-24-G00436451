package ie.atu.SuperheroManager;

import java.util.Scanner;

// Main class containing the superhero management program
public class Main {
    // Array to store up to 10 superhero objects
    private static Superhero[] superheroes = new Superhero[10];
    // Variable to keep track of the current number of superheroes
    private static int count = 0;
    // Array to store comic sales for each superhero
    private static int[] comicSales = new int[10];

    public static void main(String[] args) {
        // Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Infinite loop to keep the program running until the user chooses to exit
        while (true) {
            // Display the main menu options
            System.out.println("");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Superhero Manager Menu");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1. Superhero Management");
            System.out.println("2. Statistics and Utilities");
            System.out.println("3. Exit");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Enter your choice: ");

            // Read the user's choice for the main menu
            int mainChoice = scanner.nextInt();
            scanner.nextLine();  // Consume leftover newline character

            // Direct the user to the appropriate submenu or exit
            if (mainChoice == 1) {
                // Open the Superhero Management submenu
                manageSuperheroes(scanner);
            } else if (mainChoice == 2) {
                // Open the Statistics and Utilities submenu
                showStatisticsAndUtilities(scanner);
            } else if (mainChoice == 3) {
                // Exit the program
                System.out.println("Exiting program...");
                break;  // Exit the loop
            } else {
                // Handle invalid input for the main menu
                System.out.println("Invalid option! Please try again.");
            }
        }

        // Close the scanner to release resources
        scanner.close();
    }

    // Function to manage superheroes: create, view, or delete
    private static void manageSuperheroes(Scanner scanner) {
        while (true) {
            // Display the Superhero Management submenu options
            System.out.println("");
            System.out.println("~~~~~~~~ Superhero Management ~~~~~~~~");
            System.out.println("1. Create a Superhero");
            System.out.println("2. View All Superheroes");
            System.out.println("3. Delete a Superhero");
            System.out.println("4. Back to Main Menu");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Enter your choice: ");

            // Read the user's choice for managing superheroes
            int manageChoice = scanner.nextInt();
            scanner.nextLine();  // Consume leftover newline character

            if (manageChoice == 1) {
                // Create a new superhero
                System.out.print("Enter Comic Name: ");
                String comic = scanner.nextLine();

                System.out.print("Enter Volume Number: ");
                int volume = scanner.nextInt();

                System.out.print("Enter Price (EUR): ");
                float price = scanner.nextFloat();

                System.out.print("Does the superhero have superpowers? (true/false): ");
                boolean hasSuperpowers = scanner.nextBoolean();

                System.out.print("Enter Comic Sales (number of units sold): ");
                int sales = scanner.nextInt();

                // Add the new superhero and its sales data to their respective arrays
                superheroes[count] = new Superhero(volume, comic, price, hasSuperpowers);
                comicSales[count] = sales;
                count++;  // Increment the superhero count
                System.out.println("Superhero created successfully!");

            } else if (manageChoice == 2) {
                // Display all superheroes and their details
                System.out.println("\nList of Superheroes:");
                for (int i = 0; i < count; i++) {
                    superheroes[i].displayCharacterDetails();  // Display the details of each superhero
                    System.out.println("Comic Sales: " + comicSales[i]);  // Display the associated comic sales
                    System.out.println("--------------------");
                }
            } else if (manageChoice == 3) {
                // Delete a superhero by ID
                System.out.print("Enter the ID of the superhero to delete: ");
                int idToDelete = scanner.nextInt();

                // Ensure the ID entered is valid
                if (idToDelete >= 1 && idToDelete <= count) {
                    // Shift the superheroes and sales data to "delete" the superhero
                    for (int i = idToDelete - 1; i < count - 1; i++) {
                        superheroes[i] = superheroes[i + 1];
                        comicSales[i] = comicSales[i + 1];
                    }
                    superheroes[count - 1] = null;  // Clear the last superhero
                    comicSales[count - 1] = 0;  // Clear the last sales entry
                    count--;  // Decrement the superhero count
                    System.out.println("Superhero deleted successfully!");
                } else {
                    System.out.println("Invalid ID! No superhero found with that ID.");
                }

            } else if (manageChoice == 4) {
                // Return to the main menu
                break;
            } else {
                // Handle invalid input for the superhero management menu
                System.out.println("Invalid option! Please try again.");
            }
        }
    }

    // Function to show statistics and perform utility tasks
    private static void showStatisticsAndUtilities(Scanner scanner) {
        while (true) {
            // Display the Statistics and Utilities submenu options
            System.out.println("");
            System.out.println("~~~~~~~ Statistics and Utilities ~~~~~~~");
            System.out.println("1. Display Total Superheroes");
            System.out.println("2. Display Average Comic Price");
            System.out.println("3. Convert Comic Prices");
            System.out.println("4. Compare Comic Sales");
            System.out.println("5. Back to Main Menu");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Enter your choice: ");

            // Read the user's choice for statistics and utilities
            int statsChoice = scanner.nextInt();
            scanner.nextLine();  // Consume leftover newline character

            if (statsChoice == 1) {
                // Display the total number of superheroes
                System.out.println("Total superheroes: " + count);
            } else if (statsChoice == 2) {
                // Calculate and display the average price of comics
                if (count == 0) {
                    System.out.println("No superheroes available.");
                } else {
                    float totalPrice = 0;
                    for (int i = 0; i < count; i++) {
                        totalPrice += superheroes[i].getPrice();
                    }
                    float averagePrice = totalPrice / count;
                    System.out.printf("Average comic price: %.2f EUR\n", averagePrice);
                }
            } else if (statsChoice == 3) {
                // Convert the price of all comics to another currency
                System.out.println("Choose target currency:");
                System.out.println("1. USD");
                System.out.println("2. GBP");
                System.out.println("3. JPY");
                System.out.print("Enter your choice: ");
                int currencyChoice = scanner.nextInt();

                float conversionRate = 1.0f;
                String targetCurrency = "";

                // Determine the conversion rate based on the selected currency
                switch (currencyChoice) {
                    case 1:
                        conversionRate = 1.1f;  // EUR to USD
                        targetCurrency = "USD";
                        break;
                    case 2:
                        conversionRate = 0.85f;  // EUR to GBP
                        targetCurrency = "GBP";
                        break;
                    case 3:
                        conversionRate = 130.0f;  // EUR to JPY
                        targetCurrency = "JPY";
                        break;
                    default:
                        System.out.println("Invalid currency choice!");
                        continue;
                }

                // Display the converted prices for each comic
                System.out.println("Prices in " + targetCurrency + ":");
                for (int i = 0; i < count; i++) {
                    float convertedPrice = superheroes[i].getPrice() * conversionRate;
                    System.out.printf("%s - %.2f %s\n", superheroes[i].getComic(), convertedPrice, targetCurrency);
                }
            } else if (statsChoice == 4) {
                // Compare the sales of comics to find the best and worst-selling ones
                if (count == 0) {
                    System.out.println("No superheroes available.");
                } else {
                    int maxSales = comicSales[0];
                    int minSales = comicSales[0];
                    int maxIndex = 0;
                    int minIndex = 0;

                    // Loop through sales data to find the maximum and minimum
                    for (int i = 1; i < count; i++) {
                        if (comicSales[i] > maxSales) {
                            maxSales = comicSales[i];
                            maxIndex = i;
                        }
                        if (comicSales[i] < minSales) {
                            minSales = comicSales[i];
                            minIndex = i;
                        }
                    }

                    // Display the best and worst-selling comics
                    System.out.println("Best-selling Comic: " + superheroes[maxIndex].getComic() + " with " + maxSales + " sales.");
                    System.out.println("Worst-selling Comic: " + superheroes[minIndex].getComic() + " with " + minSales + " sales.");
                }
            } else if (statsChoice == 5) {
                // Return to the main menu
                break;
            } else {
                // Handle invalid input for statistics and utilities
                System.out.println("Invalid option! Please try again.");
            }
        }

        
    }
}
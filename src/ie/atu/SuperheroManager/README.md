Superhero Manager - README
Overview
The Superhero Manager is a simple console-based Java application that allows users to manage superhero characters, including creating, viewing, and deleting superheroes. It utilizes an object-oriented approach with inheritance, polymorphism, and encapsulation. The program consists of two main classes: Main and Superhero (with a parent class ComicBookCharacter).

Features
Create a Superhero: Allows users to input details for a new superhero, such as comic name, volume, price, and whether they have superpowers.
View All Superheroes: Displays a list of all superheroes with their respective details (comic, volume, price, and superpowers).
Delete a Superhero: Deletes a superhero based on their unique ID and shifts the remaining superheroes in the array to fill the gap.
Exit: Terminates the program.
Technologies Used
Java (JDK 8 or later)
Basic concepts of Object-Oriented Programming (OOP)
Project Structure
1. Main Class (Main.java)
This class contains the main method and handles user interaction, including displaying the menu and responding to user input. The options available are:

Create a superhero
View all superheroes
Delete a superhero
Exit the program
java
Copy code
// A brief look at the menu structure in the Main class
System.out.println("1. Create a Superhero");
System.out.println("2. View All Superheroes");
System.out.println("3. Delete a Superhero");
System.out.println("4. Exit");
2. ComicBookCharacter Class (ComicBookCharacter.java)
An abstract class representing a generic comic book character, which could be a superhero or other characters. It defines the common attributes and an abstract method for displaying character details:

Comic name
Volume number
Price (EUR)
Superpower status
java
Copy code
// Abstract class with instance variables and an abstract method for displaying details
public abstract void displayCharacterDetails();
3. Superhero Class (Superhero.java)
A subclass of ComicBookCharacter, which represents a superhero. It extends the parent class by providing a concrete implementation for the displayCharacterDetails method and introduces a static count for tracking superhero instances.

java
Copy code
// Superhero class extending ComicBookCharacter
@Override
public void displayCharacterDetails() {
    // Displaying superhero details
}
How to Run the Application
Clone or Download the Project:

Clone the repository or download the project files to your local machine.
Compile the Code:

Navigate to the project directory in the terminal or command prompt and run:
css
Copy code
javac Main.java ComicBookCharacter.java Superhero.java
Run the Application:

After compiling the classes, run the main application:
css
Copy code
java Main
Interact with the Menu:

The program will present a menu with options to create, view, delete superheroes, or exit.
Use the corresponding number (1-4) to navigate through the options.
Example Usage
Menu:
markdown
Copy code
~~~~~~~~~~~~~~~~~~~~~~~~~~
Superhero Manager Menu
~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Create a Superhero
2. View All Superheroes
3. Delete a Superhero
4. Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~
Enter your choice: 1
Creating a Superhero:
mathematica
Copy code
Enter Comic Name: Spider-Man
Enter Volume Number: 5
Enter Price (EUR): 4.99
Does the superhero have superpowers? (true/false): true
Superhero created successfully!
Viewing All Superheroes:
yaml
Copy code
List of Superheroes:
Superhero Details:
Comic: Spider-Man
Volume: 5
Price (EUR): 4.99
Has Superpowers: Yes
--------------------
Deleting a Superhero:
arduino
Copy code
Enter the ID of the superhero to delete: 1
Superhero deleted successfully!
Exiting the Program:
Copy code
Exiting program...
Notes
Array Limitation: The program uses a fixed-size array of 10 elements to store superheroes. This means the application can manage up to 10 superheroes at a time. If you want to store more superheroes, you'll need to increase the size of the array or implement a dynamic data structure like an ArrayList.
Superhero ID: Each superhero created will be given a unique ID based on the order in which they were added. The deletion of superheroes is based on their index in the list.
Future Enhancements
Use an ArrayList instead of an array to allow dynamic storage and management of superheroes.
Add additional properties or actions for superheroes, such as powers, abilities, or character biography.
Implement exception handling for invalid inputs and other edge cases.

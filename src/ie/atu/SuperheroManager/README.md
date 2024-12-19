Superhero Manager
Overview
The Superhero Manager application is a Java-based program designed to help users manage a collection of superhero comic books. Users can create, view, and delete superheroes, as well as perform statistical and utility operations like analyzing sales data and converting prices.

Features
1. Superhero Management
Create a Superhero: Add a new superhero with details such as comic name, volume, price, superpower status, and sales data.
View All Superheroes: Display the list of all superheroes with their respective details and sales.
Delete a Superhero: Remove a superhero from the collection using their unique ID.
2. Statistics and Utilities
Total Superheroes: View the total number of superheroes in the system.
Average Comic Price: Calculate and display the average price of all comic books.
Convert Comic Prices: Convert the price of comic books into different currencies (USD, GBP, JPY).
Compare Comic Sales: Identify the best and worst-selling comics.
3. Menu Navigation
Organized into two main submenus: Superhero Management and Statistics and Utilities.
Allows smooth transitions between the main menu and submenus for better usability.
Class Design
1. ComicBookCharacter (Abstract Class)
Purpose: Serves as a base class for all comic book characters.
Key Features:
Encapsulates common attributes: comic, price, volume, and hasSuperpowers.
Includes an abstract method displayCharacterDetails() to be implemented by subclasses.
2. Superhero (Subclass)
Purpose: Represents a specific type of comic book character—superheroes.
Key Features:
Implements the displayCharacterDetails() method to display superhero-specific information.
Maintains a static count of superheroes for unique identification.
3. Main (Driver Class)
Purpose: Controls the program flow and manages user interactions.
Key Features:
Contains menus for superhero management and statistical utilities.
Handles user input validation and provides appropriate feedback.
How to Run the Program
Compile the source files using the Java compiler:
bash
Copy code
javac ie/atu/SuperheroManager/*.java
Run the program:
bash
Copy code
java ie.atu.SuperheroManager.Main
Example Usage
Create a Superhero
Choose "Superhero Management" > "Create a Superhero".
Enter details such as comic name, volume, price, superpowers, and sales.
View the confirmation message: Superhero created successfully!
Convert Comic Prices
Choose "Statistics and Utilities" > "Convert Comic Prices".
Select a target currency (e.g., USD, GBP, JPY).
View the converted prices displayed in the selected currency.
Dependencies
Java Development Kit (JDK) 8 or higher.
A terminal or IDE (e.g., IntelliJ IDEA, Eclipse) to run the program.
Future Enhancements
Add the ability to update superhero details.
Include more complex sales analytics (e.g., trend analysis).
Integrate with external APIs for real-time currency conversion rates.
Implement persistent storage for superheroes.
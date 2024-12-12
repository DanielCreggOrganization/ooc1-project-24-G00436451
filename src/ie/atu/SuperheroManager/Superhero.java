package ie.atu.SuperheroManager;

// Abstract class representing a generic Comic Book Character (could be a superhero or other character)
abstract class ComicBookCharacter {
    // Instance variables
    private String comic;
    private float priceEur;
    private int volume;
    private boolean havesuperpowers;

    // Constructor for initializing values
    public ComicBookCharacter(int volume, String comic, float price, boolean havesuperpowers) {
        this.comic = comic;
        this.havesuperpowers = havesuperpowers;
        this.priceEur = price;
        this.volume = volume;
    }

    // Getter and Setter methods for encapsulation
    public int getVolume() {
        return this.volume;
    }

    public float getPrice() {
        return this.priceEur;
    }

    public String getComic() {
        return this.comic;
    }

    public boolean hasSuperpowers() {
        return this.havesuperpowers;
    }

    // Abstract method for description, to be implemented by subclasses
    public abstract void displayCharacterDetails();
}

// Superhero class inheriting from ComicBookCharacter
class Superhero extends ComicBookCharacter {
    private static int superheroCount = 0;  // Static variable to track unique superhero ID

    // Constructor, calling the parent constructor using 'super' keyword
    public Superhero(int volume, String comic, float price, boolean havesuperpowers) {
        super(volume, comic, price, havesuperpowers);
        superheroCount++;  // Increment count for each new superhero
    }

    // Overriding abstract method to display superhero details (demonstrating polymorphism)
    @Override
    public void displayCharacterDetails() {
        System.out.println("Superhero Details:");
        System.out.println("Comic: " + getComic());
        System.out.println("Volume: " + getVolume());
        System.out.println("Price (EUR): " + getPrice());
        System.out.println("Has Superpowers: " + (hasSuperpowers() ? "Yes" : "No"));
    }

    // Static method to get the unique ID for each superhero
    public static int getSuperheroCount() {
        return superheroCount;
    }
}
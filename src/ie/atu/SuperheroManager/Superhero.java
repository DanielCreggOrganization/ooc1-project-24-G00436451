package ie.atu.SuperheroManager;

public class Superhero {

    //instance variables
  
    private String comic;
    private float price;
    private int volume;
    private boolean havesuperpowers;


    //Getter and setter method
    public int volume(){
        return this.volume;
    }
    public float price(){
        return this.price;
    }
    public String comic(){
        return this.comic;
    }
    public boolean havesuperpowers(){
        return this.havesuperpowers;
    }

    public void setvolume(int volume){
        this.volume = volume;
    }
    public void setprice(float price){
        this.price = price;
    }
    public void setcomic(String comic){
        this.comic = comic;
    }
    public void sethavesuperpowers(boolean havesuperpowers){
        this.havesuperpowers = havesuperpowers;
    }
    

}

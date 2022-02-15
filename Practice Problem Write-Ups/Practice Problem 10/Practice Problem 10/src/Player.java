public class Player { //(String name, int health, int maxDamage)
    private String name;
    private int health;
    private int maxDamage;

    public Player (String name, int health, int max) {
        this.name = name;  //constructor to pass in stats
        this.health = health;
        this.maxDamage = max;
    }
    public void hit(Player other) {
        int damage = (int)((Math.random() * this.maxDamage)+1); //generates random damage based on max damage
        other.setHealth(other.getHealth()-damage);
    }
    public String toString() {
        return this.name + ": " + this.health; //allows us to display name and health
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getHealth() { 
        return this.health;
    }
}

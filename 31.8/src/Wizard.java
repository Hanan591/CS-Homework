/**
 * This class represents a wizard for
 * a D&D type game.
 * @author Hanan Mohamed
 * @version 1.0
 * Lab08 Solution
 * Spring 2019
 *
 */
public class Wizard implements Lockable {
    private String name;
    private int health;
    private int key;
    private boolean locked;

    // No-argument constructor
    public Wizard() {
        this.name = "Generic";
        this.health = 100;     
        this.key = 0;         
        this.locked = false;   
    }

    // Constructor 1
    public Wizard(String name) {
        this.name = name;      
        this.health = 100;     
        this.key = 0;          
        this.locked = false;  
    }

    // Constructor 2
    public Wizard(String name, int health) {
        this.name = name;      
        this.health = health;  
        this.key = 0;          
        this.locked = false;   
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getKey() {
        return key;
    }

    // Implementation of takeDamage() method
    public void takeDamage(int power) {
        if (!isLocked()) {
            this.health -= power;
        }
    }

    // Implementation of setKey() method
    public void setKey(int key) {
        if (key > 0 && this.key == 0) {
            this.key = key;
        }
    }

    // Implementation of isLocked() method
    public boolean isLocked() {
        return locked;
    }

    // Implementation of lock() method
    public void lock(int key) {
        if (this.key == key) {
            this.locked = true;
        }
    }

    // Implementation of unlock() method
    public void unlock(int key) {
        if (this.key == key) {
            this.locked = false;
        }
    }
}
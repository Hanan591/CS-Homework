import java.util.HashMap;
import java.util.Map;

class Player {
    private String name;
    private int health;
    private Map<String, Integer> inventory;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.inventory = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int amount) {
        health -= amount;
        if (health < 0) health = 0;
    }

    public void heal(int amount) {
        health += amount;
        if (health > 100) health = 100;
    }

    public void addItem(String item, int quantity) {
        inventory.put(item, inventory.getOrDefault(item, 0) + quantity);
    }

    public boolean useItem(String item) {
        if (inventory.containsKey(item) && inventory.get(item) > 0) {
            inventory.put(item, inventory.get(item) - 1);
            if (inventory.get(item) == 0) inventory.remove(item);
            return true;
        }
        return false;
    }

    public void showInventory() {
        System.out.println("Inventory:");
        inventory.forEach((item, quantity) -> System.out.println("- " + item + " (x" + quantity + ")"));
    }

	public void addItem(Item item) {
		// TODO Auto-generated method stub
		
	}
}
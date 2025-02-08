public class Main {
    public static void main(String[] args) {
        Wizard wizard = new Wizard("Gandalf", 150);

        // Set a key for the wizard
        wizard.setKey(123);

        // Check if the wizard is locked
        System.out.println("Is wizard locked? " + wizard.isLocked());

        // Lock the wizard
        wizard.lock(123);

        // Check if the wizard is locked
        System.out.println("Is wizard locked? " + wizard.isLocked()); 

        // Try to take damage while locked
        wizard.takeDamage(20);
        System.out.println("Wizard's health: " + wizard.getHealth()); 

        // Unlock the wizard
        wizard.unlock(123);

        // Check if the wizard is locked
        System.out.println("Is wizard locked? " + wizard.isLocked()); 
        
        // Take damage while unlocked
        wizard.takeDamage(20);
        
        System.out.println("Wizard's health: " + wizard.getHealth()); 
    }
}
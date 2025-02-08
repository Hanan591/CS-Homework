import java.util.Scanner;

public class BagheeraGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get player's name
        System.out.print("Enter your player's name: ");
        String playerName = scanner.nextLine();

        // Create player and start the game
        Player player = new Player(playerName);
        System.out.println("Welcome to Bagheera!");
        System.out.println("Player Name: " + player.getName());
        System.out.println("Health: " + player.getHealth());

        Player player1 = new Player("");  // Create a player
        GameScene gameScene = new GameScene(player1);  // Create the game scene with the player
        gameScene.start();  // Start the game
    

           }
}

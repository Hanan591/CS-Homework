public class Main {
    public static void main(String[] args) {
        BasketballTeam team = new BasketballTeam("My Team", "My Mascot", "My Coach");
        team.setWins(10);
        team.setLosses(5);
        team.setFieldGoals(100);
        team.setFieldGoalsAttempted(200);
        team.setFreeThrows(50);
        team.setFreeThrowsAttempted(100);

        double[] stats = team.getStats();
        System.out.printf("Win Percentage: %.2f%n", stats[0]);
        System.out.printf("Field Goal Percentage: %.2f%n", stats[1]);
        System.out.printf("Free Throw Percentage: %.2f%n", stats[2]);
    }
}
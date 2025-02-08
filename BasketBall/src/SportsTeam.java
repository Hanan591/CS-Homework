// SportsTeam.java

/**
 * Abstract class representing a sports team.
 */
public abstract class SportsTeam {

    protected String teamName;
    protected String teamMascot;
    protected String headCoach;
    protected int wins;
    protected int losses;

    /**
     * Empty-argument constructor.
     */
    public SportsTeam() {
        this.teamName = "";
        this.teamMascot = "";
        this.headCoach = "";
        this.wins = 0;
        this.losses = 0;
    }

    /**
     * Preferred constructor.
     *
     * @param teamName    the team name
     * @param teamMascot  the team mascot
     * @param headCoach   the head coach
     */
    public SportsTeam(String teamName, String teamMascot, String headCoach) {
        this.teamName = teamName;
        this.teamMascot = teamMascot;
        this.headCoach = headCoach;
        this.wins = 0;
        this.losses = 0;
    }

    /**
     * Gets the win percentage.
     *
     * @return the win percentage
     */
    public double getWinPercentage() {
        if (wins + losses == 0) {
            return 0;
        }
        return (double) wins / (wins + losses);
    }

    /**
     * Gets the team name.
     *
     * @return the team name
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Sets the team name.
     *
     * @param teamName the team name
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * Gets the team mascot.
     *
     * @return the team mascot
     */
    public String getTeamMascot() {
        return teamMascot;
    }

    /**
     * Sets the team mascot.
     *
     * @param teamMascot the team mascot
     */
    public void setTeamMascot(String teamMascot) {
        this.teamMascot = teamMascot;
    }

    /**
     * Gets the head coach.
     *
     * @return the head coach
     */
    public String getHeadCoach() {
        return headCoach;
    }

    /**
     * Sets the head coach.
     *
     * @param headCoach the head coach
     */
    public void setHeadCoach(String headCoach) {
        this.headCoach = headCoach;
    }

    /**
     * Gets the number of wins.
     *
     * @return the number of wins
     */
    public int getWins() {
        return wins;
    }

    /**
     * Sets the number of wins.
     *
     * @param wins the number of wins
     */
    public void setWins(int wins) {
        this.wins = Math.max(wins, 0);
    }

    /**
     * Gets the number of losses.
     *
     * @return the number of losses
     */
    public int getLosses() {
        return losses;
    }

    /**
     * Sets the number of losses.
     *
     * @param losses the number of losses
     */
    public void setLosses(int losses) {
        this.losses = Math.max(losses, 0);
    }

    /**
     * Gets the team statistics.
     *
     * @return the team statistics
     */
    public abstract double[] getStats();
}
public class BasketballTeam extends SportsTeam {

    protected int fieldGoals;
    protected int fieldGoalsAttempted;
    protected int freeThrows;
    protected int freeThrowsAttempted;

    /**
     * Empty-argument constructor.
     */
    public BasketballTeam() {
        super();
        this.fieldGoals = 0;
        this.fieldGoalsAttempted = 0;
        this.freeThrows = 0;
        this.freeThrowsAttempted = 0;
    }

    /**
     * Preferred constructor.
     *
     * @param teamName    the team name
     * @param teamMascot  the team mascot
     * @param headCoach   the head coach
     */
    public BasketballTeam(String teamName, String teamMascot, String headCoach) {
        super(teamName, teamMascot, headCoach);
        this.fieldGoals = 0;
        this.fieldGoalsAttempted = 0;
        this.freeThrows = 0;
        this.freeThrowsAttempted = 0;
    }

    /**
     * Gets the field goals.
     *
     * @return the field goals
     */
    public int getFieldGoals() {
        return fieldGoals;
    }

    /**
     * Sets the field goals.
     *
     * @param fieldGoals the field goals
     */
    public void setFieldGoals(int fieldGoals) {
        this.fieldGoals = Math.max(fieldGoals, 0);
    }

    /**
     * Gets the field goals attempted.
     *
     * @return the field goals attempted
     */
    public int getFieldGoalsAttempted() {
        return fieldGoalsAttempted;
    }

    /**
     * Sets the field goals attempted.
     *
     * @param fieldGoalsAttempted the field goals attempted
     */
    public void setFieldGoalsAttempted(int fieldGoalsAttempted) {
        this.fieldGoalsAttempted = Math.max(fieldGoalsAttempted, 0);
    }

    /**
     * Gets the free throws.
     *
     * @return the free throws
     */
    public int getFreeThrows() {
        return freeThrows;
    }

    /**
     * Sets the free throws.
     *
     * @param freeThrows the free throws
     */
    public void setFreeThrows(int freeThrows) {
        this.freeThrows = Math.max(freeThrows, 0);
    }

    /**
     * Gets the free throws attempted.
     *
     * @return the free throws attempted
     */
    public int getFreeThrowsAttempted() {
        return freeThrowsAttempted;
    }

    /**
     * Sets the free throws attempted.
     *
     * @param freeThrowsAttempted the free throws attempted
     */
    public void setFreeThrowsAttempted(int freeThrowsAttempted) {
        this.freeThrowsAttempted = Math.max(freeThrowsAttempted, 0);
    }

    /**
     * Gets the field goal percentage.
     *
     * @return the field goal percentage
     */
    public double getFieldGoalPercentage() {
        if (fieldGoalsAttempted == 0) {
            return 0;
        }
        return (double) fieldGoals / fieldGoalsAttempted;
    }

    /**
     * Gets the free throw percentage.
     *
     * @return the free throw percentage
     */
    public double getFreeThrowPercentage() {
        if (freeThrowsAttempted == 0) {
            return 0;
        }
        return (double) freeThrows / freeThrowsAttempted;
    }

    /**
     * Sets the team statistics.
     *
     * @param wins             the number of wins
     * @param losses          the number of losses
     * @param fieldGoals      the number of field goals
     * @param fieldGoalsAttempted the number of field goals attempted
     * @param freeThrows      the number of free throws
     * @param freeThrowsAttempted the number of free throws attempted
     */
    public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted) {
        setWins(wins);
        setLosses(losses);
        setFieldGoals(fieldGoals);
        setFieldGoalsAttempted(fieldGoalsAttempted);
        setFreeThrows(freeThrows);
        setFreeThrowsAttempted(freeThrowsAttempted);
    }

    @Override
    public double[] getStats() {
        double winPercentage = getWinPercentage();
        double fieldGoalPercentage = getFieldGoalPercentage();
        double freeThrowPercentage = getFreeThrowPercentage();
        return new double[]{winPercentage, fieldGoalPercentage, freeThrowPercentage};
    }
}
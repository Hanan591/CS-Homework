public class Business extends Building {
    protected int numRentableUnits;

   
    public Business() {
        super();
        this.numRentableUnits = 0;
    }

    
    public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits) {
        super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
        this.numRentableUnits = numRentableUnits;
    }

    
    public int getNumRentableUnits() {
        return numRentableUnits;
    }

    public void setNumRentableUnits(int numRentableUnits) {
        this.numRentableUnits = numRentableUnits;
    }

    
    public void draw() {
        System.out.println("Draw stub Business");
    }

    
    public String displayData() {
        return super.displayData() + "\n" +
               "Number of Rentable Units: " + numRentableUnits;
    }

    @Override
    public String toString() {
        return "Business [numRentableUnits=" + numRentableUnits + ", projectName=" + getProjectName() + ", completeAddress=" + getCompleteAddress() + ", totalSquareFeet=" + getTotalSquareFeet() + ", occupancyGroup=" + getOccupancyGroup() + ", subgroup=" + getSubgroup() + "]";
    }
}
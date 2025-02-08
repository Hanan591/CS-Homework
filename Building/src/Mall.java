public class Mall extends Business {
    private int numRentedUnits;
    private double medianUnitSize;
    private int numParkingSpaces;

    
    public Mall() {
        super();
        this.numRentedUnits = 0;
        this.medianUnitSize = 0.0;
        this.numParkingSpaces = 0;
    }

   
    public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits, int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
        super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentableUnits);
        this.numRentedUnits = numRentedUnits;
        this.medianUnitSize = medianUnitSize;
        this.numParkingSpaces = numParkingSpaces;
    }

    
    public int getNumRentedUnits() {
        return numRentedUnits;
    }

    public void setNumRentedUnits(int numRentedUnits) {
        this.numRentedUnits = numRentedUnits;
    }

    public double getMedianUnitSize() {
        return medianUnitSize;
    }

    public void setMedianUnitSize(double medianUnitSize) {
        this.medianUnitSize = medianUnitSize;
    }

    public int getNumParkingSpaces() {
        return numParkingSpaces;
    }

    public void setNumParkingSpaces(int numParkingSpaces) {
        this.numParkingSpaces = numParkingSpaces;
    }

    
    public void draw() {
        System.out.println("Drawing code for Mall");
    }

    public String displayData() {
        return super.displayData() + "\n" +
               "Number of Rented Units: " + numRentedUnits + "\n" +
               "Median Unit Size: " + medianUnitSize + "\n" +
               "Number of Parking Spaces: " + numParkingSpaces;
    }

    @Override
    public String toString() {
        return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces=" + numParkingSpaces + ", numRentableUnits=" + numRentableUnits + ", projectName=" + getProjectName() + ", completeAddress=" + getCompleteAddress() + ", totalSquareFeet=" + getTotalSquareFeet() + ", occupancyGroup=" + getOccupancyGroup() + ", subgroup=" + getSubgroup() + "]";
    }
}

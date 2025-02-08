public class Apartment extends Residential {
    private int numRentableUnits;
    private double avgUnitSize;
    private boolean parkingAvailable;

  
    public Apartment() {
        super();
        this.numRentableUnits = 0;
        this.avgUnitSize = 0.0;
        this.parkingAvailable = false;
    }

    
    public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits, double avgUnitSize, boolean parkingAvailable) {
        super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
        this.numRentableUnits = numRentableUnits;
        this.avgUnitSize = avgUnitSize;
        this.parkingAvailable = parkingAvailable;
    }

    
    public int getNumRentableUnits() {
        return numRentableUnits;
    }

    public void setNumRentableUnits(int numRentableUnits) {
        this.numRentableUnits = numRentableUnits;
    }

    public double getAvgUnitSize() {
        return avgUnitSize;
    }

    public void setAvgUnitSize(double avgUnitSize) {
        this.avgUnitSize = avgUnitSize;
    }

    public boolean isParkingAvailable() {
        return parkingAvailable;
    }

    public void setParkingAvailable(boolean parkingAvailable) {
        this.parkingAvailable = parkingAvailable;
    }

    
    public void draw() {
        System.out.println("Drawing code for Apartment");
    }

    
    public String displayData() {
        return super.displayData() + "\n" +
               "Number of Rentable Units: " + numRentableUnits + "\n" +
               "Average Unit Size: " + avgUnitSize + "\n" +
               "Parking Available: " + parkingAvailable;
    }

    @Override
    public String toString() {
        return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize + ", parkingAvailable=" + parkingAvailable + ", numBedrooms=" + getNumBedrooms() + ", numBathrooms=" + getNumBathrooms() + ", laundryRoom=" + isLaundryRoom() + ", projectName=" + getProjectName() + ", completeAddress=" + getCompleteAddress() + ", totalSquareFeet=" + getTotalSquareFeet() + ", occupancyGroup=" + getOccupancyGroup() + ", subgroup=" + getSubgroup() + "]";
    }
}
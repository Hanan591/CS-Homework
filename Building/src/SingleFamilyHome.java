public class SingleFamilyHome extends Residential {
    private boolean garage;

   
    public SingleFamilyHome() {
        super();
        this.garage = false;
    }

    
    public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
        super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
        this.garage = garage;
    }

    
    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    
    public void draw() {
        System.out.println("Drawing code for Single Family Home");
    }

    
    public String displayData() {
        return super.displayData() + "\n" +
               "Garage: " + garage;
    }

    @Override
    public String toString() {
        return "SingleFamilyHome [garage=" + garage + ", numBedrooms=" + getNumBedrooms() + ", numBathrooms=" + getNumBathrooms() + ", laundryRoom=" + isLaundryRoom() + ", projectName=" + getProjectName() + ", completeAddress=" + getCompleteAddress() + ", totalSquareFeet=" + getTotalSquareFeet() + ", occupancyGroup=" + getOccupancyGroup() + ", subgroup=" + getSubgroup() + "]";
    }
}
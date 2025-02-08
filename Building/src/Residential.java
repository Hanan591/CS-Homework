public class Residential extends Building {
    private int numBedrooms;
    private int numBathrooms;
    private boolean laundryRoom;

    
    public Residential() {
        super();
        this.numBedrooms = 0;
        this.numBathrooms = 0;
        this.laundryRoom = false;
    }

    
    public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom) {
        super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
        this.numBedrooms = numBedrooms;
        this.numBathrooms = numBathrooms;
        this.laundryRoom = laundryRoom;
    }

 
    public int getNumBedrooms() {
        return numBedrooms;
    }

    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }

    public int getNumBathrooms() {
        return numBathrooms;
    }

    public void setNumBathrooms(int numBathrooms) {
        this.numBathrooms = numBathrooms;
    }

    public boolean isLaundryRoom() {
        return laundryRoom;
    }

    public void setLaundryRoom(boolean laundryRoom) {
        this.laundryRoom = laundryRoom;
    }

   
    public void draw() {
        System.out.println("Drawing code for Residential");
    }

    
    public String displayData() {
        return super.displayData() + "\n" +
               "Number of Bedrooms: " + numBedrooms + "\n" +
               "Number of Bathrooms: " + numBathrooms + "\n" +
               "Laundry Room: " + laundryRoom;
    }

    @Override
    public String toString() {
        return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom=" + laundryRoom + ", projectName=" + getProjectName() + ", completeAddress=" + getCompleteAddress() + ", totalSquareFeet=" + getTotalSquareFeet() + ", occupancyGroup=" + getOccupancyGroup() + ", subgroup=" + getSubgroup() + "]";
    }
}
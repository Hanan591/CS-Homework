public class Building {
    private String projectName;
    private String completeAddress;
    private double totalSquareFeet;
    private String occupancyGroup;
    private String subgroup;

    public Building() {
        this.projectName = "";
        this.completeAddress = "";
        this.totalSquareFeet = 0.0;
        this.occupancyGroup = "";
        this.subgroup = "";
    }

    
    public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
        this.projectName = projectName;
        this.completeAddress = completeAddress;
        this.totalSquareFeet = totalSquareFeet;
        this.occupancyGroup = occupancyGroup;
        this.subgroup = subgroup;
    }

    
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getCompleteAddress() {
        return completeAddress;
    }

    public void setCompleteAddress(String completeAddress) {
        this.completeAddress = completeAddress;
    }

    public double getTotalSquareFeet() {
        return totalSquareFeet;
    }

    public void setTotalSquareFeet(double totalSquareFeet) {
        this.totalSquareFeet = totalSquareFeet;
    }

    public String getOccupancyGroup() {
        return occupancyGroup;
    }

    public void setOccupancyGroup(String occupancyGroup) {
        this.occupancyGroup = occupancyGroup;
    }

    public String getSubgroup() {
        return subgroup;
    }

    public void setSubgroup(String subgroup) {
        this.subgroup = subgroup;
    }

    // draw method
    public void draw() {
        System.out.println("Draw stub Building");
    }

    // displayData method
    public String displayData() {
        StringBuilder sb = new StringBuilder();
        sb.append("----------------------------\n");
        sb.append("Building\n");
        sb.append("----------------------------\n");
        sb.append("Project Name: ").append(projectName).append("\n");
        sb.append("Address: ").append(completeAddress).append("\n");
        sb.append("Square Feet: ").append(totalSquareFeet).append("\n");
        sb.append("Occupancy Group: ").append(occupancyGroup).append("\n");
        sb.append("Occupancy Subgroup: ").append(subgroup).append("\n");
        return sb.toString();
     }


	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}
    	
    
}

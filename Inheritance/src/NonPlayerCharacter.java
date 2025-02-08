import java.util.random.*;
public class NonPlayerCharacter extends GameCharacter {
    private boolean active;
    private String intelligenceType;

   
    public NonPlayerCharacter() {
        super();
        setActive(false);
        setIntelligenceType("AVERAGE");
    }

   
    public NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType) {
        super(id, personality);
        setActive(active);
        setIntelligenceType(intelligenceType);
    }

   
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getIntelligenceType() {
        return intelligenceType;
    }

    public void setIntelligenceType(String intelligenceType) {
        this.intelligenceType = intelligenceType;
    }

    
    @Override
    public String reportStructure() {
        StringBuilder report = new StringBuilder(super.reportStructure());
        report.append("Active: ").append(isActive()).append("\n");
        report.append("Intelligence: ").append(getIntelligenceType()).append("\n");
        report.append("==================================");
        return report.toString();
    }

    
    public String introduce() {
        return "Hello, my name is " + getUniqueID();
    }

    
    public String exclaim() {
        String[] exclamations = {"Dag Gummit", "Doggone it", "Holy cow", "Jeez", "Well cheese and crackers"};
        int randomIndex = (int) (Math.random() * exclamations.length);
        return exclamations[randomIndex];
    }
}
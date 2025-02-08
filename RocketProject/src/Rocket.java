
public class Rocket {
    private Engine engine;
    private FuelTank fuelTank;
    private String captain;
   private String navigator;
    private String engineer;

    public Rocket(int fuelWeight, int fuelUsePSec, String captain, String navigator, String engineer) {
        this.engine = new Engine(fuelUsePSec);
        this.fuelTank = new FuelTank(fuelWeight);
        this.captain = captain;
        this.navigator = navigator;
        this.engineer = engineer;
    }

    public int launch() {
        if (fuelTank.getFuelWeight() < engine.getFuelUsePSec()) {
            return -1; // Not enough fuel to launch
        }

        engine.startEngine();
        int fuelUsed = engine.getFuelUsePSec() * 10; // Assuming 10 seconds of flight
        fuelTank.useFuel(fuelUsed);
        return 1000; // Assuming MICO in 1000 seconds
    }

   
    public String toString() {
       return "Crew\n\""+ captain + "\", Captain\n\"" + navigator + "\", Navigator\n\"" + engineer + "\", Engineer\nRocket Status\n" + engine + "\n" + fuelTank;
    }
}
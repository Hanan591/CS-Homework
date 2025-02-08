class Engine {
    private boolean engineRunning;
   private int fuelUsePSec;
   
   public Engine(int fuelUsePSec) {
       this.engineRunning = false;
       this.fuelUsePSec = fuelUsePSec;
   }

    public void startEngine() {
        this.engineRunning = true;
    }

    public void stopEngine() {
        this.engineRunning = false;
    }

   public int getFuelUsePSec() {
        return fuelUsePSec;
    }

    public boolean getEngineRunning() {
        return engineRunning;
    }

    
    public String toString() {
        return "Engine: engineRunning=" + engineRunning + ", fuelUsePSec=" + fuelUsePSec;
    }
}
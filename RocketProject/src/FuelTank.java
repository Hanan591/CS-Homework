class FuelTank {
   private int fuelWeight;

   public FuelTank(int fuelWeight) {
       this.fuelWeight = fuelWeight;
   }

    public int getFuelWeight() {
        return fuelWeight;
    }

    public void useFuel(int fuel) {
        this.fuelWeight -= fuel;
    }

   
    public String toString() {
        return "FuelTank: fuelWeight=" + fuelWeight;
    }
}
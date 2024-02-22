public class Engine {
    //setting attributes
    FuelType fuelType;
    private double currentFuel;
    private double maxFuel;
    //setting Engine
    public Engine(FuelType fuel, double currentFuel){
        this.currentFuel = currentFuel;
    }
    //refueling method
    public void refuel() {
        currentFuel = maxFuel;
    }
    //go method
    public boolean go() {
        if (currentFuel > 0) {
            currentFuel = currentFuel - 1;
            System.out.println("Remaining fuel level is: " + currentFuel);
            return true;
        } else {
            return false;
        }

    }

    }
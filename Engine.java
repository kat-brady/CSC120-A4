/*
 * Engine class contains info about train engine
 * FuelType fuelType stores type of fuel
 * double currentFuel stores the amount of fuel currently possessed by the train
 * double maxFuel stores the max amount of fuel possessed by the train
 */
public class Engine {
    private FuelType fuelType;
    private double currentFuel;
    private double maxFuel;
    
    /*
     * Initializes Enginge
     * @param FuelType fuelType stores type of fuel
     * @param double currentFuel stores current amount of fuel in engine
     * @param double maxFuel stores maximum amount of fuel in engine
     */
    public Engine(FuelType fuelType, double currentFuel, double maxFuel){
        this.fuelType = fuelType;
        this.currentFuel = currentFuel;
        this.maxFuel = maxFuel;
    }
    /*
     * refuel method sets the current fuel level to the maximum fuel level
     */
    public void refuel() {
        currentFuel = maxFuel;
    }
    
    /*
     * go method subtracts 1 from fuel level and returns true if currentFuel >0
     * if currentFuel <= 0, return false
     */
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
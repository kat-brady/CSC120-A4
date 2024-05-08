/*
 * Passenger class stores relevant information about the passengers
 */
public class Passenger {
    
    public String name;
    
    /*
     * Initializes Passenger
     * @param String name: the name of a passenger
     */
    public Passenger(String name) {
        this.name = name;
    }
    
    /*
     * Method to boardCar
     * @param Car c: the specific car to be boarded
     * Returns false if Car c is full
     * Else returns true and adds passenger to c
     */
    public boolean boardCar(Car c) {
        if (c.maxCapacity-c.passengerList.size() == 0){
            System.out.println("The car is full.");
            return false;
        } else{
            c.addPassenger(this);
            return true;
        }
    }

    /*
     * Method to getOffCar
     * @param Car c: the car to be departed from
     * Returns true if passenger is contained in c.passengerList and removes passenger from c
     * Else returns false
     */
    public boolean getOffCar(Car c) {
        if (c.passengerList.contains(this)){
            c.removePassenger(this);
            return true;
        } else{
            System.out.println("This passenger is not on this car.");
            return false;
        }
    }
}

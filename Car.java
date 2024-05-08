import java.util.*;

/*
 * Car class stores information about the individual cars
 * Contains int for maxCapacity and ArrayList for passengerList
 */
public class Car {
    private int maxCapacity;
    private ArrayList<Passenger> passengerList;

    /*
     * Initializes Car
     * @param int maxCapacity stores maximum number of passengers for the car
     */
    public Car(int maxCapacity){
        this.maxCapacity= maxCapacity;
        this.passengerList = new ArrayList<Passenger>(maxCapacity);
    }

    /*
     * Method to return the maximum capacity of the car
     */
    public int getCapacity(){
        return maxCapacity;
    }
    
    /*
     * Method to return the number of seats remaining in the car
     * Subtracts the number of passengers from maxCapacity to return number of seats remaining
     */
    public int seatsRemaining(){
        return this.maxCapacity-this.passengerList.size();
    }

    /*
     * Method to addPassenger
     * @param Passenger p: the passenger to be added to the list
     * Returns false if p is already in passengerList or car is at maxCapacity
     * Returns true otherwise and adds p to passengerList
     */
    public boolean addPassenger(Passenger p){
        if (passengerList.contains(p)) {
            System.out.println("Oops! Passenger "+ p.name + " is already on board.");
            return false;}
        else if (this.maxCapacity-this.passengerList.size() == 0){
            System.out.println("Oops! There is no space left on this car!");
            return false;} 
        else{
            this.passengerList.add(p);
            System.out.println("Passenger "+ p.name + " is now boarding.");
            return true;
        }
    }

    /*
     * Method to removePassenger
     * @param Passenger p : the passenger to be removed
     * Returns true if p is already in passengerList and removes p from passengerList
     * Returns false otherwise
     */
    public boolean removePassenger (Passenger p){
        if (passengerList.contains(p)) {
            System.out.println("Passenger "+ p.name +" is departing the train.");
            this.passengerList.remove(p);
            return true;
        } else{ 
            System.out.println("Oops! There is no passenger "+ p.name + " on the train.");
            return false;
        }
    }

    /*
     * Method to printManifest
     * Prints names of passengers in passengerList
     */
    public void printManifest(){
        if (passengerList.size() == 0){
            System.out.println("This car is empty!");
        }
        else{
            System.out.println("\nCURRENT PASSENGERS:\n");
            for (Passenger p: passengerList){
            System.out.println(p.name);}

        }
    }
}
import java.util.*;

public class Car {
    //setting attributes
    public int maxCapacity;
    public ArrayList<Passenger> passengerList;

    //Car constructor
    public Car(int maxCapacity){
        this.maxCapacity= maxCapacity;
        this.passengerList = new ArrayList<Passenger>(maxCapacity);

}   //method to return capacity
    public int getCapacity(){
        return maxCapacity;
    }//method to check for number of remaining seats
    public int seatsRemaining(){
        return this.maxCapacity-this.passengerList.size();
    }
    //method to add passengers
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
    //method to remove passengers
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
    //method to print list of passengers
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
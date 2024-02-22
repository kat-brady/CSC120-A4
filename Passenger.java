public class Passenger {
    
    public String name;
    //constructor
    public Passenger(String name) {
        this.name = name;
    }
    // method to board cars
    public boolean boardCar(Car c) {
        if (c.maxCapacity-c.passengerList.size() == 0){
            System.out.println("The car is full.");
            return false;
        } else{
            c.addPassenger(this);
            return true;
        }
    }
    //method to depart cars
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

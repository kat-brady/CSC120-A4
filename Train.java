import java.util.*;

/*
 * Train class contains attributes for Train
 * Contains arrayList carList, Engine engine, Car car
 */
public class Train {
    private ArrayList<Car> carList;
    private final Engine;


    /*
     * Initializes Train
     * @param FuelType fuelType : stores type of fuel, contained within Engine
     * @param double maxCapacity: stores maximum fuel capacity, contained within Engine
     * @param int car: stores number of car
     * @param int passengerCapacity: stores maximum number of passengers in a car, contained within car
     */
    public Train(FuelType fuelType, double maxCapacity, int car, int passengerCapacity) {
        this.engine= new Engine(fuelType, maxCapacity);
        this.car= new Car(passengerCapacity);
        this.carList = new ArrayList<Car>(car);
        }

    /*
     * Method to return the engine
     */
    public Engine getEngine(){
        return engine;
    }

    /*
     * Method to return car number i from carList
     * @param int i: the number of the car that is to be returned
     */
    public Car getCar(int i){
        return carList.get(i);
    }

    /*
     * Method to getMaxCapacity
     * returns max capacity of all cars combined
     */
    public int getMaxCapacity(){
        int max = 0;
        for(Car car: this.carList) {
            max+= car.getCapacity();
        } return max;
    }

    /*
     * Method to get seatsRemaining
     * returns the max capacity of all cars minus the number of passengers in the cars
     */
    public int seatsRemaining() {
        int max = 0;
        for (Car car: this.carList) {
            max+= car.getCapacity();
        }
        return max-car.passengerList.size();
    }

    /*
     * Method to printManifest
     * prints all passengers for all cars
     */
    public void printManifest() {
        for (Car car: this.carList){
            for (Passenger p: car.passengerList){
                System.out.println(p.name);}
        }

        }
        public static void main(String[] args) {
            Train myTrain = new Train(FuelType.ELECTRIC, 30, 5, 3);
            Engine myEngine = new Engine(FuelType.ELECTRIC, 20.0);
            while (myEngine.go()) {
                System.out.println("Choo choo!");
            }
            System.out.println("Out of fuel.");
            Car myCar= new Car(6);
            Car yourCar= new Car(6);
            Passenger Kat= new Passenger("Kat");
            Passenger Kara= new Passenger("Kara");
            myCar.addPassenger(Kat);
            Kara.boardCar(yourCar);
            myCar.removePassenger(Kat);
            myCar.printManifest();
            yourCar.removePassenger(Kara);
            myTrain.printManifest();

    }
}



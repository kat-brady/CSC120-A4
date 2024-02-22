import java.util.*;
//establishing train
public class Train {
    public ArrayList<Car> carList;
    public Engine engine;
    public Car car;
    public Train(FuelType fuelType, double maxCapacity, int car, int passengerCapacity) {
        this.engine= new Engine(fuelType, maxCapacity);
        this.car= new Car(passengerCapacity);
        this.carList = new ArrayList<Car>(car);
        }
    //method to get the engine
    public Engine getEngine(){
        return engine;
    }
    //method to get the car
    public Car getCar(int i){
        return carList.get(i);
    }
    //method to get the maxcapacity
    public int getMaxCapacity(){
        int max = 0;
        for(Car car: this.carList) {
            max+= car.getCapacity();
        } return max;
    }
    //method to see how many seats remain
    public int seatsRemaining() {
        int max = 0;
        for (Car car: this.carList) {
            max+= car.getCapacity();
        }
        return max-car.passengerList.size();
    }
    //method for total car passenger lists
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



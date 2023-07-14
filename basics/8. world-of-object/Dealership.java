public class Dealership {
    private Car[] cars;

    public Dealership(Car[] cars) {
        this.cars = new Car[cars.length]; // holds 3 cars
        for (int i = 0;i< cars.length; i++){
            this.cars[i] = new Car(cars[i]);
        }
    }

    public Car getCar(int index){
        return new Car(this.cars[index]); // return copy of car object
    }

    public void setDealership(Car car, int index){
        this.cars[index] = new Car(car);
    }

    public void sellCar(int index){
        this.cars[index] = null;
    }

    public String toString(){
        String temp = "";
        for (int i = 0; i < this.cars.length; i++){
            temp +=  "Parking Spot: "  + i + "\n";
            if (this.cars[i] == null){
                temp += "Empty\n";
            }else{
                temp += this.cars[i].toString() + "\n";
            }
        }
        return temp;
    }
}

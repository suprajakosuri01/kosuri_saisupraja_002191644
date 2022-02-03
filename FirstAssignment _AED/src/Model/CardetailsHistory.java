package Model;

import java.util.ArrayList;

public class CardetailsHistory {

    private ArrayList<Car> history;

    public CardetailsHistory() {
        this.history = new ArrayList<Car>();
    }

    public ArrayList<Car> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Car> history) {
        this.history = history;
    }

    public Car addNewCarDetails() {
        Car newCarDetails = new Car();
        history.add(newCarDetails);
        return newCarDetails;
    }
    public void deleteCar(Car C){
        history.remove(C);
    }
}

/**
    * car information
    * @author Yuyen
    */

class Car {

    String make;
    String model;
    int year;
    double price;

    /**
     * a set of information of the car
     * @param make the company of the car
     * @param model the model of the car
     * @param year the year of the car made
     * @param price the price of the car sold
     */

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return this.make;
    }
    public String getModel() {
        return this.model;
    }
    public int getYear() {
        return this.year;
    }
    public double getPrice() {
        return this.price;
    }

    public void setMake(String newMake) {
        this.make = newMake;
    }
    public void setModel(String newModel) {
        this.model = newModel;
    }
    public void setYear(int newYear) {
        this.year = newYear;
    }
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
}
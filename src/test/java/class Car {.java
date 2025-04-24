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

    /**
     * @return the company of the car
     */
    public String getMake() {
        return this.make;
    }

    /**
     * @return the model of the car
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return the year of the car
     */
    public int getYear() {
        return this.year;
    }

    /**
     * @return the price of the car
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * 
     * @param newMake the new company that will replace the original company
     */
    public void setMake(String newMake) {
        this.make = newMake;
    }

    /**
     * 
     * @param newModel the new model that will replace the original model
     */
    public void setModel(String newModel) {
        this.model = newModel;
    }

    /**
     * 
     * @param newYear the new year that will replace the original year
     */
    public void setYear(int newYear) {
        this.year = newYear;
    }

    /**
     * 
     * @param newPrice the new price that will replace the original price
     */
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
}
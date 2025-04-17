/**
    * dog information
    * @author Yuyen
    */
    
    
    class Dog {

    String name;
    String breed;
    int weight;

    /**
     * a set of information of a dog
     * @param name the name of the dog
     * @param breed the breed of the dog 
     * @param weight the weight of the dog
     */

    public Dog(String name, String breed, int weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }
    public String getBreed() {
        return this.breed;
    }
    public int getWeight() {
        return this.weight;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public void setBreed(String newBreed) {
        this.breed = newBreed;
    }
    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
}
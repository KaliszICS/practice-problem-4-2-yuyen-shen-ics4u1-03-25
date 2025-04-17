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

    /**
     * 
     * @return the name of the dog
     */
    public String getName() {
        return this.name;
    }

    /**
     * 
     * @return the breed of the dog
     */
    public String getBreed() {
        return this.breed;
    }

    /**
     * 
     * @return the weight of the dog
     */
    public int getWeight() {
        return this.weight;
    }

    /**
     * 
     * @param newName the new name of the dog that will replace its original name
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     * 
     * @param newBreed the new breed of the dog that will replace the original breed
     */
    public void setBreed(String newBreed) {
        this.breed = newBreed;
    }

    /**
     * 
     * @param newWeight the new weight of the dog that will replace the original weight
     */
    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
}
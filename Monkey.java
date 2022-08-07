public class Monkey extends RescueAnimal {

    //instance  variables
    private String species;
    private String tailLength;
    private String height;
    private String bodyLength;

    //constructor
    public Monkey(String name, String species, String gender,
     String age, String weight, String tailLength, String height,
                  String bodyLength, String acquisitionDate,
                  String acquisitionCountry, String trainingStatus,
                  boolean reserved, String inServiceCountry) {
        setName(name);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionCountry(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
    }


    //accessor method
    public String getSpecies() {
        return species;
    }

    //mutator method
    public void setSpecies(String species) {
        this.species = species;
    }

    //accessor method
    public String getTailLength() {
        return tailLength;
    }

    //mutator method
    public void setTailLength(String tailLength) {
        this.tailLength = tailLength;
    }

    //accessor method
    public String getHeight() {
        return height;
    }

    //mutator method
    public void setHeight(String height) {
        this.height = height;
    }

    //accessor method
    public String getBodyLength() {
        return bodyLength;
    }

    //mutator method
    public void setBodyLength(String bodyLength) {
        this.bodyLength = this.bodyLength;
    }

    @Override
    public String toString() {
        return ("Monkey: " + getName() + ","  + getTrainingStatus() + "," + getInServiceLocation());
    }

}

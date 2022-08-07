

import java.lang.String;

public class RescueAnimal {

    // Instance variables
    private String name;
    private String animalType;
    private String gender;
    private String age;
    private String weight;
    private String acquisitionDate;
    private String acquisitionCountry;
	private String trainingStatus;
    private boolean reserved;
	private String inServiceCountry;

	private String tailLength;

	private String height;

	private String bodyLength;


    // Constructor
    public RescueAnimal() {
    }


	public String getName() {
		return name;
	}

	//getter/setter methods
	public void setName(String name) {
		this.name = name;
	}
	public String getAnimalType() {
		return animalType;
	}
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getAcquisitionDate() {
		return acquisitionDate;
	}
	public void setAcquisitionDate(String acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}
	public String getAcquisitionCountry() {
		return acquisitionCountry;
	}
	public void setAcquisitionCountry(String acquisitionCountry) {
		this.acquisitionCountry = acquisitionCountry;
	}
	public boolean getReserved() {
		return reserved;
	}
	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}
	public String getInServiceLocation() {
		return inServiceCountry;
	}
	public void setInServiceCountry(String inServiceCountry) {
		this.inServiceCountry = inServiceCountry;
	}
	public String getTrainingStatus() {
		return trainingStatus;
	}
	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}
	public String getTailLength() {
		return tailLength;
	}
	public void setTailLength(String tailLength) {
		this.tailLength = tailLength;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getBodyLength() {
		return bodyLength;
	}
	public void setBodyLength(String bodyLength) {
		this.bodyLength = bodyLength;
	}
}

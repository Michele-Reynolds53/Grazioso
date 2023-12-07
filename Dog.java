
public class Dog extends RescueAnimal {

    // Instance variable
    private String breed;	

    // Constructor
    public Dog(String name, String breed, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
    	
    	// Attributes
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

    }
		
	// Override the toString method to provide a custom string representation
    @Override
    public String toString() { 
		return "[" + getName() + ","  + getBreed() +"," + getGender() + "," + getAge() + "," + getWeight() + "," + getAcquisitionDate() + "," + getAcquisitionLocation() + "," + getTrainingStatus() + "," + getReserved() + "," + getInServiceCountry() + "]";	
	}

    // Accessor method for breed
	public String getBreed() {
		return breed;
	}

	// Mutator method for breed
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	

	
    
    
  
  
   
}

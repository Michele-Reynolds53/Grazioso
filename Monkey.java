import java.util.Arrays;
/**
 * 
 */

/**
 * @author michelereynol_snhu
 * @param <setSpecies>
 *
 */

// Monkey class inherits from RescueAimal
public class Monkey extends RescueAnimal{
	
	//Instance variable
	private String species;
	private String tailLength;
	private String height;
	private String bodyLength;
	
	
	// Constructor
    public Monkey(String name, String species, String tailLength, String height, String bodyLength, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
    	
    	// Attributes
        setName(name);
        setSpecies(species);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
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
		return "[" + getName() + "," + species + "," + tailLength + "," + height + "," + bodyLength + "," + getGender() + "," + getAge() + "," + getWeight() + "," + getAcquisitionDate() + "," + getAcquisitionLocation() + "," + getTrainingStatus() + "," + getReserved() + "," + getInServiceCountry() + "]";	
	}
   
    
    // Accessor method for species
    public String getSpecies() {
        return species;
    }
    
    //Mutator method for species
    public void setSpecies(String species) {
    	this.species = species;
    }
    
    //Accessor method for tail length
    public String getTailLength() {
        return tailLength;
    }
    
    //Mutator method for tail length
    public void setTailLength(String tailLength) {
        this.tailLength = tailLength;
    }
        
    
     //Accessor method for height
    public String getHeight() {
        return height;
    }
    
    //Mutator method for height
    public void setHeight(String height) {
        this.height = height;
    }

       
	//Accessor method for body length
    public String getBodyLength() {
         return bodyLength;   
    }
    
    //Mutator method for body length
    public void setBodyLength(String bodyLength) {
        this.bodyLength = bodyLength;
    }  
    
   	// Array list for monkey species
	public void setmonkeySpecies(String species) {
		String[] validSpecies = {"Capuchin", "Guenon", "Macaque", "Marmoset", "Squirrel Monkey", "Tamarin"};
	
		//loop for valid species entry
		if (Arrays.asList(validSpecies).contains(species)) {
			this.setmonkeySpecies(species);
		} else {
			System.out.println("Invalid entry.");
		}
	} 
	
}
        
    

   
 

  
    
	
	
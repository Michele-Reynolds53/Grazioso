import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Driver class 
public class Driver {
	
	// Create dog array list to store dogs and their attributes
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    
    //Create monkey array list to store monkeys and their attributes
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
  
    public static void main(String[] args) {

        // method call to populate dog list
       initializeDogList(); 
        
       // method call to populate monkey list 
       initializeMonkeyList();
        
        //create scanner 
        Scanner scanner = new Scanner(System.in);
        
        	
		//Pass menu options
		char menuOption = 0;
		
				
		//Menu display loop
		 do {
		       displayMenu();
             		
		       		// input validation
					if (menuOption < '1' || (menuOption > '6' && menuOption != 'q')) {
						System.out.println("Enter a number between 1 and 6 or 'q' to quit.");
			}
          	try {	
                // Handling exceptions due to invalid input
		      	System.out.println("Enter menu option.");
		      	menuOption = scanner.nextLine().charAt(0);
            
			   // Menu options
		       switch(menuOption) {
					case '1':
						intakeNewDog(scanner);
						break;
						
					case '2':
						intakeNewMonkey(scanner);
						break;
					
					case '3':
						reserveAnimal(scanner);
						break;
					
					case '4':
						printAnimals("Dog");
						break;
					
					case '5':
						printAnimals("Monkey");
						break;
					
					case '6':
						printAnimals("Available");
						break;
					
					case 'q':
					break;
                }
            }
          // Check input for expected type, throw error if wrong type
          catch (InputMismatchException e) { 
              System.out.println("Invalid entry."); 
           }
         }
		   // quit when user enters 'q'
           while (menuOption != 'q');   		 
    }
    
  
	
	// This method displays the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

   
    // Optional for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Marcel", "Capuchin", "1", "2", "3",  "male", "2","3" , "09-16-2021", "Panama", "intake", false, "United States");
        Monkey monkey2 = new Monkey("Lolo", "Guenon", "2", "3", "4", "female", "1","1" , "08-10-2022", "South Africa", "intake", false, "United States");
        Monkey monkey3 = new Monkey("Bonzo", "Macaque", "1", "1", "1", "male", "4","4" , "09-16-2019", "Asia", "in service", true, "United States");

        	// Adds monkeys to a list for testing
        	monkeyList.add(monkey1);
        	monkeyList.add(monkey2);
        	monkeyList.add(monkey3);
        	        	
    }

    //intakeNewDog method
    public static void intakeNewDog(Scanner scanner) {
      try {
    	
        //get user input for dog name
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        
        // for iterating over the doglist
        for(Dog dog: dogList) {
        	
        	// check if dog is already in the dog list and return to menu if it does
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
          //Request input for dog's breed
          System.out.println("What is the dog's breed.");
          String breed = scanner.nextLine();
           
          //Request input for dog's gender
          System.out.println("What is the dog's gender?");
          String gender = scanner.nextLine();
          
          //Request input for dog's age         
          System.out.println("What is the dog's age?");
          String age = scanner.nextLine();
          
          //Request input for dog's weight
          System.out.println("What is the dog's weight?");
          String weight = scanner.nextLine();
          
          //Request input for dog's acquisition date
          System.out.println("What is the dog's acquisition date?");
          String acquisitionDate = scanner.nextLine();
          
          //Request input for dog's acquisition country
          System.out.println("What is the dog's acquisition country?");
          String acquisitionCountry = scanner.nextLine();
          
          //Request input for dog's training status
          System.out.println("What is the dog's training status: intake, Phase I, Phase II, Phase III, Phase IV, Phase V, in service or farm?");
          String trainingStatus = scanner.nextLine();
          
          //Request input for dog's reservation status
          System.out.println("Is there a reservation?");
          boolean reserved = Boolean.parseBoolean(scanner.nextLine());
          
          //Request input for dog's service country
          System.out.println("What country is the dog in service?");
          String inServiceCountry = scanner.nextLine();
     	 
      
   // Add the code to instantiate a new dog and add it to the appropriate list
      Dog dog4 = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
               
      // add dog to list and print
      dogList.add(dog4);      	
			System.out.println("Your entry has been added to the dog list.");
		}
   	 
      
      // catch input type error
      catch (InputMismatchException e) {
              System.out.println("Invalid entry."); 
      }
    }        
                  
    	
    //intakeNewMonkey method
    public static void intakeNewMonkey(Scanner scanner) {
      try {
    	
    	// get user input for monkey name
        System.out.println("What is the monkeys's name?");
        String name = scanner.nextLine();
        
        // for iterating over monkeylist
        for(Monkey monkey: monkeyList) {
        	
        	// if monkey exists in monkey list and return to menu if it does
            if(monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return; //returns to menu
           }
        }
        
        //Request input for monkeys's species
        System.out.println("What is the species of monkey?\"Capuchin\", \"Guenon\", \"Macaque\", \"Marmoset\", \"Squirrel Monkey\", \"Tamarin\"");
        String species = scanner.nextLine();
        
        //Request input for monkey's tail length
        System.out.println("What is the tail length of monkey?");
        String tailLength = scanner.nextLine();
        
        //Request input for monkey's height
        System.out.println("What is the monkey's height?");
        String height = scanner.nextLine();
        
        //Request input for monkey's body length
        System.out.println("What is the monkey's body length?");
        String bodyLength = scanner.nextLine();
        
        //Request input for monkeys's gender
        System.out.println("What is the monkey's gender?");
        String gender = scanner.nextLine();
        
        //Request input for monkey's age         
        System.out.println("What is the monkey's age?");
        String age = scanner.nextLine();
        
        //Request input for monkey's weight
        System.out.println("What is the monkey's weight?");
        String weight = scanner.nextLine();
        
        //Request input for monkey's acquisition date
        System.out.println("What is the monkey's acquisition date?");
        String acquisitionDate = scanner.nextLine();
        
        //Request input for monkey's acquisition country
        System.out.println("What is the monkey's acquisition country?");
        String acquisitionCountry = scanner.nextLine();
        
        //Request input for monkey's training status
        System.out.println("What is the monkey's training status?");
        String trainingStatus = scanner.nextLine();
        
        //Request input for monkey's reservation status
        System.out.println("Is there a reservation?");
        boolean reserved = Boolean.parseBoolean(scanner.next());
        
        //Request input for monkey's service country
        System.out.println("What country is the monkey in service?");
        String inServiceCountry = scanner.nextLine();        
          
       
      
   // Instantiate a new monkey and add it to the appropriate list
      Monkey monkey4 = new Monkey(name, species, tailLength, height, bodyLength, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
     		
      monkeyList.add(monkey4);      	
 			System.out.println("Your entry has been added to the monkey list.");
 		}
      
      // check for input type errors
      catch (InputMismatchException e){
              System.out.println("Invalid entry.");
      		}
        }     
    	                
        
    	  // Request animal type 
       	   public static void reserveAnimal(Scanner scanner) {
            System.out.println("What is the animal type");
            String animalType = scanner.nextLine();
            
            // Request animal country
            System.out.println("What is the animal's service country?");
            String inServiceCountry = scanner.nextLine();
            
         // Request input for training status
            System.out.println("What is the animal's training status?");
            String trainingStatus = scanner.nextLine();
               
            // if animal type is dog     
            if(animalType.equalsIgnoreCase("dog")) {
            	
            	// iterate over dog list
            	for(Dog dog: dogList) {
            		
            		// check if in service location is the service country entered
            		if(dog.getInServiceLocation().equals(inServiceCountry)) {
            			
            			// check training status
   						if(dog.getTrainingStatus().equals(trainingStatus)){
   							
   							// reserve dog if not reserved
   							if (!dog.getReserved()) {
              			    dog.setReserved(true);
            		}
            	}
              }
           }
              // if animal type is monkey
            } else if(animalType.equalsIgnoreCase("monkey")) {
            	
            	// iterate over monkey list
                for(Monkey monkey: monkeyList) {
                	
                	// check if in service location is the service country entered
            		if(monkey.getInServiceLocation().equals(inServiceCountry)) {
            			
            			// check monkey training status
                    	if(monkey.getTrainingStatus().equals(trainingStatus)){
                    		
                    		// reserve monkey if not already reserved
                    		if (!monkey.getReserved()) {
            			monkey.setReserved(true);
                        }
            		}
            	}
            }
        }
      }
            // print method 
        	public static void printAnimals(String animalType) {
        		
        		// If animal type is dog, print list of all dogs
        		if (animalType.equalsIgnoreCase("dog")) {
        			System.out.println("List of all dogs");
        			for (Dog dog: dogList) {
        			System.out.println(dog.toString());
        		  }
        		}
        		
        		  // If animal type is a monkey, print list of all monkeys
            	  if (animalType.equalsIgnoreCase("monkey")) {
            			System.out.println("List of all monkeys");
            			for (Monkey monkey: monkeyList) {
            			System.out.println(monkey.toString());
            			}
            		}
            	  
            	  // If animal is available, print list of available animals
            	  if (animalType.equals("Available")) {
            		  System.out.println("List of all animals that are not reserved");
            		  
            		  // iterate over dog list
            		  for (Dog dog: dogList) {
                  		           	  
                       			// Print list of all dogs that are in service and not reserved
        						if(dog.getTrainingStatus().equalsIgnoreCase("in service")&& !dog.getReserved()) {
        						    System.out.println(dog.toString());	
        						}
            		  		}
            		  
            		  // iterate over monkey list
            		  for (Monkey monkey: monkeyList) {
            			  
            			  // Print list of all monkeys that are in service and not reserved
            			  if (monkey.getTrainingStatus().equalsIgnoreCase("in-service") && !monkey.getReserved()) {
            				  System.out.println(monkey.toString());
            			  }
            		  }
            		 
            	  }
            	}
			}

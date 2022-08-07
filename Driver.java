import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    //creates new animals
    private static final ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static final ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

//    public static RescueAnimal monkey;
    public static String name;
    public static String tailLength;
    public static String bodyLength;
    public static String height;


    public static void main(String[] args) {

        initializeDogList();
        initializeMonkeyList();

        // a Scanner that pass it to the necessary methods
        Scanner scanner = new Scanner(System.in);
        char option;

        // A do while loop for options
        do {
            displayMenu();
            option = scanner.next().charAt(0);
            //if input  is 1, intakeNewDog is called
            if (option == '1') {
                intakeNewDog(scanner);
            } else if (option == '2') {
                intakeNewMonkey(scanner);
            } else if (option == '3') {
                reserveAnimal(scanner);
            }
            //option 4 prints dog list
            else if (option == '4') {
                printAnimals("dog");
            }
            //option 5 prints monkey list
            else if (option == '5') {
                printAnimals("monkey");
            }
            //option prints non-reserved animals
            else if (option == '6') {
                printAnimals("available");
            } else if ((option == 'q') || (option == 'Q')) {
                System.out.println("You exited the program.");
                break;
            } else { //validation / feedback
                System.out.println("Invalid selection; please enter a valid option.");
            }
        } while (!(option != 'q') || !(option != 'Q'));

    }

    // This method prints the menu options
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
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6",
                "05-12-2019", "United States", "intake",
                false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2",
                "02-03-2020", "United States", "Phase I",
                false, "United States");
        Dog dog3 = new Dog("SixtyEight", "Labrador", "female", "4", "60.6",
                "12-12" + "-2019", "Canada", "in service",
                true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Bella", "female", "Marmoset", "1",
                "0.9", "13.5", "10", "23.5", "02-14-2022",
                "Zimbabwe", "intake", false, "United States");
        Monkey monkey2 = new Monkey("Annie", "female", "Macaque", "2",
                "22", "15", "25", "35", "11-05-2021",
                "United States", "Phase I", false, "United States");
        Monkey monkey3 = new Monkey("Bruce", "male", "Capuchin", "2",
                "7", "14", "14", "28", "10-07-2021",
                "Paraguay", "in service", false, "United States");

        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }

    // Add the code to create/instantiate a new dog and add it to the
    // appropriate list
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for (Dog dog : dogList) {
            if (dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        scanner.nextLine();

        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();

        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();

        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();

        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();

        System.out.println("What is the dog's acquisition date?");
        String acquisitionDate = scanner.nextLine();

        System.out.println("What is the dog's acquisition Country?");
        String acquisitionCountry = scanner.nextLine();

        System.out.println("What is the dog's training Status?");
        String trainingStatus = scanner.nextLine();

        System.out.println("Is the dog reserved <true> or <false>?");
        boolean reservedBoolean = scanner.nextBoolean();

        scanner.nextLine();

        System.out.println("What is the dog's service country?");
        String inServiceCountry = scanner.nextLine();

        Dog dog = new Dog(name, breed, gender, age, weight, acquisitionDate,
                acquisitionCountry, trainingStatus, reservedBoolean, inServiceCountry);

        dogList.add(dog);

    }

    // Add the code to create/instantiate a new monkey and add it to the
    // appropriate list
    public static void intakeNewMonkey(Scanner scanner) {
        System.out.println("\nWhat is the monkey's name?\n");
        String monkeyName = scanner.nextLine();
        for (Monkey monkey : monkeyList) {
            if (monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\nThis monkey is already in the system\n");
                return;
            }
        }

        System.out.println("What is the monkey's species?");
        String species = scanner.nextLine();
        // validation for input
        if (!(species.equalsIgnoreCase("Capuchin")) &&
                !(species.equalsIgnoreCase("Guenon")) &&
                !(species.equalsIgnoreCase("Macaque")) &&
                !(species.equalsIgnoreCase("Marmoset")) &&
                !(species.equalsIgnoreCase("Squirrel Monkey")) &&
                !(species.equalsIgnoreCase("Tamarin"))) {
            // print if monkey species not valid
            System.out.println("\nInvalid monkey species: please enter valid monkey species.\n");
        }

        System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();

        System.out.println("What is the monkey's species?");
        species = scanner.nextLine();

        System.out.println("What is the monkey's gender?");
        String gender = scanner.nextLine();

        System.out.println("What is the monkey's age?");
        String age = scanner.nextLine();

        System.out.println("What is the monkey's weight?");
        String weight = scanner.nextLine();

        System.out.println("What is the monkey's acquisition date?");
        String acquisitionDate = scanner.nextLine();

        System.out.println("What is the monkey's acquisition Country?");
        String acquisitionCountry = scanner.nextLine();

        System.out.println("What is the monkey's training Status?");
        String trainingStatus = scanner.nextLine();

        System.out.println("Is the monkey reserved <true> or <false>?");
        boolean reservedBoolean = scanner.nextBoolean();

        System.out.println("What is the monkey's service country?");
        String inServiceCountry = scanner.nextLine();

        Monkey monkey = new Monkey(name, species, gender, age, weight,
                tailLength, height, bodyLength, acquisitionDate,
                acquisitionCountry, trainingStatus, reservedBoolean, inServiceCountry);

        monkeyList.add(monkey);

    }

    // find the animal by animal type and in service country
    public static void reserveAnimal(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Enter animal: (dog or monkey)");
        String animalType = scanner.nextLine();
        System.out.println("Enter service country: ");
        String inServiceCountry = scanner.nextLine();
        if (animalType.equalsIgnoreCase("dog")) {
            for (Dog dog : dogList) {
                if (dog.getInServiceLocation().equals(inServiceCountry) && dog.getTrainingStatus().equals(
                        "in service")) {
                    dog.setReserved(true);
                    return;
                }
            }

        } else if (animalType.equalsIgnoreCase("monkey")) {
            for (Monkey monkey : monkeyList) {
                if (monkey.getInServiceLocation().equals(inServiceCountry) && monkey.getTrainingStatus().equals(
                        "in service")) {
                    monkey.setReserved(true);
                    return;
                }
            }
        }
        System.out.println("No animals of that type and location are " +
                "available.");
    }

    public static void printAnimals(String listType) {
        switch (listType) {
            case "dog":
                for (Dog dog : dogList) {
                    System.out.println("Name: " + dog.getName());
                    System.out.println("Status: " + dog.getTrainingStatus());
                    System.out.println("Acquisition country: " + dog.getInServiceLocation());
                    System.out.println("Reserved: " + dog.getReserved());
                }
                break;
            case "monkey":
                for (Monkey monkey : monkeyList) {
                    System.out.println("Name: " + monkey.getName());
                    System.out.println("Status: " + monkey.getTrainingStatus());
                    System.out.println("Acquisition country: " + monkey.getInServiceLocation());
                    System.out.println("Reserved: " + monkey.getReserved());
                }
                break;
            case "available":
                for (Dog dog : dogList) {
                    if (
                            dog.getTrainingStatus().equals("in service") &&
                                    !dog.getReserved()
                    ) {
                        System.out.println(dog);
                    }
                }
                for (Monkey monkey : monkeyList) {
                    if (
                            monkey.getTrainingStatus().equals("in service") &&
                                    !monkey.getReserved()
                    ) {
                        System.out.println(monkey);
                    }
                }
                break;
        }
    }
}




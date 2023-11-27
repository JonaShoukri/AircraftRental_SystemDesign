import java.util.Scanner;

public class AircraftSimulator {
    static boolean exitApp = false;
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        Aircraft currentAircraft = null;
        boolean exit = false;
        char choice;

        do {
            Console.Clear();
            System.out.println("Welcome to Luxury Aircraft Simulations");
            System.out.println("Check out some of our jets: ");
            System.out.println("1. Simpleton Helicopter");
            System.out.println("2. Executive Helicopter");
            System.out.println("3. Presidential Helicopter");
            System.out.println("4. Simpleton Plane");
            System.out.println("5. Executive Plane");
            System.out.println("6. Presidential Plane");
            System.out.println("7. Exit");

            System.out.println("Enter the number of the aircraft you want to simulate to get started: ");

            choice = scanner.next().charAt(0);

            Console.Clear();
            switch(choice){
                case '1':
                    System.out.println("You have chosen the Simpleton Helicopter");
                    currentAircraft = AbstractAircraftFactory.order(Variants.SIMPLETON).createHelicopter();
                    break;
                case '2':
                    System.out.println("You have chosen the Executive Helicopter");
                    currentAircraft = AbstractAircraftFactory.order(Variants.EXECUTIVE).createHelicopter();
                    break;
                case '3':
                    System.out.println("You have chosen the Presidential Helicopter");
                    currentAircraft = AbstractAircraftFactory.order(Variants.PRESIDENTIAL).createHelicopter();
                    break;
                case '4':
                    System.out.println("You have chosen the Simpleton Plane");
                    currentAircraft = AbstractAircraftFactory.order(Variants.SIMPLETON).createAirplain();
                    break;
                case '5':
                    System.out.println("You have chosen the Executive Plane");
                    currentAircraft = AbstractAircraftFactory.order(Variants.EXECUTIVE).createAirplain();
                    break;
                case '6':
                    System.out.println("You have chosen the Presidential Plane");
                    currentAircraft = AbstractAircraftFactory.order(Variants.PRESIDENTIAL).createAirplain();
                    break;
                case '7':
                    System.out.println("Thank you for visiting Luxury Aircrafts rentals");
                    exit = true;
                    exitApp = true;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while(!exit && (choice <= '0' || choice >= '8'));

        if (!exit){
            System.out.println("Press any key to continue...");
            Scanner scanner1 = new Scanner(System.in);
            scanner1.nextLine();
            do {
                Console.Clear();
                System.out.println("Choose one of the following options: ");
                System.out.println("1. Turn on the aircraft");
                System.out.println("2. Turn off the aircraft");
                System.out.println("3. Take off");
                System.out.println("4. Land");
                System.out.println("5. Turn LandingMode on/off");
                System.out.println("6. Change altitude");
                System.out.println("7. Check aircraft status");
                System.out.println("8. Fix aircraft");
                System.out.println("9. Exit");

                choice = scanner.next().charAt(0);

                while (choice >= '1' || choice <= '8'){
                    switch(choice){
                        case '1':
                            currentAircraft.turnOn();
                            break;
                        case '2':
                            currentAircraft.turnOff();
                            break;
                        case '3':
                            currentAircraft.takeOff();
                            break;
                        case '4':
                            currentAircraft.land();
                            break;
                        case '5':
                            currentAircraft.activateLandingMode();
                            break;
                        case '6':
                            System.out.println("Enter the altitude you want to change to: ");
                            double altitude = scanner.nextDouble();
                            currentAircraft.changeAltitude(altitude);
                            break;
                        case '7':
                            System.out.println(currentAircraft.getSpecks());
                            break;
                        case '8':
                            currentAircraft.fix();
                            break;
                        case '9':
                            exit = true;
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                    if (exit){
                        break;
                    }
                    System.out.println("Press any key to continue...");
                    scanner1.nextLine();
                    break;
                }
            } while (choice != '9');
        }

        System.out.println("See you soon!");
    }
}

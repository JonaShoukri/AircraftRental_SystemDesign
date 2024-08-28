import java.util.ArrayList;
import java.util.Scanner;

public class AircraftSimulator {
    static boolean exitApp = false;
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<User>();
        ArrayList<Aircraft> aircrafts = new ArrayList<Aircraft>();
        Aircraft currentAircraft = null;
        boolean exit = false;
        boolean quit = false;
        char choice;
        aircrafts.add(AbstractAircraftFactory.order(Variants.SIMPLETON).createHelicopter());
        aircrafts.add(AbstractAircraftFactory.order(Variants.EXECUTIVE).createHelicopter());
        aircrafts.add(AbstractAircraftFactory.order(Variants.PRESIDENTIAL).createHelicopter());
        aircrafts.add(AbstractAircraftFactory.order(Variants.SIMPLETON).createAirplain());
        aircrafts.add(AbstractAircraftFactory.order(Variants.EXECUTIVE).createAirplain());
        aircrafts.add(AbstractAircraftFactory.order(Variants.PRESIDENTIAL).createAirplain());

        Console.Clear();
        System.out.println("Salutations! How many are going to be joining us today?");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++){
            for (Aircraft aircraft: aircrafts) {
                users.add(new User(aircrafts));
            }
        }


        for (User user: users) {

        }

        do {
            do {
                Console.Clear();
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
                        currentAircraft = aircrafts.get(0);
                        break;
                    case '2':
                        System.out.println("You have chosen the Executive Helicopter");
                        currentAircraft = aircrafts.get(1);
                        break;
                    case '3':
                        System.out.println("You have chosen the Presidential Helicopter");
                        currentAircraft = aircrafts.get(2);
                        break;
                    case '4':
                        System.out.println("You have chosen the Simpleton Plane");
                        currentAircraft = aircrafts.get(3);
                        break;
                    case '5':
                        System.out.println("You have chosen the Executive Plane");
                        currentAircraft = aircrafts.get(4);
                        break;
                    case '6':
                        System.out.println("You have chosen the Presidential Plane");
                        currentAircraft = aircrafts.get(5);
                        break;
                    case '7':
                        System.out.println("Thank you for visiting Luxury Aircrafts rentals");
                        quit = true;
                        exitApp = true;
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            }while(!quit && (choice <= '0' || choice >= '8'));

            if (!quit){
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
        } while (!quit);
    }
}

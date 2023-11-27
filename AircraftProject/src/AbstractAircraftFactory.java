import java.util.Scanner;

public abstract class AbstractAircraftFactory {
    static PresidentialFactory presidentialFactory = new PresidentialFactory();
    static ExecutiveFactory executiveFactory = new ExecutiveFactory();
    static SimpletonFactory simpletonFactory = new SimpletonFactory();


    public static AbstractAircraftFactory order(Variants variant){
        AbstractAircraftFactory factory = null;

        switch (variant) {
            case PRESIDENTIAL:
                factory = presidentialFactory;
                break;
            case EXECUTIVE:
                factory = executiveFactory;
                break;
            case SIMPLETON:
                factory = simpletonFactory;
                break;
            default:
                System.out.println("Invalid choice");
                factory = null;
                break;
        }
        return  factory;
    }

    abstract Airplain createAirplain();
    abstract Helicopter createHelicopter();

}

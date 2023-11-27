import java.awt.*;

public class Airplain extends Aircraft{
    int wingSpan;
    int numSeats;
    Engine engines;
    int maxSpeed;

    public Airplain(){ super(Type.AIRPLAIN); }

    int getWingSpan(){ return wingSpan; }
    int getNumSeats(){ return numSeats; }
    Engine getEngine(){ return engines; }
    int getMaxSpeed(){ return maxSpeed; }

    void setWingSpan(int wingSpan){ this.wingSpan = wingSpan; }
    void setNumSeats(int numSeats){ this.numSeats = numSeats; }
    void setEngine(Engine engines){ this.engines = engines; }
    void setMaxSpeed(int maxSpeed){ this.maxSpeed = maxSpeed; }

    String getSpecks(){
        return this + "Wing span: " + this.getWingSpan() + "\n" +
               "Seats: " + this.getNumSeats() + "\n" +
               "Max speed: " + this.getMaxSpeed() + "\n" +
                "Engine: " + this.getEngine() + "\n";
    }
}

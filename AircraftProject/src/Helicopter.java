public class Helicopter extends Aircraft{
    int numBlades;
    int maxSpeed;
    int numSeats;
    int weight;
    Engine engine;
    public Helicopter(){
        super(Type.HELICOPTER);
    }

    int getNumBlades(){ return numBlades; }
    int getMaxSpeed(){ return maxSpeed; }
    int getNumSeats(){ return numSeats; }
    int getWeight(){ return weight; }
    Engine getEngine(){ return engine; }

    void setNumBlades(int numBlades){ this.numBlades = numBlades; }
    void setMaxSpeed(int maxSpeed){ this.maxSpeed = maxSpeed; }
    void setNumSeats(int numSeats){ this.numSeats = numSeats; }
    void setWeight(int weight){ this.weight = weight; }
    void setEngine(Engine engine){ this.engine = engine; }

    String getSpecks(){
        return this + "Number of blades: " + this.getNumBlades() + "\n" +
               "Max speed: " + this.getMaxSpeed() + "\n" +
               "Seats: " + this.getNumSeats() + "\n" +
               "Weight: " + this.getWeight() + "\n" +
               "Engine: " + this.getEngine() + "\n";
    }
}

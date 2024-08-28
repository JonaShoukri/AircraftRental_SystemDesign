import java.util.ArrayList;

public abstract class Aircraft {
    String ID;
    double altitude;
    StateOn on;
    Type type;
    Variants variant;
    StateFunctional functional;
    StateLanded landed;
    StateLanding landing;
    ArrayList<User> users;

    public Aircraft(Type type){
        this.ID = IdGenerator.generateID();
        this.type = type;
        this.altitude = 0;
        this.on = StateOn_False.Instance();
        this.functional = StateFunctional_True.Instance();
        this.landed = StateLanded_True.Instance();
        this.landing = StateLanding_False.Instance();
        this.users = new ArrayList<>();
    }

    public String getID(){
        return this.ID;
    }
    public double getAltitude(){
        return this.altitude;
    }
    public boolean getOn(){
        return this.on.get();
    }
    public Type getType(){
        return this.type;
    }
    public Variants getVariant(){
        return this.variant;
    }
    public boolean getFunctional(){
        return this.functional.get();
    }
    public boolean getLanded(){
        return this.landed.get();
    }
    public boolean getLanding(){
        return this.landing.get();
    }
    private void setAltitude(double altitude){
        this.altitude = altitude;
    }

    public void setVariant(Variants variant){
        this.variant = variant;
    }

    public void addUser(User user){
        this.users.add(user);
    }

    public String toString(){
        return "ID: " + this.getID() +  "\n" +
                "Variant: " + this.getVariant() + "\n" +
                "Type: " + getType() + "\n" +
                "Altitude: " +  this.getAltitude() + "\n" +
               "On: " + this.getOn() + "\n" +
               "Functional: " + this.getFunctional() + "\n" +
               "Landed: " + this.getLanded() + "\n"+
                "Landing: " + this.getLanding() + "\n";
    }

    String getSpecks(){
        return null;
    }

    public void turnOn(){
        if (this.getOn()){
            System.out.println("Aircraft is already on.");
        } else if (!this.getFunctional()){
            System.out.println("You need to fix the aircraft first!");
        } else {
            System.out.println("Turning on...");
            this.on.change(this);
        }
    }

    public void turnOff(){
        if (!this.getOn()){
            System.out.println("Aircraft is already off.");
        } else if (!this.getLanded()){
            System.out.println("You need to land first!");
        } else {
            System.out.println("Turning off...");
            this.on.change(this);
        }
        if (this.isAvailable()){
            notifyUsers();
        }
    }

    public void takeOff(){
        if (!this.getOn()){
            System.out.println("You need to turn on the aircraft first!");
        } else if (!this.getFunctional()){
            System.out.println("You need to fix the aircraft first!");
        } else if (!this.getLanded()){
            System.out.println("You had already taken off!");
        } else {
            System.out.println("Taking off...");
            this.landed.change(this);
            this.altitude += 1000;
        }
    }

    public void land(){
        if (!this.getFunctional()){
            System.out.println("You need to fix the aircraft first!");
        } else if (this.getLanded()){
            System.out.println("You had already landed!");
        }else if (!this.getLanding()){
            System.out.println("You need to activate landing mode first!");
        } else {
            System.out.println("Landing...");
            this.landed.change(this);
            this.landing.change(this);
            this.setAltitude(0);
            if (this.isAvailable()){
                notifyUsers();
            }
        }
    }

    public void changeAltitude(double altitude){
        if (!this.getOn()){
            System.out.println("You need to turn on the aircraft first!");
        } else if (!this.getFunctional()){
            System.out.println("You need to fix the aircraft first!");
        } else if (this.getLanded()){
            System.out.println("You need to take off first!");
        } else if (altitude < 0 && !this.getLanding()){
            System.out.println("YOU BLOW UP!! CANT GO DOWN WITHOUT LANDING MODE ON");
            this.setAltitude(0);
            this.on.change(this);
            this.functional.change(this);
            this.landed.change(this);
        }else if (this.altitude + altitude <= 0) {
            land();
        } else if (this.altitude + altitude >= 12000) {
            System.out.println("YOU BLEW UP");
            this.setAltitude(0);
            this.functional.change(this);
            this.on.change(this);
            this.landed.change(this);
        }else if (this.altitude + altitude >= 10000) {
            System.out.println("Dangerous altitude!");
            this.altitude += altitude;
        }
        else {
            System.out.println("Changing altitude...");
            this.altitude += altitude;
        }
    }

    public void activateLandingMode(){
        if (!this.getOn()){
            System.out.println("You need to turn on the aircraft first!");
        } else if (!this.getFunctional()){
            System.out.println("You need to fix the aircraft first!");
        } else if (this.getLanded()){
            System.out.println("You need to take off first!");
        } else if (this.getLanding()){
            System.out.println("You had already activated landing mode!");
        } else {
            System.out.println("Activating landing mode...");
            this.landing.change(this);
        }
    }

    public void fix(){
        if (this.getFunctional()){
            System.out.println("Aircraft is already functional.");
        } else {
            System.out.println("Fixing...");
            this.functional.change(this);
        }
        if (this.isAvailable()){
            notifyUsers();
        }
    }

    private void notifyUsers(){
        for (User user : this.users){
            System.out.println("Hey User" + user.ID + ", your " + this.variant + "aircraft is now available!");
        }
    }

    private boolean isAvailable() {
        if (landed.get() && !on.get() && functional.get() && !landing.get()){
            return true;
        }
        return false;
    }
}

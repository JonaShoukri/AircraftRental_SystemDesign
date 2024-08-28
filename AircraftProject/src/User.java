import java.util.ArrayList;

public class User {
    private static int count = 0;
    ArrayList<Aircraft> aircrafts;
    int ID;

    User(ArrayList<Aircraft> aircrafts) {
        this.ID = count;
        this.aircrafts = aircrafts;
        for (Aircraft aircraft : aircrafts) {
            aircraft.addUser(this);
        }
        count++;
    }
}

public class StateOn {
    boolean get(){
        return false;
    }

    void change(Aircraft aircraft){
        aircraft.on = StateOn_True.Instance();
    }
}

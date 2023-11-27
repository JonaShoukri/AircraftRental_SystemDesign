public class StateFunctional {
    boolean get(){
        return true;
    }
    void change(Aircraft aircraft){
        aircraft.functional = StateFunctional_False.Instance();
    }
}

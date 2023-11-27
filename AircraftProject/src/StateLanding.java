public class StateLanding {
    boolean get(){
        return false;
    }

    void change(Aircraft aircraft){
        aircraft.landing = StateLanding_True.Instance();
    }
}

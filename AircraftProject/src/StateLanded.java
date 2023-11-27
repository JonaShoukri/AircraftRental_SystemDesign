public class StateLanded {
    boolean get(){
        return true;
    }
    void change(Aircraft aircraft){
        aircraft.landed = StateLanded_False.Instance();
    }
}

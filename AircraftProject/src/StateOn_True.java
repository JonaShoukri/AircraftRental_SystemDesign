public class StateOn_True extends StateOn{
    private static StateOn_True instance = new StateOn_True();
    private StateOn_True(){}

    boolean get(){
        return true;
    }

    void change(Aircraft aircraft){
        aircraft.on = StateOn_False.Instance();
    }

    public static StateOn_True Instance(){
        return instance;
    }
}

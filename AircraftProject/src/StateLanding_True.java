public class StateLanding_True extends StateLanding{
    private static StateLanding_True instance = new StateLanding_True();
    private StateLanding_True(){}

    boolean get(){
        return true;
    }

    void change(Aircraft aircraft){
        aircraft.landing = StateLanding_False.Instance();
    }

    public static StateLanding_True Instance(){
        return instance;
    }
}

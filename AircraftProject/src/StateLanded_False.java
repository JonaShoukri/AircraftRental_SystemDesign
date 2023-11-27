public class StateLanded_False extends StateLanded{
    private static StateLanded_False instance = new StateLanded_False();
    private StateLanded_False(){}

    boolean get(){
        return false;
    }

    void change(Aircraft aircraft){
        aircraft.landed = StateLanded_True.Instance();
    }

    public static StateLanded_False Instance(){
        return instance;
    }
}

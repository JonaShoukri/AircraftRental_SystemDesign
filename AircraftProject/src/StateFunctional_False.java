public class StateFunctional_False extends StateFunctional{
    private static StateFunctional_False instance = new StateFunctional_False();
    private StateFunctional_False(){}

    boolean get(){
        return false;
    }

    void change(Aircraft aircraft){
        aircraft.functional = StateFunctional_True.Instance();
    }

    public static StateFunctional_False Instance(){
        return instance;
    }
}

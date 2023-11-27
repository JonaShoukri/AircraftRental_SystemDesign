public class StateFunctional_True extends StateFunctional{
    private static StateFunctional_True instance = new StateFunctional_True();
    private StateFunctional_True(){}
    public static StateFunctional_True Instance(){
        return instance;
    }
}

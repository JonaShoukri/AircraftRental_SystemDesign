public class StateOn_False extends StateOn{
    private static StateOn_False instance = new StateOn_False();
    private StateOn_False(){}
    public static StateOn_False Instance(){
        return instance;
    }
}

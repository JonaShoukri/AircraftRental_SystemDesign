public class StateLanding_False extends StateLanding{
    private static StateLanding_False instance = new StateLanding_False();
    private StateLanding_False(){}

    public static StateLanding_False Instance(){
        return instance;
    }
}

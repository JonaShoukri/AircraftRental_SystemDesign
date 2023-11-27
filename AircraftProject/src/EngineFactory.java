public class EngineFactory {

    public static Engine method(EngineType type){
        switch(type){
            case Gas:
                return new GasEngine();
            case Electric:
                return new ElectricEngine();
            default:
                return null;
        }
    }
}

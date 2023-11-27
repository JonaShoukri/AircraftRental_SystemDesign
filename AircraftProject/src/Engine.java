public abstract class Engine {
    //Keep in mind i know nothing about engines
    public EngineType type;
    public String v;
    public String brand;

    public Engine(){}

    public String toString(){
        return "\n\tType: " + this.type + "\n" +
                "\tIs a V" + this.v + "\n" +
                "\tBrand: " + this.brand + "\n";
    }
}

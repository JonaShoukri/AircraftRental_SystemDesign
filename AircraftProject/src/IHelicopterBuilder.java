public interface IHelicopterBuilder {
    void buildNumBlades();
    void buildMaxSpeed();
    void buildNumSeats();
    void buildWeight();
    void buildEngine();
    void buildVariant();
    Helicopter getHelicopter();
}

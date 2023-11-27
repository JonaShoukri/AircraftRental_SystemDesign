public class AirplaineEngineer {
    private IAirplainBuilder builder;

    public AirplaineEngineer(IAirplainBuilder builder) {
        this.builder = builder;
    }

    public Airplain getAirplain() {
        return this.builder.getAirplain();
    }

    public void makeAirplain() {
        this.builder.buildVariant();
        this.builder.buildEngine();
        this.builder.buildeWings();
        this.builder.buildSeats();
        this.builder.buidMaxSpeed();
    }
}

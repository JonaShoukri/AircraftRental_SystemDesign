public class PresidentialFactory extends AbstractAircraftFactory{
    @Override
    Airplain createAirplain() {
        AirplaineEngineer ae = new AirplaineEngineer(new PresidentialAirplainBuilder());
        ae.makeAirplain();
        return ae.getAirplain();
    }

    @Override
    Helicopter createHelicopter() {
        HelicopterEngineer he = new HelicopterEngineer(new PresidentialHelicopterBuilder());
        he.makeHelicopter();
        return he.getHelicopter();
    }
}

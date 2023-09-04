public class Main {

    public static void main(String[] args) {

        RoadLogistics roadLogistics = new RoadLogistics();
        Transport truck = roadLogistics.createTransport();

        SeaLogistics seaLogistics = new SeaLogistics();
        Transport ship = seaLogistics.createTransport();

    }
}

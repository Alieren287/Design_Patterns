public class Main {

    public static void main(String[] args) {

        RoadLogistics roadLogistics = new RoadLogistics();
        Transport truck = roadLogistics.createTransport();
        truck.deliver();

        SeaLogistics seaLogistics = new SeaLogistics();
        Transport ship = seaLogistics.createTransport();
        ship.deliver();
    }
}

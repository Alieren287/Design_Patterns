public class Adapter implements ClientInterface {
    public Service adaptee;

    @Override
    public void method(Data data) {
        SpecialData specialData = new SpecialData().convertToServiceFormat(data);
        adaptee.serviceMethod(specialData);
    }
}

public class ConcreteCommand1 implements Command {
    String receiver;
    String params;

    ConcreteCommand1(String receiver, String params) {
        this.receiver = receiver;
        this.params = params;
    }

    @Override
    public void execute() {
        //Command logic
    }
}

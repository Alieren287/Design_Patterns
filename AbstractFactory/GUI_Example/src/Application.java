public class Application {
    GUIFactory factory;
    Button button;
    Checkbox checkbox;

    Application(GUIFactory factory) {
        this.factory = factory;
        /*this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();*/
    }

    public void createUI() {
        this.button = factory.createButton();
    }
    public void paint() {
        button.paint();
    }

    public static void main(String[] args) {
        Application application = new Application(new WinFactory());
        application.createUI();
        application.paint();
    }
}

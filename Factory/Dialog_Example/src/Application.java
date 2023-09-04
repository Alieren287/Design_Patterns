import java.util.Objects;

public class Application {

    Dialog dialog;
    Config config = new Config();
    public void initialize() throws Exception {
       config.readApplicationConfigFile();

        if (Objects.equals(config.OS, "Windows"))
                dialog = new WindowsDialog();
        else if (Objects.equals(config.OS, "Web"))
                dialog = new WebDialog();
        else
            throw new Exception("Error! Unknown operating system.");
    }

    public static void main(String[] args) throws Exception {
        Application application = new Application();
        application.initialize();

        application.dialog.render();
    }
}

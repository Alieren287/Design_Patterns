public class Panel extends Container {
    String modalHelpText;

    @Override
    public void showHelp() {
        if (modalHelpText != null)
            System.out.println("Help text opened.");
        else
            super.showHelp();
    }
}

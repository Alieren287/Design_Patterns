public abstract class Component implements ComponentWithContextualHelp {
    protected Container container;
    public String tooltipText;

    @Override
    public void showHelp() {
        if(tooltipText != null)
            System.out.println(tooltipText);
        else
            container.showHelp();
    }
}

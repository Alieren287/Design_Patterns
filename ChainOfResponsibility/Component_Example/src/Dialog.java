public class Dialog extends Container {
    String wikiPageURL;

    @Override
    public void showHelp() {
        if (wikiPageURL != null)
            System.out.println("Wiki page opened.");
        else
            super.showHelp();
    }
}

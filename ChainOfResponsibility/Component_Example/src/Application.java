public class Application {
    public void createUI() {
        Dialog dialog = new Dialog(/*"Budget Reports"*/);
        dialog.wikiPageURL = "http://...";
        Panel panel = new Panel(/*0, 0, 400, 800*/);
        panel.modalHelpText = "This panel does...";
        Button ok = new Button(/*250, 760, 50, 20, "OK"*/);
        ok.tooltipText = "This is an OK button that...";
        Button cancel = new Button(/*320, 760, 50, 20, "Cancel"*/);
        // ...
        panel.add(ok);
        panel.add(cancel);
        dialog.add(panel);
    }

}

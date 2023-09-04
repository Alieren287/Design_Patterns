public abstract class Dialog {

    public abstract Button createButton();

    public void render() {
        Button okButton = createButton();
        String event = "closeDialog";

        okButton.onClick(event);
        okButton.render();
    }
}

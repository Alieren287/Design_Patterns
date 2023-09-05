import java.util.List;

public class Application {
    String clipboard;
    List<Editor> editors;
    Editor activeEditor;
    CommandHistory history;

    public void createUI() {

        Command copy = function();
        Button copyButton = new Button();
        copyButton.setCommand(copy);
        String copyShortcut = "Ctrl+C";

        Command cut = function1();
        Button cutButton = new Button();
        cutButton.setCommand(cut);
        String cutShortcut = "Ctrl+X";

        Command paste = function3();
        Button pasteButton = new Button();
        pasteButton.setCommand(paste);
        String pasteShortcut = "Ctrl+V";

        Command undo = function4();
        Button undoButton = new Button();
        pasteButton.setCommand(undo);
        String undoShortcut = "Ctrl+Z";
    }

    public Command function() {
        CopyCommand copyCommand = new CopyCommand(this, activeEditor);
        executeCommand(copyCommand);

        return copyCommand;
    }
    public Command function1() {
        CutCommand cutCommand = new CutCommand(this, activeEditor);
        executeCommand(cutCommand);

        return cutCommand;
    }
    public Command function3() {
        PasteCommand pasteCommand = new PasteCommand(this, activeEditor);
        executeCommand(pasteCommand);

        return pasteCommand;
    }
    public Command function4() {
        UndoCommand undoCommand = new UndoCommand(this, activeEditor);
        executeCommand(undoCommand);

        return undoCommand;
    }

    public void executeCommand(Command command) {
        if(command.execute()) {
            history.push(command);
        }
    }
    public void undo() {
        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }
}

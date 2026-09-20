package gui.windows;

import gui.Button;
import gui.Checkbox;
import gui.GUIFactory;

/** Concrete factory: creates a matching pair of Windows components. */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

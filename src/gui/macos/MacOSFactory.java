package gui.macos;

import gui.Button;
import gui.Checkbox;
import gui.GUIFactory;

/** Concrete factory: creates a matching pair of macOS components. */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

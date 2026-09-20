package gui.macos;

import gui.Checkbox;

/** Concrete product: a macOS-style checkbox. */
public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Rendering macOS checkbox");
    }
}

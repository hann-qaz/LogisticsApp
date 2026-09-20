package gui.windows;

import gui.Checkbox;

/** Concrete product: a Windows-style checkbox. */
public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Rendering Windows checkbox");
    }
}

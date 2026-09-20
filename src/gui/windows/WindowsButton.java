package gui.windows;

import gui.Button;

/** Concrete product: a Windows-style button. */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Rendering Windows button");
    }
}

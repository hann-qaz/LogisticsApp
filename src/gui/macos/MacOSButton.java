package gui.macos;

import gui.Button;

/** Concrete product: a macOS-style button. */
public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("Rendering macOS button");
    }
}

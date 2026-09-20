package gui;

/**
 * Abstract Factory.
 * Declares creation methods for a whole family of related UI products
 * (a button and a checkbox that belong together, e.g. both Windows or both macOS).
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

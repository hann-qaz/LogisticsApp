package app;

import gui.Button;
import gui.Checkbox;
import gui.GUIFactory;
import logistics.Logistics;

/*
  Client of both patterns.
  It receives a GUIFactory (Abstract Factory) and a Logistics (Factory Method) */
public class DeliveryApplication {

    private final GUIFactory guiFactory;
    private final Logistics logistics;

    public DeliveryApplication(GUIFactory guiFactory, Logistics logistics) {
        this.guiFactory = guiFactory;
        this.logistics = logistics;
    }

    /** Renders the UI pair, then runs the delivery workflow */
    public void run(String cargo, String destination) {
        renderUi();
        logistics.planDelivery(cargo, destination);
    }

    private void renderUi() {
        Button button = guiFactory.createButton();
        Checkbox checkbox = guiFactory.createCheckbox();

        button.paint();
        checkbox.paint();
    }
}

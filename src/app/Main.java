package app;

import gui.GUIFactory;
import gui.macos.MacOSFactory;
import gui.windows.WindowsFactory;
import logistics.Logistics;
import logistics.RoadLogistics;
import logistics.SeaLogistics;

import java.util.Scanner;

/**
 * reads the two independent choices validates them and passes into DeliveryApplication.
 */
public class Main {

    private static final String SAMPLE_CARGO = "laboratory equipment";
    private static final String SAMPLE_DESTINATION = "Aktau warehouse";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String modeInput = readLine(scanner, "Enter delivery mode (ROAD or SEA): ");
        if (modeInput == null) {
            System.out.println("No delivery mode was provided. Stopping.");
            return;
        }

        Logistics logistics = createLogistics(modeInput);
        if (logistics == null) {
            System.out.println("Unsupported delivery mode: " + modeInput
                    + ". Allowed values are ROAD or SEA. Stopping.");
            return;
        }
        System.out.println("Delivery mode: " + modeInput.toUpperCase());

        String platformInput = readLine(scanner, "Enter UI platform (WINDOWS or MACOS): ");
        if (platformInput == null) {
            System.out.println("No UI platform was provided. Stopping.");
            return;
        }

        GUIFactory guiFactory = createGuiFactory(platformInput);
        if (guiFactory == null) {
            System.out.println("Unsupported UI platform: " + platformInput
                    + ". Allowed values are WINDOWS or MACOS. Stopping.");
            return;
        }
        System.out.println("UI platform: " + platformInput.toUpperCase());

        DeliveryApplication application = new DeliveryApplication(guiFactory, logistics);
        application.run(SAMPLE_CARGO, SAMPLE_DESTINATION);
    }

    /** Reads one line of input, or null if there is nothing to read (missing input). */
    private static String readLine(Scanner scanner, String prompt) {
        System.out.print(prompt);
        if (!scanner.hasNextLine()) {
            return null;
        }
        String line = scanner.nextLine().trim();
        return line.isEmpty() ? null : line;
    }

    /** The only place that decides which concrete Logistics to build. */
    private static Logistics createLogistics(String mode) {
        switch (mode.toUpperCase()) {
            case "ROAD":
                return new RoadLogistics();
            case "SEA":
                return new SeaLogistics();
            default:
                return null;
        }
    }

    /** The only place that decides which concrete GUIFactory to build. */
    private static GUIFactory createGuiFactory(String platform) {
        switch (platform.toUpperCase()) {
            case "WINDOWS":
                return new WindowsFactory();
            case "MACOS":
                return new MacOSFactory();
            default:
                return null;
        }
    }
}

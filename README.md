# Logistics Delivery App 
## Purpose
A console Java application that plans a delivery and
renders a matching UI component pair (Windows or macOS). It demonstrates:
- **Factory Method** - `Logistics` / `RoadLogistics` / `SeaLogistics` create the
  right `Transport` (`Truck` or `Ship`).
- **Abstract Factory** - `GUIFactory` / `WindowsFactory` / `MacOSFactory` create
  a matching `Button` + `Checkbox` pair for one platform.

Both parts are combined in `app.DeliveryApplication`, which only depends on the
abstract types (`Logistics`, `GUIFactory`, `Transport`, `Button`, `Checkbox`) —
never on concrete classes.

## Package structure
```
src/
  logistics/        Factory Method pattern
    Transport.java        (Product)
    Truck.java             (Concrete Product)
    Ship.java               (Concrete Product)
    Logistics.java          (Creator)
    RoadLogistics.java      (Concrete Creator)
    SeaLogistics.java       (Concrete Creator)
  gui/               Abstract Factory pattern
    Button.java             (Abstract Product)
    Checkbox.java           (Abstract Product)
    GUIFactory.java         (Abstract Factory)
    windows/
      WindowsButton.java
      WindowsCheckbox.java
      WindowsFactory.java   (Concrete Factory)
    macos/
      MacOSButton.java
      MacOSCheckbox.java
      MacOSFactory.java     (Concrete Factory)
  app/
    DeliveryApplication.java  (Client — combines both patterns)
    Main.java                 (Startup: reads/validates input, wires everything)
```

## Prerequisites
- JDK 17+
- No external libraries required

## Build and run
From the project root:

```bash
mkdir -p out
javac -d out $(find src -name "*.java")
java -cp out app.Main
```

You will be prompted twice:
```
Enter delivery mode (ROAD or SEA): ROAD
Enter UI platform (WINDOWS or MACOS): WINDOWS
```

## Supported input values
- Delivery mode: `ROAD`, `SEA`
- UI platform: `WINDOWS`, `MACOS` 
- Anything else, or empty input, prints a clear error message and the
  program stops cleanly (no default is silently used).

## Sample run
```
$ java -cp out app.Main
Enter delivery mode (ROAD or SEA): ROAD
Delivery mode: ROAD
Enter UI platform (WINDOWS or MACOS): WINDOWS
UI platform: WINDOWS
Rendering Windows button
Rendering Windows checkbox
Truck delivers laboratory equipment to Aktau warehouse
```

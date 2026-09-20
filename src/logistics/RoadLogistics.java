package logistics;

/** Concrete creator: produces a Truck. */
public class RoadLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}

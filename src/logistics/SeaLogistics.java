package logistics;

/** Concrete creator: produces a Ship. */
public class SeaLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}

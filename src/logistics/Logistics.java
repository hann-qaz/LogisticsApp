package logistics;

/**
 * Creator (Factory Method pattern).
 * Declares the factory method createTransport() and provides a shared
 * planDelivery(...) workflow that every concrete creator reuses.
 */
public abstract class Logistics {

    /** Factory method: subclasses decide which Transport to create. */
    public abstract Transport createTransport();

    /**
     * Shared workflow: gets a transport through the factory method and
     * asks it to deliver, without knowing the concrete transport type.
     */
    public void planDelivery(String cargo, String destination) {
        Transport transport = createTransport();
        transport.deliver(cargo, destination);
    }
}

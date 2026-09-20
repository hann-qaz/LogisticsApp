package logistics;

/**
 * Product interface for the Factory Method pattern.
 * Every concrete transport (Truck, Ship, ...) must implement this.
 */
public interface Transport {
    void deliver(String cargo, String destination);
}

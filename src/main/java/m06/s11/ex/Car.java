package m06.s11.ex;

import java.util.logging.Logger;

// TODO: is-a Vehicle and Conditioning
public class Car extends Vehicle implements  Conditioning {
    private static final Logger log = Logger.getGlobal();

    public Car() {
        log.info("Car created");
    }
    @Override
    public String setNewTemp(int i) {
        return new StringBuilder().append("Temperatura settata a ").append(i).toString();
    }
}

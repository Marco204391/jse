package m06.s11.ex;

import java.util.logging.Logger;

// TODO: it should steer left/right, it should brake
public class Vehicle {
    private static final Logger log = Logger.getGlobal();

    public Vehicle() {
        log.info("Vehicle created");
    }

    public String steer(String s) {
        return "Ho girato a " + s;
    }

}

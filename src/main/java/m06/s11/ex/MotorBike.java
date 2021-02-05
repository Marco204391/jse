package m06.s11.ex;

import java.util.logging.Logger;

// TODO: is-a Vehicle
public class MotorBike extends Vehicle {
    private static final Logger log = Logger.getGlobal();

    public MotorBike() {
        log.info("MotorBike created");
    }
}

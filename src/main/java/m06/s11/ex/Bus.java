package m06.s11.ex;

import java.util.logging.Logger;

// TODO: is-a Vehicle and Conditioning
public class Bus extends Vehicle implements  Conditioning {
    private static final Logger log = Logger.getGlobal();


    public Bus() {
        log.info("Bus created");
    }

    public String setNewTemp(int i) {
        return new StringBuilder().append("Temperatura settata a ").append(i).toString();
    }
}

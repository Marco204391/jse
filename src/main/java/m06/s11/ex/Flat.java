package m06.s11.ex;

import java.util.logging.Logger;

// TODO: is-a Conditioning
public class Flat implements Conditioning {
    private static final Logger log = Logger.getGlobal();

    public Flat() {
        log.info("Car created");
    }

    public String setNewTemp(int i) {
        return new StringBuilder().append("Temperatura settata a ").append(i).toString();
    }
}

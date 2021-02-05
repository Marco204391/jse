package m06.s11.ex;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // TODO: (1) put objects of (at least) three different types in this array
        Vehicle[] vehicles = {new Bus(), new Car(), new MotorBike(), new Car()};
        System.out.println(Arrays.toString(vehicles));

        // TODO: (2) let all vehicle steer in alternate directions
        for (int i = 0; i < vehicles.length; i++) {
            if (i % 2 == 0) {
                System.out.println(vehicles[i].steer("Destra"));
            } else {
                System.out.println(vehicles[i].steer("Sinistra"));
            }
        }

        // TODO: (3) put objects of (at least) three different types in this array
        Conditioning[] conditioned = {new Bus(), new Car(), new Flat(), new Flat(), new Car()};

        // TODO: (4) set the temperature of each conditioned to 20
        for (Conditioning c : conditioned) {
            System.out.println(c.setNewTemp(20));
        }
    }
}

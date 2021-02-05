package m05.s03.ex;

import m05.s04.Dog;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = { "Tom", "Bob", "Kit", "Zip", "Kit" };
        String[] colors = { "blue", "green", "yellow", "black", "blue" };

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(colors));

        // TODO: (1) create an array of cats, same size of the arrays above
        Cat[] cats = new Cat[names.length];
        for (int i =0; i < cats.length; i++) {
            cats[i] = new Cat(names[i], colors[i]);
        }

        System.out.println(String.format("There are %d cats in the array", cats.length));

        // TODO: (2) initialize the cats array
        // each cat should have name and color from the arrays above

        System.out.println(String.format("Currently there are %d cats in the program", Cat.getCount()));

        // TODO: (3) each cat should meow
        for (Cat cat : cats) {
            cat.meow();
        }

        // TODO: (4) each cat named Kit should meow
        for (Cat cat : cats) {
            if(cat.getName().equals("Kit")) {
                cat.meow();
            }
        }
        // TODO: (5) only the first cat named Kit should meow
        for (Cat cat : cats) {
            if(cat.getName().equals("Kit")) {
                cat.meow();
                break;
            }
        }

        // TODO: (6) only the cats in even position should meow
        for(int i=0;i<cats.length;i++){
            if(i%2==0){
                cats[i].meow();
            }
        }
    }
}

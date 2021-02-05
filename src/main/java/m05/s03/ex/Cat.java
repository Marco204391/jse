package m05.s03.ex;

public class Cat {
    private static int count = 0;

    private String name;
    private String color;

    /**
     * Cat with a given name and color
     *
     * bad parameter names, see "this"
     *
     * @param n
     * @param c
     */
    public Cat(String name, String color) {
        this.name=name;
        this.color=color;
        count++;
    }

    /**
     * @return the number of cats created via ctor
     */
    public static int getCount() {
        return count;
    }

    public String getName(){
        return name;
    }
    /**
     * The current cat meow on the console
     */
    public void meow() {
        // TODO: Print name and color to System.out
        System.out.println("Sono il gatto "+name+" e sono di colore "+color);
    }

    /**
     * The current cat meow on the console
     * 
     * @param word to be printed on out console
     */
    public void meow(String word) {
        // TODO: Print word, cat name and color to System.out
        System.out.println("Sono il gatto "+name+" e sono di colore "+color+"e miagolo così :"+word);
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + ", color=" + color + "]";
    }

}

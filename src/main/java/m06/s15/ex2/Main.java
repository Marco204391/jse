package m06.s15.ex2;

/**
 * Create a hierarchy of classes based on Person
 * <p>
 * Consultant: daily fee
 * <p>
 * Employee: monthly salary
 * 
 * <p>
 * In the main
 * <p>
 * Create a bunch of persons
 * <p>
 * Print name and daily / salary accordingly to their actual type
 */

public class Main {
	public static void main(String[] args) {
        Person[] persons = {new Consultant("Morgana", "Garbarini"), new Employee("Marco","Lecci"), new Consultant("Rosanna", "Pellicano"),
        		new Consultant("Simona", "Fartade"),new Consultant("Marika", "Messina"),new Employee("Dylan","Mazzoni"),
        		new Employee("Alberto","Strafella"),new Employee("Tommaso","Giromini"), new Employee("Riccardo","Padua")};

        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }
}

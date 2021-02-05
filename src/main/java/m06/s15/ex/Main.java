package m06.s15.ex;

/**
 * Create a hierarchy of classes based on Actor
 * <p>
 * Warrior: could fight, can't do any magic
 * <p>
 * Wizard: can't fight, could do magic
 * 
 * <p>
 * In the main
 * <p>
 * Create a bunch of actors
 * <p>
 * Let them fight against each others
 * <p>
 * Peer-to-peer fight, the most skilled one wins
 * <p>
 * Wizards always beat warriors
 * <p>
 * In the end, let the user knows who survived
 */
public class Main {
	public static void main(String[] args) {

		Actor[] actors = { new Warrior("Marco"), new Warrior("Dylan"), new Wizard("Emanuele"), new Wizard("Morgana"),
				new Warrior("Daniele"), new Warrior("Rosanna"), new Wizard("Marika") };

		for (Actor actor : actors) {
			System.out.println(actor.toString());
		}

		System.out.println("Let's fight ...");
		
		
		for(int i=0; i<actors.length;i++) {
			for(int j=i+1; j<actors.length;j++) {
				if(actors[i].fight(actors[j])) {
					System.out.println(actors[i].getName()+" has won against "+actors[j].getName());
				}else {
					System.out.println(actors[j].getName()+" has won against "+actors[i].getName());
				}
			}
		}
	}
}

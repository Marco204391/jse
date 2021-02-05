package m06.s15.ex;

public class Wizard extends Actor {

	public Wizard(String name) {
		super(name);
	}

	@Override
	public boolean fight(Actor enemy) {
		if(enemy instanceof Wizard) {
			if(this.getLevel()<enemy.getLevel()) {
				return false;
			}
			return true;
		}
		return true;
	}
	@Override
	public String toString() {
		return "The wizard " + this.getName();
	}

}

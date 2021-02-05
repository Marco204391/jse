package m06.s15.ex;

public class Warrior extends Actor {
	
	public Warrior(String name) {
		super(name);
	}
	
	@Override
	public boolean fight(Actor enemy) {
		if(enemy instanceof Warrior) {
			if(this.getLevel()<enemy.getLevel()) {
				return false;
			}
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "The warrior " + this.getName();
	}

}

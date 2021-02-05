package m06.s15.ex;

public abstract class Actor {

	private String name;
	private int level;
	
	public Actor(String name) {
		this.name = name;
		this.level=((int)(Math.random()*10));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract boolean fight(Actor enemy);

	@Override
	public String toString() {
		return "Actor " + name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}

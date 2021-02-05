package m06.s15.ex2;

public class Consultant extends Person{
	
	private int daily_fee;

	public Consultant(String firstName, String lastName) {
		super(firstName, lastName);
		this.daily_fee=((int)(Math.random()*100));
		// TODO Auto-generated constructor stub
	}

	@Override
    public String toString() {
        return "Consultant " + firstName +" "+ lastName + " daily fee: "+daily_fee+ "€";
    }
}

package m06.s15.ex2;

public class Employee extends Person {
	
	private int monthlySalary;

	public Employee(String firstName, String lastName) {
		super(firstName, lastName);
		this.monthlySalary=((int)(Math.random()*1003));
		// TODO Auto-generated constructor stub
	}
	@Override
    public String toString() {
        return "Employee " + firstName +" "+ lastName + " monthly salary: "+monthlySalary+"€";
    }

}

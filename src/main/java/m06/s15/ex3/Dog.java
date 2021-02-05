package m06.s15.ex3;

public class Dog extends Pet {
	
	public static final int TAX_DOG = 10;
	
    public Dog(int days) {
        super(days);
        // TODO Auto-generated constructor stub
    }
    @Override
    public int housing() {
    	int c = this.days*TAX_DOG;
    	return c;
    }
}

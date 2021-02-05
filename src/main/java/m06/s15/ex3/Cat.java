package m06.s15.ex3;

public class Cat extends Pet {
	
	public static final int TAX_CAT = 6;
	
    public Cat(int days) {
        super(days);
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public int housing() {
    	int c = this.days*TAX_CAT;
    	return c;
    }
}

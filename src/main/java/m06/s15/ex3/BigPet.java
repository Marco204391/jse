package m06.s15.ex3;

public abstract class BigPet extends Pet {
	
	public static final int TAX_BIGPET = 10;
   
	public BigPet(int days) {
        super(days);
        // TODO Auto-generated constructor stub
    }
	
	@Override
	public int housing() {
		// TODO Auto-generated method stub
		return 0;
	}
}
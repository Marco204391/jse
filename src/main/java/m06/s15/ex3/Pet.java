package m06.s15.ex3;

public abstract class Pet {
	
	protected int days;
	
	
    public Pet(int days) {
        this.days=days;
    }

    public abstract int housing();
}

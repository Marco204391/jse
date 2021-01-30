package m02.s10.ex;

public class Exercise3 {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Non c'erano elementi nell'argomento passato");
		} else {
			System.out.println("Il numero di agormenti passati è " + args.length);
			// stampa la stringa.
			for (String argomento : args) {
				System.out.println(argomento);
			}
		}
	}
}
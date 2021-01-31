package m03.s04.ex;

public class Exercise {
	final static int GAP = 'a' - 'A';
	final static int ALPHABET_SIZE = 26;

	/**
	 * A simpler version of String.toUpperCase()
	 *
	 * @param s
	 * @return uppercase version of input
	 */
	public String toUpper(String s) {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (cur >= 'a' && cur <= 'z') {
				sb.append((char) (cur - GAP));
			} else {
				sb.append(cur);
			}
		}
		return sb.toString();
	}

	/**
	 * Encrypt an uppercase string using the Caesar's algorithm
	 *
	 * @param s     a string (uppercase only)
	 * @param shift encrypting key
	 * @return the encrypted string
	 */
	public String caesarEncrypt(String s, int shift) {
		String result = "";
		s = s.toUpperCase();
		s = s.replaceAll(" ", "");
		int sup = 'Z'+ ALPHABET_SIZE;
		int min = 'A'- ALPHABET_SIZE;
		int c=shift;

		for (int i = 0; i < s.length(); i++) {
			if(Math.abs(shift)>ALPHABET_SIZE){
				c = shift%ALPHABET_SIZE;
			}
			int j = (int) s.charAt(i) + c;
				if (j >'Z'&& j<sup) {
					j -= ALPHABET_SIZE;
				} else if (j < 65 && j>min) {
					j += ALPHABET_SIZE;
				}

			result += (char) j;
		}
		return result;
	}
}

public class CheckCharacter {
	public static void main(String[] args) {
		System.out.println("isDigit       " + isDigit('0'));
		System.out.println("isLower       " + isLower('a'));
		System.out.println("isUpper       " + isUpper('A'));
		System.out.println("isLetter      " + isLetter('z'));
		System.out.println("isLetterDigit " + isLetterDigit('Z'));
	}

	// isDigit
	public static boolean isDigit(char ch) {
		return (ch >= 48 && ch <= 57);
	}

	// isLower
	public static boolean isLower(char ch) {
		return (ch >= 97 && ch <= 122);
	}

	// isUpper
	public static boolean isUpper(char ch) {
		return (ch >= 65 && ch <= 90);
	}

	// isLetter
	public static boolean isLetter(char ch) {
		return (isLower(ch) || isUpper(ch));
	}

	// isLetterDigit
	public static boolean isLetterDigit(char ch) {
		return (isLetter(ch) || isDigit(ch));
	}

}

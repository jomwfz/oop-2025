import java.util.Scanner;

public class BasicOperator {
	public static void main(String[] args) {

		// Variable
		int n1, n2, result = 0;
		char oper;

		// Input
		Scanner kb = new Scanner(System.in);
		System.out.print("Number1:  ");
		n1 = kb.nextInt();
		System.out.print("Operator: ");
		oper = kb.next().charAt(0);

		// (if) Test: Operator + - * / %
		if (oper != '+' && oper != '-' && oper != '*' && oper != '/' && oper != '%') {
			System.out.print("Error: Invalid Operator");
			return;
		} else {
			System.out.print("Number2:  ");
			n2 = kb.nextInt();
			if ((oper == '%' || oper == '/') && n2 == 0) {
				System.out.print("Error: Divide by zero");
				return;
			} else {
				switch (oper) {
				case '+':
					result = n1 + n2;
					break;
				case '-':
					result = n1 - n2;
					break;
				case '*':
					result = n1 * n2;
					break;
				case '/':
					result = n1 / n2;
					break;
				case '%':
					result = n1 % n2;
					break;
				}
				System.out.printf("%d %s %d = %d", n1, oper, n2, result);
			}
		}

		// Output

	}
}

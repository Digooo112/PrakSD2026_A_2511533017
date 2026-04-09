package pekan3_2511533017;
import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_2511533017 {
	public static int postfixEvaluate_3017(String expression) {
		Stack<Integer> s_3017 = new Stack<Integer>();
		Scanner input_3017 = new Scanner(expression);

		while (input_3017.hasNext()) {
			if (input_3017.hasNextInt()) {		// an operand (integer)
				s_3017.push(input_3017.nextInt());
			} else {
				String operator = input_3017.next();
				int operand2_3017 = s_3017.pop();
				int operand1_3017 = s_3017.pop();

				if (operator.equals("+")) {
					s_3017.push(operand1_3017 + operand2_3017);
				} else if (operator.equals("-")) {
					s_3017.push(operand1_3017 - operand2_3017);
				} else if (operator.equals("*")) {
					s_3017.push(operand1_3017 * operand2_3017);
				} else {
					s_3017.push(operand1_3017 / operand2_3017);
				}
			}
		}

		input_3017.close();
		return s_3017.pop();
	}

	public static void main(String[] args) {
		System.out.println("hasil postfix= " + postfixEvaluate_3017("5 2 4 * + 7 -"));
	}
}

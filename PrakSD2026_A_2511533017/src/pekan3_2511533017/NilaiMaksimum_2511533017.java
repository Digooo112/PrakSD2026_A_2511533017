package pekan3_2511533017;

import java.util.Stack;

public class NilaiMaksimum_2511533017 {
	public static int max_3017(Stack<Integer> s_3017) {
		Stack<Integer> backup_3017 = new Stack<Integer>();
		int maxValue_3017 = s_3017.pop();
		backup_3017.push(maxValue_3017);

		while (!s_3017.isEmpty()) {
			int next = s_3017.pop();
			backup_3017.push(next);
			maxValue_3017 = Math.max(maxValue_3017, next);
		}

		while (!backup_3017.isEmpty()) {
			s_3017.push(backup_3017.pop());
		}

		return maxValue_3017;
	}

	public static void main(String[] args) {
		Stack<Integer> s_3017 = new Stack<Integer>();
		s_3017.push(70);
		s_3017.push(12);
		s_3017.push(20);

		System.out.println("isi stack " + s_3017);
		System.out.println("Stack Teratas " + s_3017.peek());
		System.out.println("Nilai maksimum " + max_3017(s_3017));
	}
}

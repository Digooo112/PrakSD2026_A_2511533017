package Pekan4_2511533017;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511533017 {


	public static void main(String[] args) {
		Queue<Integer> q_3017 = new LinkedList<Integer>();
		q_3017.add(1);
		q_3017.add(2);
		q_3017.add(3);
		System.out.println("sebelum reverse" + q_3017);
		Stack<Integer> s = new Stack<Integer>();
		while (!q_3017.isEmpty ()) { // Q -> S
			s.push(q_3017.remove());
		
			
		}
		while (!s.isEmpty()) { // S -> Q
			q_3017.add(s.pop());
			
		}
		System.out.println("sesudah reverse= " + q_3017); // [3, 2, 1]
		

	}

}

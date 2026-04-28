package Pekan4_2511533017;
import java.util.*;
public class IterasiQueue_2511533017 {

	public static void main(String args[]) {
		Queue<String> q_3017 = new LinkedList<>();
		
		q_3017.add("Praktikum");
		q_3017.add("Struktural");
		q_3017.add("Data");
		q_3017.add("Dan");
		q_3017.add("Algoritma");
		Iterator<String> iterator_3017 = q_3017.iterator();
		while (iterator_3017.hasNext()) {
			System.out.print(iterator_3017.next() + " ");
		}
		
		

	}

}

package Pekan4_2511533017;

import java.util.*;
import java.util.Queue;

public class QueueLinkedList_2511533017 {

	public static void main(String[] args) {
		Queue<Integer> q_3017 = new LinkedList<>();
		
		// tambah elemen {0, 1, 2, 3, 4, 5} ke antrian
		for (int i_3017 = 0; i_3017 < 6; i_3017++) {
			q_3017.add(i_3017);
		}
			
		// Menampilkan isi antrian.
		System.out.println("Elemen Antrian " + q_3017);
		
		// Untuk menghapus kepala antrian.
		int hapus_3017 = q_3017.remove();
		System.out.println("Hapus elemen = " + hapus_3017);
		System.out.println(q_3017);
		
		// Untuk melihat antrian terdepan
		int depan_3017 = q_3017.peek();
		System.out.println("Kepala Antrian = " + depan_3017);
		
		int banyak_3017 = q_3017.size();
		System.out.println("Size Antrian = " + banyak_3017);
	}
}
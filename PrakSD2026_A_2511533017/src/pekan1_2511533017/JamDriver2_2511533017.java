package pekan1_2511533017;
import java.util.Scanner;

public class JamDriver2_2511533017 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("=== Program Driver Objek Jam ===");
		
		// 1. Input Jam_2511533017 Pertama
		System.out.println("\n--- Input Jam_2511533017 1 ---");
		Jam_2511533017 j1 = buatJamDariInput(input);
		
		// 2. Input Jam_2511533017 Kedua
		System.out.println("\n--- Input Jam_2511533017 2 ---");
		Jam_2511533017 j2 = buatJamDariInput(input);
				
		// 3. Menampilkan Data
		System.out.println("\n--- Hasil Operasi ---");
		System.out.println("Jam_2511533017 1 (String)	: " + j1.toString());
		System.out.println("Jam_2511533017 2 (String)	: " + j2.toString());
		System.out.println("Jam_2511533017 1 dalam detik	: " + j1.toString());
		System.out.println("Jam_2511533017 2 dalam detik	: " + j2.toString());
		
		// 4. Operasi Relasional (Perbandingan)
		int perbandingan = j1.compareTo(j2);
		if (perbandingan > 0) {
			System.out.println("Status		:Jam_2511533017 1 lebih lambat (setelah) Jam_2511533017 2");
		} else if (perbandingan < 0) {
			System.out.println("Status		:Jam_2511533017 1 lebih awal (sebelum) Jam_2511533017 2");
		} else {
			System.out.println("Status		:Jam_2511533017 1 dan Jam_2511533017 2 sama persis");
		}
	
		//5. Operasi Aritmatika
		System.out.println("Durasi ( J1 ke J2 )	  				: " + Jam_2511533017.durasiDetik(j1, j2) + " detik");
	
		Jam_2511533017 jNext = j1.nextSecond();
		System.out.println("Jam_2511533017 1 Detik Berikutnya	: " + jNext);
	
		Jam_2511533017 jPrev = j1.prevSecond();
		System.out.println("Jam_2511533017 1 Detik Berikutnya	: " + jPrev);
	
		// 6. Opreari Penjumlahan Jam_2511533017
		Jam_2511533017 jHasilPlus = j1.plus(j2);
		System.out.println("Hasil J1 + J2 			: " + jHasilPlus);
		
		input.close();
		System.out.println("\nProgram Selesai.");
	}

	/**
	 *  Prosedur pembantu untuk melakukan inout dan validasi secara berulang
	 *  sampai user memasukan angka yang benar (0..23, 0..59).
	 */
	private static Jam_2511533017 buatJamDariInput(Scanner sc) {
		int h, m, s;
		while (true) {
			System.out.print("Masukan Jam_2511533017 (0-23)	: ");
			h = sc.nextInt();
			System.out.print("Masukan Jam_2511533017 (0-59)	: ");
			m = sc.nextInt();
			System.out.print("Masukan Jam_2511533017 (0-59)	: ");
			s = sc.nextInt();
			
			// Memanggil method static isValid dari kelas Jam_2511533017
			if (Jam_2511533017.isValid(h, m, s)) {
				return new Jam_2511533017(h, m, s);
			} else {
				System.out.println("[Error] Input tidak valid! Silahkan ulangi.n\n");
			}
		}
	}
}
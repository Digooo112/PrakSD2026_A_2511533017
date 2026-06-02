package Pekan8_2511533017;
public class ShellSort_2511533017 {
	public static void ShellSort_2511533017(int [] A) {
		int n_3017 = A.length;
		int gap_3017 = n_3017/2;
		while (gap_3017 >0) {
			for ( int i_3017 = gap_3017 ; i_3017 < n_3017; i_3017++) {
				int temp_3017 = A[i_3017];
				int j_3017 = i_3017;
				while ( j_3017>= gap_3017 && A[j_3017 - gap_3017 ] > temp_3017) {
					A[j_3017]= A[j_3017 - gap_3017];
					j_3017 = j_3017 - gap_3017;
				}
				A[j_3017] = temp_3017;
			}
			gap_3017 = gap_3017/2;
		}
	}
	
	public static void main (String [] args) {
		int [] data_3017 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		System.out.print("Sebelum : ");
		printArray_2511533017(data_3017);
		
		ShellSort_2511533017(data_3017);
		
		System.out.print("Sesudah (Shell Sort): ");
		printArray_2511533017(data_3017);
	}
	
	public static void printArray_2511533017 (int [] arr) {
		for (int i_3017 : arr) System.out.print(i_3017 + " ");
		System.out.println();
	}
}

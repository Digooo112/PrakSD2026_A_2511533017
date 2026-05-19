package Pekan7_2511533017;
public class BubleSort_2511533017 {
	public static void bubbleSort_2511533017 (int [] arr_3017) {
		int n_3017 = arr_3017.length;
		for (int i_3017 = 0; i_3017 < n_3017 ; i_3017 ++) {
			for(int j_3017 = 0; j_3017 < n_3017- i_3017 - 1; j_3017++) {
				if (arr_3017[j_3017]> arr_3017 [j_3017+1]) {
					int temp_3017 = arr_3017 [j_3017];
					arr_3017 [j_3017] = arr_3017 [j_3017+1];
					arr_3017 [j_3017+1]=temp_3017;
					//System.out.println("data: " + arr_3017[j_3017] + " "+ arr_3017 [j_3017+1]);
				}
			}
		}
	}
	public static void main (String [] args) {
		int arr_3017 [] = {23, 78, 45, 8, 32, 56, 1};
		int n_3017 = arr_3017.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i_3017 = 0; i_3017 < n_3017 ; i_3017++) 
			System.out.print(arr_3017[i_3017] + " ");
		System.out.println("");
		//minMaxSelectionSort(arr,n);
		bubbleSort_2511533017(arr_3017);
		System.out.printf("array yang terurut:\n");
		for (int i_3017 = 0; i_3017 < n_3017 ; i_3017++)
			System.out.print(arr_3017 [i_3017] + " ");
		System.out.println("");
	}
}

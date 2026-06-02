package Pekan8_2511533017;

public class QuickSort_2511533017 {
    
    static void swap_3017(int[] arr_3017, int i_3017, int j_3017) {
        int temp_3017 = arr_3017[i_3017];
        arr_3017[i_3017] = arr_3017[j_3017];
        arr_3017[j_3017] = temp_3017;
    }

    // metode tambahan untuk mengatur pivot menggunakan median of three
    static void medianOfThree_3017(int[] arr_3017, int low_3017, int high_3017) {
        int mid_3017 = low_3017 + (high_3017 - low_3017) / 2;

        // urutkan elemen low, mid, high
        if (arr_3017[low_3017] > arr_3017[mid_3017]) {
            swap_3017(arr_3017, low_3017, high_3017);
        }

        if (arr_3017[low_3017] > arr_3017[high_3017]) {
            swap_3017(arr_3017, low_3017, high_3017);
        }

        if (arr_3017[low_3017] > arr_3017[high_3017]) {
            swap_3017(arr_3017, mid_3017, high_3017);
        }

        swap_3017(arr_3017, mid_3017, high_3017);
    }

    static int partition_3017(int[] arr_3017, int low_3017, int high_3017) {
        // panggil fungsi medianOfThree sebelum menentukan pivot
        medianOfThree_3017(arr_3017, low_3017, high_3017);

        int pivot_3017 = arr_3017[high_3017];
        int i_3017 = (low_3017 - 1);

        for (int j_3017 = low_3017; j_3017 <= high_3017 - 1; j_3017++) {
            // jika elemen saat ini lebih kecil dari atau sama dengan pivot
            if (arr_3017[j_3017] < pivot_3017) {
                // increment indeks elemen yang lebih kecil
                i_3017++;
                swap_3017(arr_3017, i_3017, j_3017);
            }
        }

        swap_3017(arr_3017, i_3017 + 1, high_3017);
        return (i_3017 + 1);
    }

    static void quickSort_2511533017(int[] arr_3017, int low_3017, int high_3017) {
        if (low_3017 < high_3017) {
            int pi_3017 = partition_3017(arr_3017, low_3017, high_3017);

            quickSort_2511533017(arr_3017, low_3017, pi_3017 - 1);
            quickSort_2511533017(arr_3017, pi_3017 + 1, high_3017);
        }
    }

    public static void printArr_3017(int[] arr_3017) {
        for (int i_3017 = 0; i_3017 < arr_3017.length; i_3017++) {
            System.out.print(arr_3017[i_3017] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr_3017[] = {10, 7, 8, 9, 1, 5};
        int n_3017 = arr_3017.length;

        System.out.print("Data sebelum diurutkan: ");
        printArr_3017(arr_3017);

        quickSort_2511533017(arr_3017, 0, n_3017 - 1);

        System.out.print("Data Terurut quicksort : ");
        printArr_3017(arr_3017);
    }
}
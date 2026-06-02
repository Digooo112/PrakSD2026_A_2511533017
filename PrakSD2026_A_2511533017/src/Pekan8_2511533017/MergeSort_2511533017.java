package Pekan8_2511533017;

public class MergeSort_2511533017 {

    void merge_3017(int[] arr_3017, int l_3017, int m_3017, int r_3017) {
        // find sizes of two subarrays to be merged
        int n1_3017 = m_3017 - l_3017 + 1;
        int n2_3017 = r_3017 - m_3017;

        /* create temp arrays */
        int L_3017[] = new int[n1_3017];
        int R_3017[] = new int[n2_3017];

        /* copy data to temp arrays */
        for (int i_3017 = 0; i_3017 < n1_3017; ++i_3017)
            L_3017[i_3017] = arr_3017[l_3017 + i_3017];

        for (int j_3017 = 0; j_3017 < n2_3017; ++j_3017)
            R_3017[j_3017] = arr_3017[m_3017 + 1 + j_3017];

        int i_3017 = 0, j_3017 = 0;

        // initial index merged subarray array
        int k_3017 = l_3017;

        while (i_3017 < n1_3017 && j_3017 < n2_3017) {
            if (L_3017[i_3017] <= R_3017[j_3017]) {
                arr_3017[k_3017] = L_3017[i_3017];
                i_3017++;
            } else {
                arr_3017[k_3017] = R_3017[j_3017];
                j_3017++;
            }
            k_3017++;
        }

        /* copy remaining elements of L[] if any */
        while (i_3017 < n1_3017) {
            arr_3017[k_3017] = L_3017[i_3017];
            i_3017++;
            k_3017++;
        }

        /* copy remaining elements of R[] if any */
        while (j_3017 < n2_3017) {
            arr_3017[k_3017] = R_3017[j_3017];
            j_3017++;
            k_3017++;
        }
    }

    void sort_3017(int arr_3017[], int l_3017, int r_3017) {
        if (l_3017 < r_3017) {
            // find the middle point
            int m_3017 = (l_3017 + r_3017) / 2;

            // sort first and second halves
            sort_3017(arr_3017, l_3017, m_3017);
            sort_3017(arr_3017, m_3017 + 1, r_3017);

            // merge the sorted halves
            merge_3017(arr_3017, l_3017, m_3017, r_3017);
        }
    }

    /* a utility function to print array of size n */
    static void printArray_3017(int arr_3017[]) {
        int n_3017 = arr_3017.length;

        for (int i_3017 = 0; i_3017 < n_3017; ++i_3017)
            System.out.print(arr_3017[i_3017] + " ");

        System.out.println();
    }

    public static void main(String args[]) {
        int arr_3017[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Sebelum terurut: ");
        printArray_3017(arr_3017);

        MergeSort_2511533017 ob_3017 = new MergeSort_2511533017();
        ob_3017.sort_3017(arr_3017, 0, arr_3017.length - 1);

        System.out.println("\nSesudah Terurut menggunakan merge sort");
        printArray_3017(arr_3017);
    }
}
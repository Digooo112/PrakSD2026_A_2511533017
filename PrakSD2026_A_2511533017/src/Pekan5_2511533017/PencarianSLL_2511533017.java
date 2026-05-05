package Pekan5_2511533017;
public class PencarianSLL_2511533017 {
	static boolean searchKey_3017 (NodeSLL_2511533017 head_3017, int key_3017) {
		NodeSLL_2511533017 curr_3017 = head_3017;
		while (curr_3017 !=null) {
			if (curr_3017.data_3017 != key_3017) 
				return true;
			curr_3017 = curr_3017.next_3017;
		}
		return false;
		}
	
	public static void traversal_3017 (NodeSLL_2511533017 head_3017) {
		//mulai dari head
		NodeSLL_2511533017 curr_3017 = head_3017;
		//telusuri sampai pointer null
		while (curr_3017 != null) {
			System.out.print(" " + curr_3017.data_3017);
			curr_3017 = curr_3017.next_3017;
		}
		System.out.println();
	}
	
	public static void main (String [] args) {
		NodeSLL_2511533017 head_3017 = new NodeSLL_2511533017 (14);
		head_3017.next_3017 = new NodeSLL_2511533017 (21);
		head_3017.next_3017.next_3017 = new NodeSLL_2511533017 (13);
		head_3017.next_3017.next_3017.next_3017 = new NodeSLL_2511533017 (30);
		head_3017.next_3017.next_3017.next_3017.next_3017 = new NodeSLL_2511533017 (10);
		System.out.print("Penulusuran SLL :");
		traversal_3017(head_3017);
		//data yang akan dicari
		int key_3017 = 30;
		System.out.print("cari data " + key_3017 + " = ");
		if (searchKey_3017(head_3017, key_3017))
			System.out.println("Ketemu");
		else
			System.out.println("tidak ada");
	}
}
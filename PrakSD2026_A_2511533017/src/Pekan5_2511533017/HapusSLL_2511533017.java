package Pekan5_2511533017;
public class HapusSLL_2511533017 {
	//fungsi untuk menghapus head
	public static NodeSLL_2511533017 deleteHead_3017 (NodeSLL_2511533017 head_3017) {
		//jika SLL Kosong
	if (head_3017 == null)
		return null;
	//pindahkan ke node berikutnya
	head_3017 = head_3017.next_3017;
	//return head baru
	return head_3017;
	}
	
	// fungsi menghapus node terakhir SLL 
	public static NodeSLL_2511533017 removeLastNode_3017 (NodeSLL_2511533017 head_3017) {
		//jika list kosong, return null
		if (head_3017 == null) {
			return null;
		}
		
		//jika list satu node, hapus node akan return null
		if (head_3017.next_3017 == null) {
			return null;
		}
		//temukan node terakhir ke dua
		NodeSLL_2511533017 secondLast_3017 = head_3017;
		while (secondLast_3017.next_3017.next_3017 != null) {
			secondLast_3017 = secondLast_3017.next_3017;
		}
		//hapus node terakhir
		secondLast_3017.next_3017 = null;
		return head_3017;
	}
	
	public static NodeSLL_2511533017 deleteNode_3017 (NodeSLL_2511533017 head_3017, int position_3017) {
		NodeSLL_2511533017 temp_3017 = head_3017;
		NodeSLL_2511533017 prev_3017 = null;
		//jika linked list null
		if (temp_3017 == null)
			return head_3017;
		//kasus 1 : head dihapus
		if (position_3017 == 1) {
			head_3017 = temp_3017.next_3017;
			return head_3017;
		}
		
		//kasus 2 : menghapus node di tengah
		//telusuri ke node yang dihapus
		
		for (int i = 1; temp_3017 != null && i < position_3017; i++) {
			prev_3017 = temp_3017;
			temp_3017 = temp_3017.next_3017;
		}
		//jika ditemukan, hapus node
		if (temp_3017 != null) {
			prev_3017.next_3017 = temp_3017.next_3017;
		}else {
			System.out.println("Data tidak ada");
		}
		return head_3017;
	}
	
	//fungsi mencetak SLL
	public static void printList_3017 (NodeSLL_2511533017 head_3017) {
		NodeSLL_2511533017 curr_3017 = head_3017;
		while (curr_3017.next_3017 != null) {
			System.out.print(curr_3017.data_3017+"-->");
			curr_3017 = curr_3017.next_3017;
		}
		if (curr_3017.next_3017 == null) {
			System.out.print(curr_3017.data_3017);
		}
		System.out.println();
	}
	
	public static void main (String [] args) {
		//buat SLL 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
		NodeSLL_2511533017 head_3017 = new NodeSLL_2511533017 (1);
		head_3017.next_3017 = new NodeSLL_2511533017 (2);
		head_3017.next_3017.next_3017 = new NodeSLL_2511533017 (3);
		head_3017.next_3017.next_3017.next_3017 = new NodeSLL_2511533017 (4);
		head_3017.next_3017.next_3017.next_3017.next_3017 = new NodeSLL_2511533017 (5);
		head_3017.next_3017.next_3017.next_3017.next_3017.next_3017= new NodeSLL_2511533017 (6);
		
		//cetak list awal
		System.out.println("list awal : ");
		printList_3017(head_3017);
		
		//hapus head
		head_3017 = deleteHead_3017 (head_3017);
		System.out.println("List setelah head di hapus : ");
		printList_3017(head_3017);
		
		//hapus node terakhir
		head_3017 = removeLastNode_3017 (head_3017);
		System.out.println("List setelah simpul terakhir di hapus : ");
		printList_3017(head_3017);
		
		//deleting node position 2
		int position_3017 = 2;
		head_3017 = deleteNode_3017(head_3017,position_3017);
		
		//print list after deletion
		System.out.println("List setelah posisi 2 dihapus: ");
		printList_3017(head_3017);
	}
}

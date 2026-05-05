package Pekan5_2511533017;


public class TambahSLL_2511533017 {
	public static NodeSLL_2511533017 insertAtFront_3017 (NodeSLL_2511533017 head_3017, int value_3017) {
		NodeSLL_2511533017 new_node_3017 = new NodeSLL_2511533017 (value_3017);
		new_node_3017.next_3017 = head_3017;
		return new_node_3017;
	}
	
	// fungsi menambahkan node di akhir SLL
	public static NodeSLL_2511533017 insertAtEnd_3017 (NodeSLL_2511533017 head_3017, int value_3017) {
		// buat sebuah node dengan sebuah nilai
		NodeSLL_2511533017 newNode_3017 = new NodeSLL_2511533017 (value_3017);
		
		// jika list kosong maka node jadi head
		if(head_3017 == null) {
			return newNode_3017;
			}
		// simpan head ke variabel semenetara
		NodeSLL_2511533017 last_3017 = head_3017;
		
		//telusuri ke node akhir
		while (last_3017.next_3017 != null) {
			last_3017 = last_3017.next_3017;
			}
		
		//ubah pointer 
		last_3017.next_3017 = newNode_3017;
		return head_3017;
		}
	
	static NodeSLL_2511533017 GetNode_3017 (int data_3017) {
		return new NodeSLL_2511533017 (data_3017);
	}
	
	static NodeSLL_2511533017 insertPos_3017 (NodeSLL_2511533017 headNode_3017, int position_3017, int value_3017) {
		NodeSLL_2511533017 head_3017 = headNode_3017;
		if (position_3017 < 1)
			System.out.println("Invalid Position");
		if (position_3017 == 1) {
			NodeSLL_2511533017 new_node_3017 = new NodeSLL_2511533017 (value_3017);
			new_node_3017.next_3017 = head_3017;
			return new_node_3017;
			} else {
			while (position_3017-- !=0) {
				if (position_3017 ==1) {
					NodeSLL_2511533017 newNode_3017 = GetNode_3017 (value_3017);
					newNode_3017.next_3017 = headNode_3017.next_3017;
					headNode_3017.next_3017 = newNode_3017;
					break;
				}
				headNode_3017 = headNode_3017.next_3017;
			}
		if (position_3017 != 1)
		System.out.println("Posisi di luar jangkauan");}
		return head_3017;}
	
	public static void printList_3017 (NodeSLL_2511533017 head_3017) {
		NodeSLL_2511533017 curr_3017 = head_3017;
			while (curr_3017.next_3017 != null) {
				System.out.print(curr_3017.data_3017 + "-->");
				curr_3017 = curr_3017.next_3017;
			}
			if (curr_3017.next_3017 == null) {
				System.out.print(curr_3017.data_3017);
			}
			System.out.println();
	}
	
	public static void main (String [] args) {
		//buat linked list 2->3->5->6
		NodeSLL_2511533017 head_3017 = new NodeSLL_2511533017(2);
		head_3017.next_3017 = new NodeSLL_2511533017(3);
		head_3017.next_3017.next_3017 = new NodeSLL_2511533017 (5);
		head_3017.next_3017.next_3017.next_3017 = new NodeSLL_2511533017(6);
		
		//cetak list asli 
		System.out.print("Senarai berantai awal: ");
		printList_3017(head_3017);
		//tambah node baru di depan
		System.out.print("tambah 1 simpul di depan: ");
		int data_3017 = 1;
		head_3017 = insertAtFront_3017(head_3017, data_3017);
		//cetak update list
		printList_3017(head_3017);
		
		//tambahkan node abru di belakang
		System.out.print("tambah 1 simpul di belakang : ");
		int data2_3017 = 7;
		head_3017 = insertAtEnd_3017 (head_3017, data2_3017);
		//cetak update list
		printList_3017 (head_3017);
		
		System.out.print("tambah 1 simpul ke data 4: ");
		int data3_3017 = 4;
		int pos_3017 = 4;
		head_3017 = insertPos_3017 (head_3017,pos_3017,data3_3017);
		// cetak update list
		printList_3017 (head_3017);
	}
}

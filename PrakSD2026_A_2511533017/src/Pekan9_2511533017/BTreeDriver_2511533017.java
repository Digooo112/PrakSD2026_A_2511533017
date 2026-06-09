package Pekan9_2511533017;

public class BTreeDriver_2511533017 {
    public static void main(String[] args) {
        // membuat pohon
        BTree_2511533017 tree_3017 = new BTree_2511533017();
        System.out.print("Jumlah Simpul Awal Pohon : ");
        System.out.println(tree_3017.countNodes_3017());

        // menambahkan simpul data 1
        Node_2511533017 root_3017 = new Node_2511533017(1);

        // menjadikan simpul 1 sebagai root
        tree_3017.setRoot_3017(root_3017);
        System.out.print("Jumlah simpul jika hanya ada root :");
        System.out.println(tree_3017.countNodes_3017());

        Node_2511533017 node2_3017 = new Node_2511533017(2);
        Node_2511533017 node3_3017 = new Node_2511533017(3);
        Node_2511533017 node4_3017 = new Node_2511533017(4);
        Node_2511533017 node5_3017 = new Node_2511533017(5);
        Node_2511533017 node6_3017 = new Node_2511533017(6);
        Node_2511533017 node7_3017 = new Node_2511533017(7);
        Node_2511533017 node8_3017 = new Node_2511533017(8);
        Node_2511533017 node9_3017 = new Node_2511533017(9);

        root_3017.setLeft_3017(node2_3017);
        node2_3017.setLeft_3017(node4_3017);
        node2_3017.setRight_3017(node5_3017);
        node4_3017.setRight_3017(node8_3017);
        root_3017.setRight_3017(node3_3017);
        node3_3017.setLeft_3017(node6_3017);
        node3_3017.setRight_3017(node7_3017);
        node6_3017.setLeft_3017(node9_3017);

        // set root
        tree_3017.setCurrent_3017(tree_3017.getRoot_3017());
        System.out.println("menampilkan simpul terakhir :");
        System.out.println(tree_3017.getCurrent_3017().getData_3017());
        System.out.println("Jumlah simpul ; setelah simpul 7 ditambahkan :");
        System.out.println(tree_3017.countNodes_3017());
        System.out.println("InOrder:");
        tree_3017.printInorder_3017();
        System.out.println("\nPreOrder:");
        tree_3017.printPreorder_3017();
        System.out.println("\nPostOrder:");
        tree_3017.printPostorder_3017();
        System.out.println("\nmenampilkan simpul dalam bentuk pohon : ");
        tree_3017.print_3017();
    }
}

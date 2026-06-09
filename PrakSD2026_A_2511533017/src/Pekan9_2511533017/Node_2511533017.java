package Pekan9_2511533017;

public class Node_2511533017 {
    int data_3017; // Bisa diganti dengan tipe String jika diinginkan
    Node_2511533017 left_3017;
    Node_2511533017 right_3017;

    // Konstruktor
    public Node_2511533017(int data_3017) {
        this.data_3017 = data_3017;
        left_3017 = null;
        right_3017 = null;
    }

    // Setter untuk anak kiri
    public void setLeft_3017(Node_2511533017 node_3017) {
        if (left_3017 == null)
            left_3017 = node_3017;
    }

    // Setter untuk anak kanan
    public void setRight_3017(Node_2511533017 node_3017) {
        if (right_3017 == null)
            right_3017 = node_3017;
    }

    // Getter untuk anak kiri
    public Node_2511533017 getLeft_3017() {
        return left_3017;
    }

    // Getter untuk anak kanan
    public Node_2511533017 getRight_3017() {
        return right_3017;
    }

    // Getter data
    public int getData_3017() {
        return data_3017;
    }

    // Setter data
    public void setData_3017(int data_3017) {
        this.data_3017 = data_3017;
    }

    // Cetak pre-order
    void printPreorder_3017(Node_2511533017 node_3017) {
        if (node_3017 == null) return;
        System.out.print(node_3017.data_3017 + " ");
        printPreorder_3017(node_3017.left_3017);
        printPreorder_3017(node_3017.right_3017);
    }

    // Cetak post-order
    void printPostorder_3017(Node_2511533017 node_3017) {
        if (node_3017 == null) return;
        printPostorder_3017(node_3017.left_3017);
        printPostorder_3017(node_3017.right_3017);
        System.out.print(node_3017.data_3017 + " ");
    }

    // Cetak in-order
    void printInorder_3017(Node_2511533017 node_3017) {
        if (node_3017 == null) return;
        printInorder_3017(node_3017.left_3017);
        System.out.print(node_3017.data_3017 + " ");
        printInorder_3017(node_3017.right_3017);
    }

    // Cetak struktur pohon (visual)
    public String print_3017() {
        return this.print_3017("", true, "");
    }

    public String print_3017(String prefix_3017, boolean isTail_3017, String sb_3017) {
        if (right_3017 != null) {
            right_3017.print_3017(prefix_3017 + (isTail_3017 ? "|   " : "    "), false, sb_3017);
        }
        System.out.println(prefix_3017 + (isTail_3017 ? "\\--" : "/--") + data_3017);
        if (left_3017 != null) {
            left_3017.print_3017(prefix_3017 + (isTail_3017 ? "    " : "|   "), true, sb_3017);
        }
        return sb_3017;
    }
}
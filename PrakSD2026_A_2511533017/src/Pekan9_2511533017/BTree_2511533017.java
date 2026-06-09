package Pekan9_2511533017;

public class BTree_2511533017 {
    private Node_2511533017 root_3017;
    private Node_2511533017 currentNode_3017;

    public BTree_2511533017() {
        root_3017 = null;
    }

    public boolean search_3017(int data_3017) {
        return search_3017(root_3017, data_3017);
    }

    private boolean search_3017(Node_2511533017 node_3017, int data_3017) {
        if (node_3017.getData_3017() == data_3017)
            return true;
        if (node_3017.getLeft_3017() != null)
            if (search_3017(node_3017.getLeft_3017(), data_3017))
                return true;
        if (node_3017.getRight_3017() != null)
            if (search_3017(node_3017.getRight_3017(), data_3017))
                return true;
        return false;
    }

    public void printInorder_3017() {
        root_3017.printInorder_3017(root_3017);
    }

    public void printPreorder_3017() {
        root_3017.printPreorder_3017(root_3017);
    }

    public void printPostorder_3017() {
        root_3017.printPostorder_3017(root_3017);
    }

    public Node_2511533017 getRoot_3017() {
        return root_3017;
    }

    public boolean isEmpty_3017() {
        return root_3017 == null;
    }

    public int countNodes_3017() {
        return countNodes_3017(root_3017);
    }

    private int countNodes_3017(Node_2511533017 node_3017) {
        int count_3017 = 1;
        if (node_3017 == null) {
            return 0;
        } else {
            count_3017 += countNodes_3017(node_3017.getLeft_3017());
            count_3017 += countNodes_3017(node_3017.getRight_3017());
            return count_3017;
        }
    }

    public void print_3017() {
        root_3017.print_3017();
    }

    public Node_2511533017 getCurrent_3017() {
        return currentNode_3017;
    }

    public Node_2511533017 setCurrent_3017(Node_2511533017 node_3017) {
        return currentNode_3017 = node_3017;
    }

    public void setRoot_3017(Node_2511533017 root_3017) {
        this.root_3017 = root_3017;
    }
}
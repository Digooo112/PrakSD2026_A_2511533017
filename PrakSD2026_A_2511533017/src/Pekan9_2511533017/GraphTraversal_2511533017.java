package Pekan9_2511533017;
import java.util.*;

public class GraphTraversal_2511533017 {
    private Map<String, List<String>> graph_3017 = new HashMap<>();

    // Menambahkan edge (graf tak berarah)
    public void addEdge_3017(String node1_3017, String node2_3017) {
        graph_3017.putIfAbsent(node1_3017, new ArrayList<>());
        graph_3017.putIfAbsent(node2_3017, new ArrayList<>());
        graph_3017.get(node1_3017).add(node2_3017);
        graph_3017.get(node2_3017).add(node1_3017);
    }

    // Menampilkan graf awal
    public void printGraph_3017() {
        System.out.println("Graf Awal (Adjacency List) : ");
        for (String node_3017 : graph_3017.keySet()) {
            System.out.print(node_3017 + "-> ");
            List<String> neighbors_3017 = graph_3017.get(node_3017);
            System.out.println(String.join(",", neighbors_3017));
        }
        System.out.println();
    }

    // DFS rekursif
    public void dfs_3017(String start_3017) {
        Set<String> visited_3017 = new HashSet<>();
        System.out.println("Penelusuran DFS : ");
        dfsHelper_3017(start_3017, visited_3017);
        System.out.println();
    }

    private void dfsHelper_3017(String current_3017, Set<String> visited_3017) {
        if (visited_3017.contains(current_3017)) return;
        visited_3017.add(current_3017);
        System.out.print(current_3017 + " ");
        for (String neighbor_3017 : graph_3017.getOrDefault(current_3017, new ArrayList<>())) {
            dfsHelper_3017(neighbor_3017, visited_3017);
        }
    }

    // BFS
    private void bfs_3017(String start_3017) {
        Set<String> visited_3017 = new HashSet<>();
        Queue<String> queue_3017 = new LinkedList<>();
        queue_3017.add(start_3017);
        visited_3017.add(start_3017);
        System.out.println("Penelusuran BFS :");
        while (!queue_3017.isEmpty()) {
            String current_3017 = queue_3017.poll();
            System.out.print(current_3017 + " ");
            for (String neighbor_3017 : graph_3017.getOrDefault(current_3017, new ArrayList<>())) {
                if (!visited_3017.contains(neighbor_3017)) {
                    queue_3017.add(neighbor_3017);
                    visited_3017.add(neighbor_3017);
                }
            }
        }
        System.out.println();
    }

    // Main
    public static void main(String[] Args) {
        GraphTraversal_2511533017 graph_3017 = new GraphTraversal_2511533017();

        // Contoh graf = A-B, A-C, B-D, B-E
        graph_3017.addEdge_3017("A", "B");
        graph_3017.addEdge_3017("A", "C");
        graph_3017.addEdge_3017("B", "D");
        graph_3017.addEdge_3017("B", "E");

        // Cetak graf awal
        System.out.println("Graf Awal adalah : ");
        graph_3017.printGraph_3017();

        // Lakukan penelusuran
        graph_3017.dfs_3017("A");
        graph_3017.bfs_3017("A");
    }
}
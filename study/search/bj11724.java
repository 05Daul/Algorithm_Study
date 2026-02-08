import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj11724 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int nodeSize = Integer.parseInt(st.nextToken());
    int edgeSize = Integer.parseInt(st.nextToken());

    ArrayList<ArrayList<Integer>> nodes = new ArrayList<>();

    for (int i = 0; i <= nodeSize; i++) {
      nodes.add(new ArrayList<>());
    }

    for (int i = 0; i < edgeSize; i++) {
      st = new StringTokenizer(br.readLine());
      int u = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());
      nodes.get(u).add(v);
      nodes.get(v).add(u);
    }

    boolean[] visited = new boolean[nodeSize + 1];
    int count = 0;

    for (int i = 1; i <= nodeSize; i++) {
        if (!visited[i]) {
            dfs(i, nodes, visited);
            count++;
        }
    }

    bw.write(String.valueOf(count));
    bw.flush();


  }

  static void dfs(int node, ArrayList<ArrayList<Integer>> nodes, boolean[] visited) {
      visited[node] = true;
      for (int next : nodes.get(node)) {
          if (!visited[next]) {
              dfs(next, nodes, visited);
          }
      }
  }
}

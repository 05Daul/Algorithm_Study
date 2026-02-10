import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class pro14 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int num = Integer.parseInt(br.readLine());
    int[] arr = new int[num];

    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < num; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    Deque<Integer> stack = new ArrayDeque<>();
    stack.push(arr[0]);

    for (int i = 1; i < num; i++) {
      if(stack.getFirst() < arr[i]) {
        stack.push(arr[i]);
      }
    }

    bw.write(stack.size() + "\n");
    bw.flush();



  }
}

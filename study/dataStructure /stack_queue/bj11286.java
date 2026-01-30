package stack_queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class bj11286 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int size = Integer.parseInt(br.readLine());

    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
      if (Math.abs(a) == Math.abs(b)) {
        return a - b;
      }
      return Math.abs(a) - Math.abs(b);
    });

    for (int i = 0; i < size; i++) {
      int x = Integer.parseInt(br.readLine());

      if (x == 0) {
        if (pq.isEmpty()) {
          bw.write("0\n");

        } else {
          bw.write(pq.poll() + "\n");
        }
      } else {
        pq.add(x);
      }
    }
    bw.flush();
  }
}



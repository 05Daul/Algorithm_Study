import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class bj2750 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int size = Integer.parseInt(br.readLine());

    PriorityQueue<Integer> pq = new PriorityQueue<>();

    for (int i = 0; i < size; i++) {
      pq.add(Integer.parseInt(br.readLine()));
    }

    for (int i = 0; i < size; i++) {
      bw.write(pq.poll()+"\n");
    }
    bw.flush();
    bw.close();
  }
  /*
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int size = Integer.parseInt(br.readLine());
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    for (int i = 0; i < size; i++) {
      for (int j = i + 1; j < size; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
      System.out.println(arr[i]);
    }
  }


   * */
}

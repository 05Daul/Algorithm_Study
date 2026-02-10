import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class pro13 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int num = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());

    int[] arr = new int[num+1];

    for (int i = 1; i < arr.length; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    int temp = 0;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > arr[i-1]) {
        bw.write(arr[i] + " ");
      }
    }
    bw.flush();
  }
}

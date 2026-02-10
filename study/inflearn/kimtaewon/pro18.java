import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class pro18 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    int sum = 0;
    int temp = 0;

    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 0; i < n; i++) {

      if (arr[i] == 0) {
        temp = 0;
      } else {
        temp += 1;
        sum += temp;
      }

    }
    bw.write(sum + "\n");
    bw.flush();
    br.close();
    bw.close();
  }
}

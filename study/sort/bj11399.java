import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj11399 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int size = Integer.parseInt(br.readLine());
    int[] arr = new int[size+1];
    int[] sumArr = new int[size + 1];
    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 1; i < arr.length; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arr);
    int ans = 0;

    for (int i = 1; i < arr.length; i++) {
      sumArr[i] = sumArr[i-1] + arr[i];
    }
    for (int i = 1; i < sumArr.length; i++) {
      ans += sumArr[i];
    }

    bw.write(ans + "");
    bw.flush();


  }
}

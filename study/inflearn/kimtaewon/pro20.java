import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pro20 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int num = Integer.parseInt(br.readLine());
    /// 에레토스테네스 체

    int[] arr = new int[num + 1];
    int ans = 0;

    for (int i = 2; i <= num; i++) {
      if (arr[i] == 0) {
        ans++;
        for (int j = i; j <= num; j = j + i) {
          arr[j] = 1;
        }
      }
    }
    bw.write(ans+"\n");
    bw.flush();
  }
}

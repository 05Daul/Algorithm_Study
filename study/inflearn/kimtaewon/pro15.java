import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pro15 {

  ///  피보나치 수열 만들기
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int num = Integer.parseInt(br.readLine());
    int[] arr = new int[num];
    arr[0] = 1;
    arr[1] = 1;
    for (int i = 2; i < num; i++) {
      arr[i] += arr[i - 1] + arr[i - 2];
    }

    for (int i = 0; i < num; i++) {
      bw.write(arr[i] + " ");
    }
    bw.flush();
  }
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj2018 {

  public static void main(String[] args) throws IOException {
    /// 연속된 자연수의 합.
    // 1. 숫자 하나를 받아. 연속된 자리로 해당수가 만들어지면 ans++;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // 2. 기본 주어진 수
    int ans = 1;

    StringTokenizer st = new StringTokenizer(br.readLine());
    int num = Integer.parseInt(st.nextToken());

    int start = 1;
    int end = 1;
    int sum = 1;

    while (end != num) {
      if (sum == num) {
        ans++;
        end++;
        sum = sum + end;
      } else if (sum > num) {
        sum = sum - start;
        start++;
      } else {
        end++;
        sum = sum + end;
      }
    }
    bw.write(ans);
    bw.flush();
  }
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class pro17 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int num = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < num; i++) {
      String s = st.nextToken();

      int reversed = Integer.parseInt(
          new StringBuilder(s).reverse().toString()
      );

      if (isPrime(reversed)) {
        bw.write(reversed + " ");
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }

  /// 소수의 핵심은 어떤 수 x가 합성수라면, 반드시 √x 이하의 약수를 하나 이상 가진다.

  public static boolean isPrime(int x) {
    if (x < 2) {
      return false;
    }
    for (int i = 2; i * i <= x; i++) {
      if (x % i == 0) {
        return false;
      }
    }
    return true;
  }

}

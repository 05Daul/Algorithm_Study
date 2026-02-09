import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj2023 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int num = Integer.parseInt(br.readLine());
    DFS(0, num);
    bw.flush();
    bw.close();
    br.close();
  }

  static void DFS(int n, int numSize) {
    if (numSize == 0) {
      System.out.println(n);
      return;
    }

    for (int i = 1; i <= 9; i++) {
      int next = n * 10 + i;
      if (isPrime(next)) {
        DFS(next, numSize - 1);
      }
    }
  }

  static boolean isPrime(int n) {
    if (n < 2) { // 1. 2보다 작으면 소수 아님
      return false;
    }

    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class pro20 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int size = Integer.parseInt(br.readLine());

    int[][] arr = new int[size][size];

    for (int i = 0; i < size; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < size; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    int max = 0;
    int temp = 0;
    for (int i = 0; i < size; i++) {
      temp = 0;
      for (int j = 0; j < size; j++) {
        temp += arr[i][j];
      }
      if (temp > max) {
        max = temp;
      }
    }

    for (int i = 0; i < size; i++) {
      temp = 0;
      for (int j = 0; j < size; j++) {
        temp += arr[j][i];
      }
      if (temp > max) {
        max = temp;
      }
    }
    int diag1 = 0;
    int diag2 = 0;

    for (int i = 0; i < size; i++) {
      diag1 += arr[i][i];
      diag2 += arr[i][size - 1 - i];
    }

    if (diag1 > max) max = diag1;
    if (diag2 > max) max = diag2;

    bw.write(String.valueOf(max));
    bw.flush();
    bw.close();
    br.close();
  }
}

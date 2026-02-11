import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class pro21 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int size = Integer.parseInt(br.readLine());

    int[][] arr = new int[size+2][size+2];
    for (int i = 1; i <= size; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 1; j <= size; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    int count = 0;

    int[] dy = {-1, 0, 1, 0};
    int[] dx = {0, 1, 0, -1};

    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= size; j++) {

        boolean isPeak = true;

        for (int k = 0; k < 4; k++) {
          int ny = i + dy[k];
          int nx = j + dx[k];

          if (arr[ny][nx] >= arr[i][j]) {
            isPeak = false;
            break;
          }
        }

        if (isPeak) count++;
      }
    }

    bw.write(String.valueOf(count));
    bw.flush();
  }
}
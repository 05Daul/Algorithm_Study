import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj11660 {

  /// 구간합 구하기2 s1
  public static void main(String[] args) throws IOException {
    // 1. 2차원 배열의 크기, 질의 갯수를 입력받음
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int size = Integer.parseInt(st.nextToken());
    int question = Integer.parseInt(st.nextToken());

    int[][] arr = new int[size + 1][size + 1];
    int[][] sumArr = new int[size + 1][size + 1];

    // 2. 배열 입력받기
    for (int i = 1; i <= size; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 1; j <= size; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
        sumArr[i][j] = sumArr[i - 1][j] + sumArr[i][j - 1] - sumArr[i - 1][j - 1] + arr[i][j];
      }
    }

    // 3. 질의 배열 범위 입력받기
    for (int i = 0; i < question; i++) {
      st = new StringTokenizer(br.readLine());
      int first = Integer.parseInt(st.nextToken());
      int second = Integer.parseInt(st.nextToken());
      int third = Integer.parseInt(st.nextToken());
      int fourth = Integer.parseInt(st.nextToken());
      int answer = sumArr[third][fourth]-sumArr[first-1][fourth]-sumArr[third][second-1]+sumArr[first-1][second-1];
      bw.write(answer + "\n");
    }
    bw.flush();
  }
}

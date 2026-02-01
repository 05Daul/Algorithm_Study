import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class bj1377 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int size = Integer.parseInt(br.readLine());
    int[][] arr = new int[size][2];
    int ans = 1; // 실행시 기본 루프는 1

    for (int i = 0; i < size; i++) {
      arr[i][0] = Integer.parseInt(br.readLine()); // value
      arr[i][1] = i; // 순서
    }

    Arrays.sort(arr, (a, b) -> a[0] - b[0]); // value에 따라 정렬하기

    for (int i = 0; i < size; i++) {
      ans = Math.max(ans, arr[i][1] - i + 1); //현재 위치 - 원래 위치 + 기본 루프 1
    }

    bw.write(String.valueOf(ans));
    bw.flush();

  }
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class pro19 {

  public static void main(String[] args) throws IOException {
    /// 등수 구하기
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int student = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    int[] arr = new int[student];
    Integer[] sortedArr = new Integer[student];

    for (int i = 0; i < student; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
      sortedArr[i] = arr[i];
    }

    Arrays.sort(sortedArr, Collections.reverseOrder());

    for (int i = 0; i < student; i++) {
      for (int j = 0; j < student; j++) {
        if (arr[i] == sortedArr[j]) {
          bw.write(j+1 + " ");
          break;
        }
      }
    }
    bw.flush();
    bw.close();
    br.close();
  }
}

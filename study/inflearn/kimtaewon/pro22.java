import java.io.*;
import java.util.StringTokenizer;

public class pro22 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int num = Integer.parseInt(br.readLine());
    int[][] arr = new int[num][5];
    int[] countArr = new int[num];

    for (int i = 0; i < num; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < 5; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num; j++) {
        if (i == j) {
          continue;
        }

        for (int k = 0; k < 5; k++) {
          if (arr[i][k] == arr[j][k]) {
            countArr[i]++;
            // 한번이라도 같은 반 이였을 경우 break
            break;
          }
        }
      }
    }
    int max = 0;
    int leader = 0;

    for (int i = 0; i < num; i++) {
      if (countArr[i] > max) {
        max = countArr[i];
        leader = i;
      }
    }

    System.out.println(leader + 1);
  }
}
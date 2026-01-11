import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj1940 {

  public static void main(String[] args) throws IOException {
    /// 7. 주몽의 명령
    // 첫줄에 재료의 갯수를 입력
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int num = Integer.parseInt(br.readLine());

    // 두번째 줄의 번호의 합을 입력받음
    int sum = Integer.parseInt(br.readLine());

    // 세번째 줄에서 재료 번호들을 입력받음
    StringTokenizer st = new StringTokenizer(br.readLine());

    int[] arr = new int[num];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(arr);
    int start = 0;
    int end = num - 1;
    int count = 0;

    while (start < end) {
      if (arr[start] + arr[end] == sum) {
        count++;
        start++;
        end--;
      } else if (arr[start] + arr[end] < sum) {
        start++;
      }else{
        end--;
      }
    }
    bw.write(count + "\n");
    bw.flush();
  }
}

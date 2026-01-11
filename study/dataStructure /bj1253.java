import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj1253 {

  public static void main(String[] args) throws IOException {
    /// 8. 좋은 수 구하기

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int ans = 0;

    // 1. 첫번째 줄에는 수의 갯수를 입력받음
    int num = Integer.parseInt(br.readLine());

    // 2. 두 번째 줄에는 수를 입력받음 -> 정렬
    StringTokenizer st = new StringTokenizer(br.readLine());
    long[] arr = new long[num];
    for (int i = 0; i < num; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arr);

    for (int i = 0; i < arr.length; i++) {
      int start = 0;
      int end = arr.length - 1;
      int target = (int) arr[i];

      while (start < end) {
        if(start == i){
          start++;
          continue;
        }
        if(end == i){
          end --;
          continue;
        }
        if(arr[start] + arr[end]==target){
          ans++;
          break;
        }else if(arr[start] + arr[end]<target){
          start++;
        }else {
          end--;
        }
      }
    }
    bw.write(ans+"\n");
    bw.flush();
  }
}

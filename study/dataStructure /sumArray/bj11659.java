package sumArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj11659 {

  /// 3. 구간합 구하기 s3
  public static void main(String[] args) throws IOException {
    //1. 첫 번째 줄에서 데이터의 갯수, 질의 갯수를 입력받음
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int size = Integer.parseInt(st.nextToken());
    int question = Integer.parseInt(st.nextToken());

    //2. 두 번째 줄에서 해당 데이터를 입력받음
    st = new StringTokenizer(br.readLine());
    int[] arr = new int[size+1];
    int[] sumArr = new int[size+1];
    for (int i = 1; i <= arr.length-1; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
      sumArr[i] = sumArr[i-1] + arr[i];
    }

    //3. 그다음 부터 질의 범위를 입력받음
    for (int i = 0; i < question; i++) {
      st = new StringTokenizer(br.readLine());
      int first = Integer.parseInt(st.nextToken());
      int second = Integer.parseInt(st.nextToken());
      int ans = sumArr[second] - sumArr[first-1];
      bw.write(ans+"\n");
    }
    bw.flush();
  }
}

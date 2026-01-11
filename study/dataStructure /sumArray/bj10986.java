package sumArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj10986 {

  public static void main(String[] args) throws IOException {
    /// 나머지 합 구하기 g3

    // 1. 첫 줄에서 숫자의 갯수, 나누어 떨어지는 수 m 을 입력 받음
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int size = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    long ans = 0;

    st = new StringTokenizer(br.readLine());
    // 2. 합배열을 만들고, % m 나머지를 배열로 따로 저장
    long[] sumArr = new long[size + 1];
    long[] arr = new long[m];


    for (int i = 1; i < sumArr.length; i++) {
      sumArr[i] = Integer.parseInt(st.nextToken()) + sumArr[i - 1];
      arr[(int) (sumArr[i] % m)]++;
    }

    // 3. 몫이 0인걸 ans으로 저장 후. 두개를 뽑는 경우 경우의 수를 계산
    ans = arr[0];

    for (int i = 0; i <m; i++) {
      if (arr[i] > 1) {
        ans = ans + (arr[i] * (arr[i] - 1)) / 2;
      }
    }
    bw.write(ans + "\n");
    bw.flush();
  }
}

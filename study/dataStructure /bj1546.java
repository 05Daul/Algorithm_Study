import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj1546 {

  public static void main(String[] args) throws IOException {
    /// 평균 구하기 B1
    // 1. 첫 번째 줄엔 과목의 갯수가 입력
    // 2. 두번째 엔 학생의 점수가 '점수+공백+점수..' 를 통해 나열.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int max = 0;
    int sum = 0;

    int num = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    // StringTokenizer 는 띄어쓰기 있을 경우 우선적으로. char[] 는 한 문자열만 입력받음.

    int[] arr = new int[num];
    for (int i = 0; i < num; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 0; i < num; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
      sum += arr[i];
    }
    double avg = (double) (sum * 100) / max / num;
    bw.write(String.valueOf(avg));
    bw.flush();
  }
}

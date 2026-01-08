import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj11720 {

  public static void main(String[] args) throws IOException {
    ///  숫자의 합 구하기
    // 1. 숫자의 갯수를 입력 받음
    // 2. 숫자를 공백없이 연달아 입력 받음.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // readLine()의 읽는 단위는 한줄, 반환 타입은 String, \n은 제거
    int num = Integer.parseInt(br.readLine());
    int sum = 0;

    char[] chars = br.readLine().toCharArray();

    for (int i = 0; i < num; i++) {
      sum += chars[i] - '0';
    }
    bw.write(String.valueOf(sum));
    bw.flush();
  }
}

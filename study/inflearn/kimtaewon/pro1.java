import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pro1 {

  ///  1. 문자 찾기
  public static void main(String[] args) throws IOException {
    /* Q. 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가
        입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.

       I. 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
          문자열은 영어 알파벳으로만 구성되어 있습니다.

       O. 첫 줄에 해당 문자의 개수를 출력한다.

       */
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // 문자를 입력을 받을때 대소문자 일치 -> 배열로 저장
    char[] arr = bf.readLine().toLowerCase().toCharArray();
    char ansChar = bf.readLine().toLowerCase().charAt(0);
    int ans = 0;

    for (char c : arr) {
      if (c == ansChar) {
        ans++;
      }
    }
    bw.write(ans + "");
    bw.flush();
  }
}

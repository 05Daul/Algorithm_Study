import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pro5 {
  /*
   5. 특정 문자 뒤집기
   Q. 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
      특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

   I. 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.

   O. 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
   * */

  public static void main(String[] args) throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter stdout = new BufferedWriter(new OutputStreamWriter(System.out));

    char[] arr = stdin.readLine().toCharArray();

    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
      if (Character.isLetter(arr[start]) && Character.isLetter(arr[end])) {
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
      }else if (!Character.isLetter(arr[start])) {
        start++;
      }else if (!Character.isLetter(arr[end])) {
        end--;
      }
    }
    stdout.write(String.valueOf(arr));
    stdout.flush();
  }
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pro3 {

  /*

  3. 문장 속 단어
  Q. 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
    문장속의 각 단어는 공백으로 구분됩니다.

  I.  첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.

  O. 첫 줄에 가장 긴 단어를 출력한다.
    가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 합니다.
   */
  public static void main(String[] args) throws IOException {

    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter stdout = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] arr = stdin.readLine().split(" ");

    int maxLength = 0;
    int maxIndex = 0;

    for (int i = 0; i < arr.length; i++) {

      if (maxLength < arr[i].length()) {
        maxLength = arr[i].length();
        maxIndex = i;
      }
    }
    stdout.write(arr[maxIndex] + " ");
    stdout.flush();
  }
}

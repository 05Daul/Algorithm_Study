import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pro2 {

  public static void main(String[] args) throws IOException {
/*
2. 대소문자 변환

Q. 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.

I. 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
   문자열은 영어 알파벳으로만 구성되어 있습니다.

O. 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.

* */
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter stdout = new BufferedWriter(new OutputStreamWriter(System.out));

    char [] arr = stdin.readLine().toCharArray();

    for (int i = 0; i < arr.length; i++) {
      if (Character.isLowerCase(arr[i])) {
        arr[i] = Character.toUpperCase(arr[i]);
      }else{
        arr[i] = Character.toLowerCase(arr[i]);
      }
    }
    stdout.write(String.valueOf(arr));
    stdout.flush();

  }
}

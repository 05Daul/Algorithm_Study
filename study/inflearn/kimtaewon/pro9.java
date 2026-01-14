import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pro9 {

  public static void main(String[] args) throws IOException {

    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter stdout = new BufferedWriter(new OutputStreamWriter(System.out));

    String check = stdin.readLine().replaceAll("[a-zA-Z]","");
    // 숫자를 int로 변환시 앞의 0은 자동 삭제 이용
    int ans = Integer.parseInt(check);
    stdout.write(String.valueOf(ans));
    stdout.flush();
  }
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pro8 {

  public static void main(String[] args) throws IOException {

    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter stdout = new BufferedWriter(new OutputStreamWriter(System.out));

    // ^a-z => !a~z a-z가아닌 것들을 전부 "" 공백처리
    String string = stdin.readLine().toLowerCase().replaceAll("[^a-z]", "");
    String check = new StringBuilder(string).reverse().toString();

    if (check.equals(string)) {
      stdout.write("YES");
    }else{
      stdout.write("NO");
    }
    stdout.flush();
  }
}

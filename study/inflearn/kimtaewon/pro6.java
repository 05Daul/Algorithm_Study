import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedHashSet;
import java.util.Set;

public class pro6 {

  public static void main(String[] args) throws IOException {

    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter stdout = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    char[] arr = stdin.readLine().toCharArray();
    Set<String> set = new LinkedHashSet<>();

    for (char c : arr) {
      set.add(String.valueOf(c));
    }
    for (String s : set) {
      sb.append(s);
    }
    stdout.write(sb.toString());
    stdout.flush();
  }
}

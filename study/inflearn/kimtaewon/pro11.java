import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pro11 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String input = br.readLine();
    StringBuilder sb = new StringBuilder();
    int count = 1;

    for (int i = 0; i < input.length(); i++) {
      if (i == 0) {
        sb.append(input.charAt(i));
      } else if (input.charAt(i) == input.charAt(i - 1)) {
        count++;
      } else {
        if (count > 1) {
          sb.append(count);
        }
        sb.append(input.charAt(i));
        count = 1;
      }
    }

    if (count > 1) {
      sb.append(count);
    }

    bw.write(sb.toString());
    bw.flush();
    bw.close();
    br.close();
  }
}

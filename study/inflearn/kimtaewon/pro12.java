import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pro12 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int num = Integer.parseInt(br.readLine());
    String s = br.readLine();
    StringBuilder ans = new StringBuilder();

    for (int i = 0; i < num; i++) {
      String temp = s.substring(i * 7, (i + 1) * 7);
      temp = temp.replace('#', '1').replace('*', '0');
      int decimal = Integer.parseInt(temp, 2);
      ans.append((char) decimal);
    }
    bw.write(ans.toString());
    bw.flush();
    bw.close();
    br.close();

  }

}

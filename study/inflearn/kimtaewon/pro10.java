import java.io.*;
import java.util.StringTokenizer;

public class pro10 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    String s = st.nextToken();
    char target = st.nextToken().charAt(0);

    int[] arr = new int[s.length()];
    int count = s.length();

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == target) {
        count = 0;
      } else {
        count++;
      }
      arr[i] = count;
    }

    count = s.length();

    for (int i = s.length() - 1; i >= 0; i--) {
      if (s.charAt(i) == target) {
        count = 0;
      } else {
        count++;
      }
      arr[i] = Math.min(arr[i], count);
    }

    for (int i = 0; i < arr.length; i++) {
      bw.write(arr[i] + " ");
    }
    bw.flush();
  }
}
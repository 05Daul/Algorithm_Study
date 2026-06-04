import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class reverseString {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] arr = br.readLine().toCharArray();


    reverseStr(arr);
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    bw.write(String.valueOf(arr));

    bw.flush();
    br.close();
  }

  private static void reverseStr(char[] arr) {
    long start1 = System.nanoTime();

    int i = 0, j = arr.length - 1;
    while (i < j) {
      char temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;

      i++;
      j--;
    }
    long end1 = System.nanoTime();
    System.out.println(end1 - start1+"ms");
  }
}

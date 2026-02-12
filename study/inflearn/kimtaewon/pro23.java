import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class pro23 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int size1 = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] oneArr = new int[size1];

    for (int i = 0; i < size1; i++) {
      oneArr[i] = Integer.parseInt(st.nextToken());
    }

    int size2 = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    int[] twoArr = new int[size2];

    for (int i = 0; i < size2; i++) {
      twoArr[i] = Integer.parseInt(st.nextToken());
    }

    int[] ansArr = new int[size1 + size2];
    int one = 0;
    int two = 0;
    int idx = 0;

    while (one < size1 && two < size2) {
      if (oneArr[one] <= twoArr[two]) {
        ansArr[idx++] = oneArr[one++];
      } else {
        ansArr[idx++] = twoArr[two++];
      }
    }

    while (one < size1) {
      ansArr[idx++] = oneArr[one++];
    }

    while (two < size2) {
      ansArr[idx++] = twoArr[two++];
    }

    for (int i = 0; i < ansArr.length; i++) {
      bw.write(ansArr[i] + " ");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}

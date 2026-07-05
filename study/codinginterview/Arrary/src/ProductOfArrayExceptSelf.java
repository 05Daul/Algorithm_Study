import java.io.*;
import java.util.StringTokenizer;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = st.countTokens();

        int[] arr = new int[n];
        int[] ansArr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int leftProduct = 1;

        for (int i = 0; i < n; i++) {
            // 현재 인덱스로 추가
            ansArr[i] = leftProduct;

            //다음 인덱스에 추가할 것
            leftProduct *= arr[i];
        }

        int rightProduct = 1;

        for (int i = n - 1; i >= 0; i--) {
            ansArr[i] *= rightProduct;
            rightProduct *= arr[i];
        }

        for (int i = 0; i < n; i++) {
            bw.write(ansArr[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
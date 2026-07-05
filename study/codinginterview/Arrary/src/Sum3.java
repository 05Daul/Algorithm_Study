import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sum3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] intArr = new int[st.countTokens()];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(intArr);

        for (int i = 0; i < intArr.length - 2; i++) {
            if (i > 0 && intArr[i] == intArr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = intArr.length - 1;

            while (left < right) {
                int sum = intArr[i] + intArr[left] + intArr[right];

                if (sum == 0) {
                    bw.write(intArr[i] + " " + intArr[left] + " " + intArr[right]);
                    bw.newLine();

                    left++;
                    right--;

                    while (left < right && intArr[left] == intArr[left - 1]) {
                        left++;
                    }

                    while (left < right && intArr[right] == intArr[right + 1]) {
                        right--;
                    }

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
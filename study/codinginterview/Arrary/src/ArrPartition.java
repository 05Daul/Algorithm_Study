import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ArrPartition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        int[] arr = new int[st.countTokens()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        for (int i = 0; i < arr.length ; i++) {
            if(i%2 == 0){
                sum += arr[i];
            }
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();

    }
}

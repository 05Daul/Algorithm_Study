import java.io.*;
import java.util.StringTokenizer;

public class BestTimetoBuyAndSellStock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[st.countTokens()];
        int min = 0;
        int minArr =0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (i == 0) {
                min = arr[0];
            }
            if (i != 0 && min > arr[i]) {
                min = arr[i];
                minArr = i;
            }
        }

        for (int j = minArr; j<arr.length; j++){
            if(max< arr[j]){
                max = arr[j];
            }
        }
        bw.write("최댓 이익 : "+String.valueOf(max-min));
        bw.flush();
        bw.close();
    }
}

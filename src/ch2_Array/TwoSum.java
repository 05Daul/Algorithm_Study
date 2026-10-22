package ch2_Array;

import java.io.*;

public class TwoSum {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().trim().split("\\s+");

        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int target = Integer.parseInt(br.readLine());

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {

                    bw.write(i + " " + j);
                    bw.flush();

                    return;
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
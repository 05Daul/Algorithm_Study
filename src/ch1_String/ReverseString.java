package ch1_String;

import java.io.*;

public class ReverseString {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] arr = br.readLine().toCharArray();

        long start = System.nanoTime();

        reverseStr2(arr);

        long end = System.nanoTime();

        bw.write(arr);
        bw.newLine();
        bw.write("실행 시간: " + (end - start) + " ns");
        bw.flush();
    }

    public static void reverseStr1(char[] arrs) {

        char temp;

        for (int i = 0; i < arrs.length / 2; i++) {
            temp = arrs[i];
            arrs[i] = arrs[arrs.length - 1 - i];
            arrs[arrs.length - 1 - i] = temp;
        }
    }

    public static void reverseStr2(char[] arr) {
        int left = 0;
        int right = arr.length - 1;
        char temp = arr[left];

        while (left < right) {

            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}

package ch1_String;

import java.io.*;

public class LongestPalindromeSubString {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String ans = "";

        for (int i = 0; i < input.length(); i++) {

            // 홀수 길이 팰린드롬
            int left = i;
            int right = i;

            while (left >= 0 && right < input.length()
                    && input.charAt(left) == input.charAt(right)) {

                if (right - left + 1 > ans.length()) {
                    ans = input.substring(left, right + 1);
                }

                left--;
                right++;
            }

            // 짝수 길이 팰린드롬
            left = i;
            right = i + 1;

            while (left >= 0 && right < input.length()
                    && input.charAt(left) == input.charAt(right)) {

                if (right - left + 1 > ans.length()) {
                    ans = input.substring(left, right + 1);
                }

                left--;
                right++;
            }
        }

        bw.write(ans);
        bw.flush();

        bw.close();
        br.close();
    }
}
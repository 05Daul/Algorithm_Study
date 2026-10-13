package ch1_String;

import java.io.*;

public class ValidPalindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean isPalindrome = isPalindrome3(br);
        bw.write(isPalindrome + "\n");
        bw.flush();
        bw.close();
    }

    // 풀이1. 문자열 직접 비교
    private static boolean isIsPalindrome1(BufferedReader br) throws IOException {
        char[] arr = br.readLine().toLowerCase().replaceAll("[^a-z0-9]", "").toCharArray();
        // replace(a, b)	a를 문자 그대로 찾아서 b로 교체 , replaceAll(regex, b)	정규식에 맞는 모든 부분을 b로 교체

        boolean isPalindrome = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    // 풀이2. 문자 단위 추출
    private static boolean isPalindrome2(BufferedReader br) throws IOException {
        String str = br.readLine();
        int start = 0;
        int end = str.length()-1;
        boolean isPalindrome = true;

        while (start < end) {
            if (Character.toLowerCase(str.charAt(start)) == Character.toLowerCase(str.charAt(end))) {
                start++;
                end--;
            } else if (!Character.isLetterOrDigit(str.charAt(start))) {
                start++;
            } else if (!Character.isLetterOrDigit(str.charAt(end))) {
                end--;
            }else{
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    // 풀이3
    private static boolean isPalindrome3(BufferedReader br) throws IOException {
        String str = br.readLine();
        boolean isPalindrome = true;
        String rev = new StringBuilder(str).reverse().toString();

        if (!str.equals(rev)){
            isPalindrome = false;

        }

        return isPalindrome;
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestPalindromeSubstring {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    char[] arr = br.readLine().toCharArray();
    System.out.println(longestPalindromeSubstring(arr));
  }

  static String longestPalindromeSubstring(char[] str) {
    if (str.length == 0) {
      return "";
    }

    int start = 0;
    int maxLength = 1;

    for (int i = 0; i < str.length; i++) {
      int oddLength = expandFromCenter(str, i, i); // 홀수
      int evenLength = expandFromCenter(str, i, i + 1); //짝수

      int currentLength = Math.max(oddLength, evenLength);

      if (currentLength > maxLength) {
        maxLength = currentLength;
        start = i - (currentLength - 1) / 2;
      }
    }

    return new String(str, start, maxLength);
  }

  static int expandFromCenter(char[] str, int left, int right) {
    while (left >= 0 && right < str.length && str[left] == str[right]) {
      left--;
      right++;
    }

    return right - left - 1; //팰린드롬 길이를 반환


  }
}
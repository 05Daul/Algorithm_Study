import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class validPalindrome {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    long start1 = System.nanoTime();
    String result1 = validPalindrome(str);
    long end1 = System.nanoTime();

    long start2 = System.nanoTime();
    String result2 = validPalindrome2(str);
    long end2 = System.nanoTime();

    System.out.println("validPalindrome result = " + result1);
    System.out.println("validPalindrome time   = " + (end1 - start1) + " ns");

    System.out.println("validPalindrome2 result = " + result2);
    System.out.println("validPalindrome2 time   = " + (end2 - start2) + " ns");
  }

  static String validPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
      char leftChar = s.charAt(left);
      char rightChar = s.charAt(right);

      if (!Character.isLetterOrDigit(leftChar)) {
        left++;
      } else if (!Character.isLetterOrDigit(rightChar)) {
        right--;
      } else {
        if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
          return "FALSE";
        }
        left++;
        right--;
      }
    }
    return "TRUE";
  }
  static String validPalindrome2(String s) {
    String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    StringBuilder strRev = new StringBuilder(str).reverse();

    if (strRev.toString().equals(str)) {
      return "TRUE";
    } else {
      return "FALSE";
    }
  }
}
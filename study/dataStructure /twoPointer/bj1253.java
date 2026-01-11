package twoPointer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj1253 {

  public static void main(String[] args) throws IOException {
    /// 8. 좋은 수 구하기

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // 1. 첫 번째 수의 갯수를 입력받음
    int size = Integer.parseInt(br.readLine());
    // 2. 두 번째 수의 값을 입력받음
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(arr);

    int count = 0;

    /// 좋은 수란 n이란 수가 현재 같은 배열에 다른 두 수의 합으로 만들어 지는 수
    for (int i = 0; i < arr.length; i++) {
      int start = 0;
      int end = size - 1;
      int sum = arr[i];
      while (start < end) {
        if (start == i) {
          start++;
          continue;
        }
        if (end == i) {
          end--;
          continue;
        }

        if (arr[start] + arr[end] == sum) {
          count++;
          break;
        } else if (arr[start] + arr[end] > sum) {
          end--;
        } else {
          start++;
        }
      }
    }
    bw.write(String.valueOf(count));
    bw.flush();
  }
}

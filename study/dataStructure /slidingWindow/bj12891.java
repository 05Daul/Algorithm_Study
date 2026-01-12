package slidingWindow;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj12891 {

  /// DNA 비밀번호 s5
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // 1. 첫번째 문자열에서 DNA문자열 길이, 부분 문자열의 길이를 입력
    StringTokenizer st = new StringTokenizer(br.readLine());
    int size = Integer.parseInt(st.nextToken());
    int partSize = Integer.parseInt(st.nextToken());

    // 2. 두번째 문자열에서 DNA문자열을 입력
    char[] chars = br.readLine().toCharArray();

    // 3. 세번째 문자열에서 부분 문자열의 A,C,G,T의 최소 갯수
    st = new StringTokenizer(br.readLine());
    int[] minCount = new int[4]; // A, C, G, T 순서
    for (int i = 0; i < 4; i++) {
      minCount[i] = Integer.parseInt(st.nextToken());
    }

    // 현재 윈도우의 문자 개수
    int[] currentCount = new int[4];

    // 초기 윈도우 설정
    for (int i = 0; i < partSize; i++) {
      addChar(chars[i], currentCount);
    }

    int result = 0;
    if (isValid(currentCount, minCount)) {
      result++;
    }

    // 슬라이딩 윈도우
    for (int i = partSize; i < size; i++) {
      // 새로운 문자 추가 -> 윈도우 초기화 이후 부터 i시작(partSize)
      addChar(chars[i], currentCount);

      // 이전 문자 제거
      removeChar(chars[i - partSize], currentCount);

      if (isValid(currentCount, minCount)) {
        result++;
      }
    }

    bw.write(result + "\n");
    bw.flush();
  }

  private static void addChar(char c, int[] count) {
    switch (c) {
      case 'A':
        count[0]++;
        break;
      case 'C':
        count[1]++;
        break;
      case 'G':
        count[2]++;
        break;
      case 'T':
        count[3]++;
        break;
    }
  }

  private static void removeChar(char c, int[] count) {
    switch (c) {
      case 'A':
        count[0]--;
        break;
      case 'C':
        count[1]--;
        break;
      case 'G':
        count[2]--;
        break;
      case 'T':
        count[3]--;
        break;
    }
  }

  private static boolean isValid(int[] current, int[] min) {
    for (int i = 0; i < 4; i++) {
      if (current[i] < min[i]) {
        return false;
      }
    }
    return true;
  }
}
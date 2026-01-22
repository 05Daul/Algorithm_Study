package stack_queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class bj17298 {

  public static void main(String[] args) throws IOException {
    /// 12. 오큰수 구하기
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    // 1. 사이즈를 입력받음
    int size = Integer.parseInt(br.readLine());

    // 2. 수열에 해당하는 값을 입력받음.
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arr = new int[size];  // 수열 배열
    int[] AnsArr = new int[size]; // 정답 배열

    for (int i = 0; i < size; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    Stack<Integer> stack = new Stack<>();
    stack.push(0);

    for (int i = 1; i < size; i++) {
      while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
        AnsArr[stack.pop()] = arr[i];
      }
      stack.push(i);
    }

    while (!stack.isEmpty()) {
      AnsArr[stack.pop()] = -1;
    }

    for (int i = 0; i < size; i++) {
      bw.write(AnsArr[i] + " ");
    }
    bw.flush();

  }
}

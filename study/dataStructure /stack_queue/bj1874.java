package stack_queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class bj1874 {

  public static void main(String[] args) throws IOException {
    /// 11. 스택으로 수열 만들기
    // 첫 번째 줄에서 갯수를 입력받고
    // 두 번째 부터 해당 갯수에 대한 value를 입력받음
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int num = Integer.parseInt(br.readLine());
    int[] arr = new int[num];

    for (int i = 0; i < num; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    Stack<Integer> stack = new Stack<>();
    StringBuilder sb = new StringBuilder();

    int current = 1;
    boolean possible = true;

    for (int i = 0; i < num; i++) {
      int target = arr[i];

      while (current <= target) {
        stack.push(current++);
        sb.append("+\n");
      }

      if (stack.isEmpty() || stack.peek() != target) {
        possible = false;
        break;
      }

      stack.pop();
      sb.append("-\n");
    }

    if (possible) {
      bw.write(sb.toString());
    } else {
      bw.write("NO");
    }

    bw.flush();
  }
}

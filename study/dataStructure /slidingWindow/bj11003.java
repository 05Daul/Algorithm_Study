package slidingWindow;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class bj11003 {

  /// 최솟값 찾기 p0
  public static class Node {
    int val;
    int index;
    public Node(int index, int val) {
      this.index = index;
      this.val = val;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // 1. 첫번째 줄에서 숫자의 갯수, 슬라이딩 윈도우의 크기를 입력받음
    StringTokenizer st = new StringTokenizer(br.readLine());
    int size = Integer.parseInt(st.nextToken());
    int windowCount = Integer.parseInt(st.nextToken());

    // 2. 두번째 줄에서 숫자를 입력 받음.
    st = new StringTokenizer(br.readLine());
    Deque<Node> deque = new LinkedList<>();

    for (int i = 0; i < size; i++) {
      int nowNum = Integer.parseInt(st.nextToken());
      /// deque에 값이 비어있지 않고,현재값보다 마지막 값이 더 크면 마지막 값을 없애버리기 -> 정렬효과
      while (!deque.isEmpty() && nowNum < deque.getLast().val) {
        deque.removeLast();
      }
      deque.addLast(new Node(i, nowNum));
      /// 여기서 슬라이딩 윈도우 역할을 진행.
      if (deque.getFirst().index <= i - windowCount) {
        deque.removeFirst();
      }
      bw.write(deque.getFirst().val + " ");
    }
    bw.flush();
    bw.close();
  }
}

package stack_queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class bj2164 {

  public static void main(String[] args) throws IOException {
    // 1. N장의 카드를 입력받음
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int size = Integer.parseInt(br.readLine());

    Deque<Integer> deque = new LinkedList<>();
    for (int i = 1; i <= size; i++) {
      deque.add(i);
    }

    int num = 0;

    int ans = 0;

    while (deque.size() > 1) {
      deque.removeFirst();
      num = deque.removeFirst();
      deque.addLast(num);
    }
    ans = deque.removeFirst();

    bw.write(ans+"\n");
    bw.flush();
  }
}

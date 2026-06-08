import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class TrappingRainWater {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(reader.readLine());

    int n = st.countTokens();
    int[] height = new int[n];

    for (int i = 0; i < n; i++) {
      height[i] = Integer.parseInt(st.nextToken());
    }

    int vol = trap(height);

    writer.write(String.valueOf(vol));
    writer.flush();
    writer.close();
  }

  static int trap(int[] height) {
    int water = 0;

    Deque<Integer> stack = new ArrayDeque<>();

    for (int i = 0; i < height.length; i++) {
      while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
        int bottom = stack.pop();

        if (stack.isEmpty()) {
          break;
        }

        int left = stack.peek();

        int width = i - left - 1;
        int boundedHeight = Math.min(height[left], height[i]) - height[bottom];

        water += width * boundedHeight;
      }

      stack.push(i);
    }

    return water;
  }
}
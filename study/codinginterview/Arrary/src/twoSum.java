import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class twoSum {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().trim().split("\\s+");
    int target = Integer.parseInt(br.readLine().trim());

    int[] nums = new int[input.length];

    for (int i = 0; i < input.length; i++) {
      nums[i] = Integer.parseInt(input[i]);
    }

    int[] result = twoSum(nums, target);

    System.out.println(result[0] + " " + result[1]);
  }

  static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int need = target - nums[i];

      if (map.containsKey(need)) {
        return new int[]{map.get(need), i};
      }

      map.put(nums[i], i);
    }

    return new int[]{-1, -1};
  }
}
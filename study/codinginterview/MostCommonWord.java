import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine().toLowerCase().replaceAll("[^a-z]", " ");

    String[] words = input.split("\\s+");
    // \s+  → 공백 1개 이상
    Map<String, Integer> countMap = new HashMap<>();

    for (String word : words) {

      if (word.isEmpty()) {
        continue;
      }
      countMap.put(word, countMap.getOrDefault(word, 0) + 1);
      // Key로 get 없으면 default로 0. 아니면 +1
    }

    String banStr = br.readLine();
    countMap.put(banStr, 0);

    String mostCommon = "";

    int maxCount = 0;

    for (Map.Entry<String, Integer> entry : countMap.entrySet()) {

      if (entry.getValue() > maxCount) {
        mostCommon = entry.getKey();
        maxCount = entry.getValue();
      }
    }

    System.out.println("최대 단어 " + mostCommon);

    System.out.println("Count: " + maxCount);
  }
}

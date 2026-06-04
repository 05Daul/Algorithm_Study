import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine()
        .toLowerCase()
        .replaceAll("[^a-z\\s]", " ")
        .trim();

    String[] strs = input.split("\\s+");

    List<List<String>> result = groupAnagrams(strs);

    System.out.println(result);
  }

  public static List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();

    for (String str : strs) {
      char[] chars = str.toCharArray();

      Arrays.sort(chars);

      // 정렬된 Char 배열을 String 타입으로 key를 만듬.
      String key = new String(chars);

      if (!map.containsKey(key)) {
        map.put(key, new ArrayList<>());
      }

      map.get(key).add(str);
    }

    return new ArrayList<>(map.values());
  }
}
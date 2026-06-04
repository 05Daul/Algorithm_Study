import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReorderLogFiles {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    String[] logs = new String[n];

    for (int i = 0; i < n; i++) {
      logs[i] = br.readLine();
    }

    String[] result = reorderLogFiles(logs);

    for (String log : result) {
      System.out.println(log);
    }
  }

  public static String[] reorderLogFiles(String[] logs) {
    List<String> letterList = new ArrayList<>();
    List<String> digitList = new ArrayList<>();

    for (String log : logs) {
      String[] parts = log.split(" ", 2);

      if (Character.isDigit(parts[1].charAt(0))) {
        digitList.add(log);
      } else {
        letterList.add(log);
      }
    }

    Collections.sort(letterList, (s1, s2) -> {
      String[] s1Parts = s1.split(" ", 2);
      String[] s2Parts = s2.split(" ", 2);

      int contentCompare = s1Parts[1].compareTo(s2Parts[1]);

      if (contentCompare == 0) {
        return s1Parts[0].compareTo(s2Parts[0]);
      }

      return contentCompare;
    });

    List<String> answer = new ArrayList<>();
    answer.addAll(letterList);
    answer.addAll(digitList);

    return answer.toArray(new String[0]);
  }
}
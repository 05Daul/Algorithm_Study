package ch1_String;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String paragraph = br.readLine();
        String[] banned = br.readLine().trim().split("\\s+");
        //  \s 공백 문자 (스페이스, 탭, 줄바꿈 등, +는 한번 이상 반복

        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> ans = new HashMap<>();

        String[] words = paragraph.toLowerCase().split("[^a-z]+");

        String result = "";
        int maxCount = 0;

        for (String word : words) {
            if (word.isEmpty() || bannedSet.contains(word)) {
                continue;
            }

            int count = ans.getOrDefault(word, 0) + 1;
            ans.put(word, count);

            if (count > maxCount) {
                maxCount = count;
                result = word;
            }
        }

        bw.write(result);
        bw.newLine();
        bw.flush();
    }
}
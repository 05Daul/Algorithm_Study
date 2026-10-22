package ch1_String;

import java.io.*;
import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split("\\s+");

        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < str.length; i++) {

            char[] chars = str[i].toCharArray();

            Arrays.sort(chars);

            String key = new String(chars);

            map.putIfAbsent(key, new ArrayList<>());
            //    putIfAbsent : 키가 없을 때 새로운 리스트 생성

            map.get(key).add(str[i]);

        }

        bw.write(map.values().toString());
        bw.flush();
        bw.close();
        br.close();
    }
}

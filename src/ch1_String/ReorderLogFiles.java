package ch1_String;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ReorderLogFiles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), ",");

        List<String> letter = new ArrayList<>();
        List<String> digit = new ArrayList<>();

        while (st.hasMoreTokens()) {
            // hasMoreTokens()는 boolean이 반환값으로 token이 남아 있는 지 확인하는 용.
            String log = st.nextToken().trim();

            int space = log.indexOf(' ');
            char firstContent = log.charAt(space + 1);

            if (Character.isDigit(firstContent)) {
                digit.add(log);
            } else {
                letter.add(log);
            }
        }

        letter.sort((log1, log2) -> {
            int space1 = log1.indexOf(' ');
            int space2 = log2.indexOf(' ');

            String content1 = log1.substring(space1 + 1);
            String content2 = log2.substring(space2 + 1);

            // 먼저 내용을 비교
            int result = content1.compareTo(content2);

            if (result != 0) {
                return result;
            }

            // 내용이 같으면 식별자를 비교
            String id1 = log1.substring(0, space1);
            String id2 = log2.substring(0, space2);

            return id1.compareTo(id2);
        });

        // 숫자 로그는 정렬하지 않고 입력 순서대로 추가
        letter.addAll(digit);

        for (String log : letter) {
            bw.write(log);
            bw.newLine();
        }

        bw.flush();
    }
}

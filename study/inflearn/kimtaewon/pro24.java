import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class pro24 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());  // 학생 수
    int M = Integer.parseInt(st.nextToken());  // 시험 횟수

    int[][] rank = new int[M][N + 1];

    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 1; j <= N; j++) {
        int student = Integer.parseInt(st.nextToken());
        rank[i][student] = j;
      }
    }

    int answer = 0;

    // 모든 학생 쌍 확인
    for (int mentor = 1; mentor <= N; mentor++) {
      for (int mentee = 1; mentee <= N; mentee++) {

        if (mentor == mentee) continue;

        boolean possible = true;

        // 모든 시험에서 mentor가 mentee보다 앞서는지 확인
        for (int test = 0; test < M; test++) {
          if (rank[test][mentor] >= rank[test][mentee]) {
            possible = false;
            break;
          }
        }

        if (possible) answer++;
      }
    }

    bw.write(String.valueOf(answer));
    bw.flush();
    bw.close();
    br.close();
  }
}

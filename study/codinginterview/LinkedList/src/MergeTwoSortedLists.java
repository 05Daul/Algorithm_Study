import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class MergeTwoSortedLists {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList<Integer> ans = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            list1.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            list2.add(Integer.parseInt(st.nextToken()));
        }

        while (!list1.isEmpty() && !list2.isEmpty()) {
            if (list1.peek() <= list2.peek()) {
                ans.add(list1.poll());
            } else {
                ans.add(list2.poll());
            }
        }

        while (!list1.isEmpty()) {
            ans.add(list1.poll());
        }

        while (!list2.isEmpty()) {
            ans.add(list2.poll());
        }

        for (int num : ans) {
            bw.write(num + " ");
        }

        bw.flush();
        bw.close();
    }
}

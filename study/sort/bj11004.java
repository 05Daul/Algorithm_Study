import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj11004 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    int[] arr = new int[N];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    quickSort(arr, 0, N - 1);

    bw.write(arr[K - 1]+"");
    bw.flush();
  }

  private static void quickSort(int[] arr, int left, int right) {
    // 더 이상 나눌 수 없으면 종료
    if (left >= right) {
      return;
    }

    int pivotIndex = partition(arr, left, right);

    // 왼쪽 부분 집합 정렬
    if (left < pivotIndex - 1) {
      quickSort(arr, left, pivotIndex - 1);
    }
    // 오른쪽 부분 집합 정렬
    if (pivotIndex < right) {
      quickSort(arr, pivotIndex, right);
    }
  }

  private static int partition(int[] arr, int left, int right) {
    // 피벗 선택: 중간에 있는 값을 선택 (최악의 경우 방지용)
    int pivot = arr[(left + right) / 2];

    while (left <= right) {
      // 1. 왼쪽에서 피벗보다 크거나 같은 값을 찾을 때까지 오른쪽으로 이동
      while (arr[left] < pivot) {
        left++;
      }
      // 2. 오른쪽에서 피벗보다 작거나 같은 값을 찾을 때까지 왼쪽으로 이동
      while (arr[right] > pivot) {
        right--;
      }

      if (left <= right) {
        swap(arr, left, right);
        left++;
        right--;
      }
    }
    return left;
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
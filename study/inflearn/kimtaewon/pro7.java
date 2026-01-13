import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pro7 {

  public static void main(String[] args) throws IOException {

    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter stdout = new BufferedWriter(new OutputStreamWriter(System.out));

    char [] arr= stdin.readLine().toLowerCase().toCharArray();

    int start = 0;
    int end = arr.length-1;

    for(int i=0; i<arr.length/2; i++){
      if(arr[start]==arr[end]){
        start++;
        end--;
      }else if(arr[start]!=arr[end]){
        stdout.write("NO");
        stdout.flush();
        return;
      }
    }
    stdout.write("YES");
    stdout.flush();
    stdout.close();
  }
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj1427 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String str = br.readLine();
    int [] arr= new int[str.length()];
    for(int i=0; i<str.length(); i++){
      arr[i]=Integer.parseInt(str.substring(i,i+1)); // i부터~ i+1전까지
    }

    for(int i=0; i<arr.length; i++){
      int max = i;
      for(int j=i+1; j<arr.length; j++){
        if(arr[j]>arr[max]){
          max = j;
        }
      }
      if(arr[i]<arr[max]){
        int temp = arr[i];
        arr[i] = arr[max];
        arr[max] = temp;
      }
    }
    for(int i=0; i<arr.length; i++){
      bw.write(arr[i]+'0');
    }
    bw.flush();
  }
}

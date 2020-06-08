import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_11720 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int total = 0;
    int n = Integer.parseInt(br.readLine());
    String numbers = br.readLine();
    for (int i = 0; i < n; i++) {
      total += Integer.parseInt(String.valueOf(numbers.charAt(i)));
    }

    System.out.println(total);
    
    br.close();
  }
}
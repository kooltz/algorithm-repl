import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Baekjoon_1065 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int total = 0;
    int x = Integer.parseInt(br.readLine());
    for (int i = 1; i <= x; i++) {
      int n = i;
      boolean isDiff = false;
      
      int lastN = -1;
      int lastDiff = -10;
      int cnt = 1;
      while(n != 0) {
        int m = n % 10;
        int diff = lastN - m;
        if (cnt > 2 && diff != lastDiff) {
          isDiff = true;
        }

        lastN = m;
        lastDiff = diff;
        n /= 10;
        cnt++;
      }
      if (!isDiff) {
        total++;
      }
    }
    
    System.out.println(total);
    br.close();
  }
}
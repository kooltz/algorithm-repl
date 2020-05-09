import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Baekjoon_1152 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int count = 0;
    String word = br.readLine().trim();
    if (word.length() > 0) {
      count = word.split(" ").length;
    }   
    System.out.println(count);
    
    br.close();
  }
}
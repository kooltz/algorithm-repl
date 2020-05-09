import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2098 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    System.out.println(Math.max(convert(st.nextToken()), convert(st.nextToken())));
    
    br.close();
  }

  public static int convert(String s) {
    StringBuilder sb = new StringBuilder();
    sb.append(s.charAt(2)).append(s.charAt(1)).append(s.charAt(0));
    return Integer.parseInt(sb.toString());
  }
}
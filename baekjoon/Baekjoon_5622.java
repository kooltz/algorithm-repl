import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_5622 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String dial = br.readLine();
    int t = dial.length();
    for (int i = 0; i < dial.length(); i++) {
      t += getNumber(dial.charAt(i));
    }

    System.out.println(t);
    br.close();
  }

  public static int getNumber(char c) {
    if (c == 'A' || c == 'B' || c == 'C') return 2;
    else if (c == 'D' || c == 'E' || c == 'F') return 3;
    else if (c == 'G' || c == 'H' || c == 'I') return 4;
    else if (c == 'J' || c == 'K' || c == 'L') return 5;
    else if (c == 'M' || c == 'N' || c == 'O') return 6;
    else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') return 7;
    else if (c == 'T' || c == 'U' || c == 'V') return 8;
    else if (c == 'W' || c == 'X' || c == 'Y' || c == 'Z') return 9;

    return 0;
  }
}